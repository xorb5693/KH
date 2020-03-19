package kh.java.controller;

import java.sql.Connection;
import java.util.ArrayList;

import common.JDBCTemplate;
import kh.java.member.model.dao.MemberDao;
import kh.java.member.model.vo.Member;
import kh.java.member.view.MemberView;

public class MemberController {

	MemberView view = new MemberView();
	private static final String ipAddress = "127.0.0.1";

	public void main() {
		while (true) {
			int sel = view.mainMenu();

			switch (sel) {
			case 1:
				printAllMember();
				break;
			case 2:
				searchId();
				break;
			case 3:
				searchName();
				break;
			case 4:
				insertMember();
				break;
			case 5:
				modifyMember();
				break;
			case 6:
				deleteMember();
				break;
			case 0:
				return;
			}

			delay();
		}
	}

	public void printAllMember() {

		MemberDao dao = new MemberDao();
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		ArrayList<Member> members = dao.printAllMember(conn);
		
		JDBCTemplate.close(conn);
		view.printAllMember(members);
	}

	public void searchId() {

		view.printMsg("\n===== 회원 아이디 검색 =====");
		String memberId = view.searchId("검색");

		MemberDao dao = new MemberDao();
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		Member member = dao.searchId(memberId, conn);

		JDBCTemplate.close(conn);
		view.searchIdPrint(member);
	}

	public void searchName() {

		view.printMsg("\n===== 회원 이름 검색 =====");
		String memberName = view.searchName();

		MemberDao dao = new MemberDao();
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		ArrayList<Member> members = dao.searchName(memberName, conn);

		JDBCTemplate.close(conn);
		view.searchNamePrint(members);
	}

	public void insertMember() {

		view.printMsg("\n===== 회원 가입 =====");
		MemberDao dao = new MemberDao();
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		String memberId = view.searchId("가입");
		Member mem = dao.searchId(memberId, conn);

		if (mem != null) {
			view.printMsg("중복된 회원이 존재합니다.");
		} else {
			Member m = view.insertMember(memberId);
			int result = dao.insertMember(m, conn);

			if (result > 0) {
				view.printMsg("회원 가입에 성공하셨습니다.");
				JDBCTemplate.commit(conn);
			} else {
				view.printMsg("회원 가입에 실패하였습니다.");
				JDBCTemplate.rollback(conn);
			}
		}
		
		JDBCTemplate.close(conn);
	}

	public void modifyMember() {

		view.printMsg("\n===== 정보 수정 =====");
		String memberId = view.searchId("수정");
		MemberDao dao = new MemberDao();
		Connection conn = JDBCTemplate.getConnection(ipAddress);

		Member mem = dao.searchId(memberId, conn);

		if (mem == null) {
			System.out.println("해당 회원이 존재하지 않습니다.");
		} else {

			Member m = view.modifyMember(memberId);
			int result = dao.modifyMember(m, conn);

			if (result > 0) {
				view.printMsg("회원 정보가 수정되었습니다.");
				JDBCTemplate.commit(conn);
			} else {
				view.printMsg("회원 정보 수정에 실패하였습니다.");
				JDBCTemplate.rollback(conn);
			}
		}
		
		JDBCTemplate.close(conn);
	}

	public void deleteMember() {

		view.printMsg("\n===== 회원 삭제 =====");
		String memberId = view.searchId("삭제");
		MemberDao dao = new MemberDao();
		// 트랜잭션 작업을 위해서 Connection을 생성
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		Member m = dao.searchId(memberId, conn);

		if (m == null) {
			view.printMsg("해당 회원이 존재하지 않습니다.");
		} else {
			char ch = view.deleteMember(memberId);

			if (ch == 'y') {
				// MEMBER 테이블에서 해당하는 ROW를 삭제
				int result = dao.deleteMember(memberId, conn);

				// DEL_MEMBER 테이블에 추가
				int result2 = dao.insertDelMember(memberId, conn);

				if (result > 0 && result2 > 0) {
					view.printMsg("회원을 삭제하였습니다.");
					JDBCTemplate.commit(conn);
					
				} else {
					view.printMsg("회원 삭제에 실패하였습니다.");
					JDBCTemplate.rollback(conn);
				}

			} else {
				System.out.println("회원 삭제를 취소하셨습니다.");
			}
		}

		JDBCTemplate.close(conn);
	}

	public void delay() {

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
