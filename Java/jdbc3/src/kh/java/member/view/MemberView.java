package kh.java.member.view;

import java.util.ArrayList;
import java.util.Scanner;

import kh.java.controller.MemberController;
import kh.java.member.model.vo.Member;

public class MemberView {
	
	Scanner sc = new Scanner(System.in);
	MemberController con = null;
	
	public MemberView() {
		
	}
	
	public MemberView(MemberController con) {
		this.con = con;
	}

	public int mainMenu() {
		
		System.out.println("\n===== 회원 관리 프로그램 =====");
		System.out.println("1. 회원 전체 출력");
		System.out.println("2. 회원 아이디 검색");
		System.out.println("3. 회원 이름으로 검색");
		System.out.println("4. 회원 가입");
		System.out.println("5. 정보 수정");
		System.out.println("6. 회원 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
		int sel = sc.nextInt();
		
		return sel;
	}
	
	public void printAllMember(ArrayList<Member> members) {
		
		System.out.println("\n===== 회원 전체 출력 =====");
		System.out.println("아이디\t패스워드\t이름\t성별\t나이\t전화번호\t\t취미\t가입일");

		for (Member m : members) {
			System.out.println(m);
		}
	}
	
	public void searchId() {
		
		System.out.println("\n===== 회원 아이디 검색 =====");
		System.out.print("검색할 아이디 입력 : ");
		String memberId = sc.next();
		Member member = con.searchId(memberId);
		
		if (member == null) {
			System.out.println("해당 회원이 존재하지 않습니다.");
		} else {
			System.out.println("아이디 : " + member.getMemberId());
			System.out.println("비밀번호 : " + member.getMemberPw());
			System.out.println("이름 : " + member.getMemberName());
			System.out.println("성별 : " + member.getGender());
			System.out.println("나이 : " + member.getAge());
			System.out.println("전화번호 : " + member.getPhone());
			System.out.println("취미 : " + member.getHobby());
			System.out.println("가입일 : " + member.getEnrollDate());
		}
	}
	
	public void searchName() {
		System.out.println("\n===== 회원 이름 검색 =====");
		System.out.print("검색할 이름 입력 : ");
		String memberName = sc.next();

		ArrayList<Member> members = con.searchName(memberName);

		if (members.isEmpty()) {
			System.out.println("해당 회원이 존재하지 않습니다.");
		} else {
			for (Member member : members) {
				System.out.println("\n----- 회원 정보 -----");
				System.out.println("아이디 : " + member.getMemberId());
				System.out.println("비밀번호 : " + member.getMemberPw());
				System.out.println("이름 : " + member.getMemberName());
				System.out.println("성별 : " + member.getGender());
				System.out.println("나이 : " + member.getAge());
				System.out.println("전화번호 : " + member.getPhone());
				System.out.println("취미 : " + member.getHobby());
				System.out.println("가입일 : " + member.getEnrollDate());
			}
		}
	}
	
	public Member insertMember() {
		
		Member m = null;
		
		System.out.print("아이디 입력 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 입력 : ");
		String memberPw = sc.next();
		
		System.out.print("이름 입력 : ");
		String memberName = sc.next();
		
		System.out.print("성별 입력(M/F) : ");
		String gender = sc.next();
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.print("전화번호 입력(010-0000-0000) : ");
		String phone = sc.next();
		
		System.out.print("취미 입력 : ");
		String hobby = sc.next();
					
		m = new Member(memberId, memberPw, memberName, gender, age, phone, hobby, null);
		
		return m;
	}
	
	public Member modifyMember() {
		
		System.out.println("\n===== 정보 수정 =====");
		Member member = new Member();

		System.out.print("아이디 입력 : ");
		String memberId = sc.next();
		Member mem = con.searchId(memberId);

		if (mem == null) {
			System.out.println("해당 회원이 존재하지 않습니다.");
		} else {
			member.setMemberId(memberId);

			System.out.print("비밀번호 입력 : ");
			String memberPw = sc.next();
			member.setMemberPw(memberPw);

			System.out.print("전화번호 입력(010-0000-0000) : ");
			String phone = sc.next();
			member.setPhone(phone);

			System.out.print("취미 입력 : ");
			String hobby = sc.next();
			member.setHobby(hobby);

		}
		
		return member;
	}
	
	public String deleteMember() {
		System.out.println("\n===== 회원 삭제 =====");
		System.out.print("삭제할 아이디 입력 : ");
		String memberId = sc.next();
		
		Member m = con.searchId(memberId);
		
		if (m == null) {
			System.out.println("해당 회원이 존재하지 않습니다.");
		} else {
			System.out.print("정말로 삭제하시겠습니까?[y/n] : ");
			char ch = sc.next().charAt(0);
			
			if (ch == 'y') {
				return m.getMemberId();
			} else {
				System.out.println("회원 삭제를 취소하셨습니다.");
			}
		}

		return null;
	}
	
	public void printMsg(String msg) {
		
		System.out.println(msg);
	}
}
