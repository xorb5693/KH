package kh.exam.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import common.JDBCTemplate;
import kh.exam.model.dao.ExamDao;
import kh.exam.model.vo.Board;
import kh.exam.model.vo.Member;
import kh.exam.view.ExamView;

public class ExamController {

	private static final String ipAddress = "127.0.0.1";
	Member loginMember;
	ExamView view = new ExamView();

	public void main() {

		while (true) {
			try {
				int sel = view.mainView();

				switch (sel) {
				case 1:
					login();
					break;
				case 2:
					insertMember();
					break;
				case 3:
					searchMember();
					break;
				case 0:
					return;
				default:
					System.out.println("0~3사이의 숫자를 입력하세요.");
				}

			} catch (NumberFormatException e) {
				System.err.println("숫자를 입력하세요.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				delay();
			}
		}
	}

	public void insertMember() throws IOException {

		view.printMsg("\n---------- 회원가입 -----------");
		String memberId = view.searchId();
		ExamDao dao = new ExamDao();
		Connection conn = JDBCTemplate.getConecction(ipAddress);
		Member mem = dao.idSearch(conn, memberId);

		if (mem == null) {
			Member m = view.insertMember(memberId);
			int result = dao.insertMember(conn, m);

			if (result > 0) {
				view.printMsg("회원가입 성공");
				JDBCTemplate.commit(conn);
			} else {
				view.printMsg("회원가입 실패");
				JDBCTemplate.rollback(conn);
			}
		} else {
			view.printMsg("중복된 회원이 존재합니다. 회원가입 실패");
			JDBCTemplate.rollback(conn);
		}

		JDBCTemplate.close(conn);
	}

	public void searchMember() throws IOException {

		view.printMsg("\n---------- 아이디 찾기 ---------");
		Member m = view.searchMember();

		Connection conn = JDBCTemplate.getConecction(ipAddress);
		ExamDao dao = new ExamDao();

		String memberId = dao.searchMember(conn, m);

		if (memberId == null) {
			view.printMsg("일치하는 정보가 없습니다.");
		} else {
			view.printMsg("아이디는 [" + memberId + "] 입니다.");
		}

		JDBCTemplate.close(conn);
	}

	public void login() throws IOException {

		Member m = view.login();
		Connection conn = JDBCTemplate.getConecction(ipAddress);

		ExamDao dao = new ExamDao();
		Member member = dao.login(conn, m);
		JDBCTemplate.close(conn);

		if (member == null) {
			view.printMsg("아이디 또는 비밀번호를 확인하세요.");
		} else {
			loginMember = member;
			view.printMsg("로그인 성공!!");
			delay();
			loginMain();
		}

	}

	public void loginMain() {

		while (true) {
			try {
				int sel = view.loginMain();

				switch (sel) {
				case 1:
					getBoardList();
					break;
				case 2:
					readBoard();
					break;
				case 3:
					insertBoard();
					break;
				case 4:
					modifyBoard();
					break;
				case 5:
					deleteBoard();
					break;
				case 6:
					view.printLoginInfo(loginMember);
					break;
				case 7:
					modifyLoginMember();
					break;
				case 8:
					deleteLoginMember();
					if (loginMember == null) {
						view.printMsg("Bye~Bye~");
						return;
					} else {
						break;
					}
				case 0:
					view.printMsg("Bye~Bye~");
					return;
				default:
					System.out.println("0~8사이의 숫자를 입력하세요.");
				}

			} catch (NumberFormatException e) {
				System.err.println("숫자를 입력하세요.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				delay();
			}
		}
	}

	public void getBoardList() {

		ExamDao dao = new ExamDao();
		Connection conn = JDBCTemplate.getConecction(ipAddress);
		ArrayList<Board> boards = dao.getBoardList(conn);
		view.getBoardList(boards);

		JDBCTemplate.close(conn);

	}

	public void readBoard() throws NumberFormatException, IOException {

		ExamDao dao = new ExamDao();
		int boardNo = view.getBoardNum();
		Connection conn = JDBCTemplate.getConecction(ipAddress);

		int result = dao.plusReadCount(conn, boardNo);

		if (result > 0) {
			JDBCTemplate.commit(conn);
			Board board = dao.readBoard(conn, boardNo);
			view.readBoard(board);
		} else {
			view.printMsg("게시물 번호를 확인하세요.");
		}

		JDBCTemplate.close(conn);

	}

	public void insertBoard() throws IOException {

		Board board = view.insertBoard();
		board.setBoardWriter(loginMember.getMemberId());
		ExamDao dao = new ExamDao();
		Connection conn = JDBCTemplate.getConecction(ipAddress);

		int result = dao.insertBoard(conn, board);

		if (result > 0) {
			view.printMsg("게시글 등록 성공!!");
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}

		JDBCTemplate.close(conn);
	}

	public void modifyBoard() throws NumberFormatException, IOException {

		int boardNo = view.getBoardNum();
		ExamDao dao = new ExamDao();
		Connection conn = JDBCTemplate.getConecction(ipAddress);

		Board board = dao.readMyBoard(conn, boardNo, loginMember.getMemberId());

		if (board == null) {
			view.printMsg("작성자만 수정이 가능합니다.");
		} else {
			Board board2 = view.insertBoard();
			board.setBoardTitle(board2.getBoardTitle());
			board.setBoardContent(board2.getBoardContent());

			int result = dao.modifyBoard(conn, board);

			if (result > 0) {
				view.printMsg("게시글 수정 성공!!");
				JDBCTemplate.commit(conn);
			} else {
				view.printMsg("게시글 수정 실패");
				JDBCTemplate.rollback(conn);
			}
		}

		JDBCTemplate.close(conn);

	}

	public void deleteBoard() throws NumberFormatException, IOException {

		int boardNo = view.getBoardNum();
		ExamDao dao = new ExamDao();
		Connection conn = JDBCTemplate.getConecction(ipAddress);

		Board board = dao.readMyBoard(conn, boardNo, loginMember.getMemberId());

		if (board == null) {
			view.printMsg("작성자만 삭제가 가능합니다.");
		} else {

			int result = dao.deleteBoard(conn, boardNo);

			if (result > 0) {
				view.printMsg("게시글 삭제 성공!!");
				JDBCTemplate.commit(conn);
			} else {
				view.printMsg("게시글 삭제 실패");
				JDBCTemplate.rollback(conn);
			}
		}

		JDBCTemplate.close(conn);
	}

	public void modifyLoginMember() throws IOException {

		Member m = view.modifyLoginMember(loginMember.getMemberId());

		ExamDao dao = new ExamDao();
		Connection conn = JDBCTemplate.getConecction(ipAddress);

		int result = dao.modifyMember(conn, m);

		if (result > 0) {
			view.printMsg("정보 수정 성공");
			JDBCTemplate.commit(conn);
			loginMember.setMemberPw(m.getMemberPw());
			loginMember.setPhone(m.getPhone());
		} else {
			view.printMsg("정보 수정 실패");
			JDBCTemplate.rollback(conn);
		}

		JDBCTemplate.close(conn);
	}

	public void deleteLoginMember() throws NumberFormatException, IOException {

		int deleteSel = view.deleteLoginMember();

		if (deleteSel == 1) {
			ExamDao dao = new ExamDao();
			Connection conn = JDBCTemplate.getConecction(ipAddress);
			int result = dao.deleteMember(conn, loginMember);

			if (result > 0) {
				JDBCTemplate.commit(conn);
				loginMember = null;
			} else {
				JDBCTemplate.rollback(conn);
			}

			JDBCTemplate.close(conn);
		}

	}

	public void delay() {

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
