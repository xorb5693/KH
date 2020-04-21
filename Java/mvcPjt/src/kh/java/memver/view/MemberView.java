package kh.java.memver.view;

import java.util.ArrayList;
import java.util.Scanner;

import kh.java.member.model.vo.Member;

public class MemberView {
	
	Scanner sc = new Scanner(System.in);
	
	public int mainMenu() {
		
		System.out.println("\n===== 회원관리 =====");
		System.out.println("1. 회원 전체 조회");
		System.out.println("2. 회원 1명 조회");
		System.out.println("3. 회원 등록");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 회원 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
		int sel = sc.nextInt();
		return sel;
	}
	
	public void printMsg(String msg) {
		System.out.println(msg);
	}

	public void printAllMember(ArrayList<Member> arr) {
		
		System.out.println("\n===== 회원 전체 조회 =====");
		System.out.println("아이디\t패스워드\t이름\t성별\t나이\t전화번호\t\t취미\t가입일");
		
		for (Member m : arr) {
			System.out.println(m);
		}
	}

	public String getName() {

		System.out.println("\n===== 회원 1명 조회 =====");
		System.out.print("검색할 이름을 입력하세요 : ");
		String memberName = sc.next();
		
		return memberName;
	}

	public Member insertMember() {

		System.out.println("\n===== 회원 등록 =====");
		System.out.print("아이디 입력 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 입력 : ");
		String memberPw = sc.next();
		
		System.out.print("이름 입력 : ");
		String memberName = sc.next();
		
		System.out.print("성별 입력[M/F] : ");
		String gender = sc.next();
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.print("전화번호 입력[000-0000-0000] : ");
		String phone = sc.next();
		
		System.out.print("취미 입력 : ");
		String hobby = sc.next();
		
		Member m = new Member(memberId, memberPw, memberName, gender, age, phone, hobby, null);
		
		return m;
	}

	public void printOneMember(ArrayList<Member> arr) {

		for (Member m : arr) {
			System.out.println("\n=================");
			System.out.println("아이디 : " + m.getMemberId());
			System.out.println("비밀번호 : " + m.getMemberPw());
			System.out.println("이름 : " + m.getMemberName());
			System.out.println("성별 : " + m.getGender());
			System.out.println("나이 : " + m.getAge());
			System.out.println("전화번호 : " + m.getPhone());
			System.out.println("취미 : " + m.getHobby());
			System.out.println("가입일 : " + m.getEnrollDate());
		}
	}

	public String getId(String msg) {
		System.out.println("\n===== 회원 정보 " + msg + " =====");
		System.out.print(msg + "할 회원의 아이디 입력 : ");
		String memberId = sc.next();
		return memberId;
	}

	public Member modifyMember(String memberId) {
		
		Member m = new Member();
		m.setMemberId(memberId);
		
		System.out.print("수정할 이름 입력 : ");
		m.setMemberName(sc.next());
		
		System.out.print("수정할 나이를 입력 : ");
		m.setAge(sc.nextInt());
		
		System.out.print("수정할 취미를 입력 : ");
		m.setHobby(sc.next());
		
		return m;
	}

	public char request() {
		
		System.out.print("해당 회원을 삭제하시겠습니까?[y/n] : ");
		char ch = sc.next().charAt(0);
		
		return ch;
	}
}
