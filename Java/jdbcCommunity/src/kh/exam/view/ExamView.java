package kh.exam.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import kh.exam.model.vo.Board;
import kh.exam.model.vo.Member;

public class ExamView {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public int mainView() throws NumberFormatException, IOException {
		
		System.out.println("\n---------- KH커뮤니티 ----------");
		System.out.println("1. 로그인하기");
		System.out.println("2. 회원가입");
		System.out.println("3. 아이디 찾기");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
		int sel = Integer.parseInt(br.readLine());
		
		return sel;
	}
	
	public String searchId() throws IOException {
		
		System.out.print("ID 입력 : ");
		String memberId = br.readLine();
		
		return memberId;
	}
	
	public Member insertMember(String memberId) throws IOException {
		
		System.out.print("PW 입력 : ");
		String memberPw = br.readLine();
		
		System.out.print("이름 입력 : ");
		String memberName = br.readLine();
		
		System.out.print("전화번호 입력(ex.01011112222) : ");
		String phone = br.readLine();
		
		Member m = new Member(0, memberId, memberPw, memberName, phone);
		
		return m;
	}
	
	public Member searchMember() throws IOException {
		
		Member m = new Member();
		
		System.out.print("이릅 입력 : ");
		String memberName = br.readLine();
		
		System.out.print("전화번호 입력 : ");
		StringBuffer phone = new StringBuffer(); 
		phone.append(br.readLine());
		int length = 11 - phone.length();
		for (int i = 0; i < length; i++) {
			phone.append(" ");
		}
		
		m.setMemberName(memberName);
		m.setPhone(phone.toString());
		
		return m;
	}
	
	public Member login() throws IOException {
		
		Member m = new Member();
		
		String memberId = searchId();
		
		System.out.print("PW 입력 : ");
		String memberPw = br.readLine();
		
		m.setMemberId(memberId);
		m.setMemberPw(memberPw);
		
		return m;
	}
	
	public int loginMain() throws NumberFormatException, IOException {
		
		System.out.println("\n---------- KH커뮤니티 ----------");
		System.out.println("1. 게시물 목록 보기");
		System.out.println("2. 게시물 상세 보기");
		System.out.println("3. 게시물 등록");
		System.out.println("4. 게시물 수정");
		System.out.println("5. 게시물 삭제");
		System.out.println("6. 내 정보 보기");
		System.out.println("7. 내 정보 변경");
		System.out.println("8. 회원 탈퇴");
		System.out.println("0. 로그아웃");
		System.out.print("선택 > ");
		int sel = Integer.parseInt(br.readLine());
		
		return sel;
	}
	
	public void getBoardList(ArrayList<Board> boards) {
		
		System.out.println("\n---------- 게시물 목록 ----------");
		
		for (Board board : boards) {
			System.out.println(board);
		}
	}
	
	public int getBoardNum() throws NumberFormatException, IOException {
		
		System.out.print("게시물 번호 입력 : ");
		int sel = Integer.parseInt(br.readLine());
		
		return sel;
	}
	
	public void readBoard(Board board) {
		
		System.out.println("\n---------- 게시글 정보 ----------");
		System.out.println("게시물 번호 : " + board.getBoardNo());
		System.out.println("게시물 제목 : " + board.getBoardTitle());
		System.out.println("게시물 내용 : " + board.getBoardContent());
		System.out.println("게시물 작성자 : " + board.getBoardWriter());
		System.out.println("게시물 조회수 : " + board.getReadCount());
		System.out.println("게시물 작성일 : " + board.getWriteDate());
	}
	
	public Board insertBoard() throws IOException {
		
		Board board = new Board();
		System.out.print("제목 입력 : ");
		board.setBoardTitle(br.readLine());
		System.out.print("내용 입력 : ");
		board.setBoardContent(br.readLine());

		return board;
	}
	
	public void printLoginInfo(Member m) {
		
		System.out.println("\n---------- 내 정보 보기 ----------");
		System.out.println("회원번호 : " + m.getMemberNo());
		System.out.println("아이디 : " + m.getMemberId());
		System.out.println("비밀번호 : " + m.getMemberPw());
		System.out.println("이름 : " + m.getMemberName());
		System.out.println("전화번호 : " + m.getPhone());
	}
	
	public Member modifyLoginMember(String memberId) throws IOException {
		
		Member m = new Member();
		m.setMemberId(memberId);
		System.out.println("\n---------- 내 정보 수정 ----------");
		System.out.print("PW 입력 : ");
		String memberPw = br.readLine();
		m.setMemberPw(memberPw);
				
		System.out.print("전화번호 입력(ex.01011112222) : ");
		String phone = br.readLine();
		m.setPhone(phone);
		
		return m;
	}
	
	public int deleteLoginMember() throws NumberFormatException, IOException {
		
		System.out.print("정말 탈퇴하시겠습니까(1. YES / 2. NO)? : ");
		int check = Integer.parseInt(br.readLine());
		
		return check;
	}
	
	public void printMsg(String msg) {
		System.out.println(msg);
	}
}
