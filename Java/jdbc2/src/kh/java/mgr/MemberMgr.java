package kh.java.mgr;

import java.util.ArrayList;
import java.util.Scanner;

import kh.java.DB.DBConnect;
import kh.java.DB.Member;

public class MemberMgr {

	Scanner sc = new Scanner(System.in);

	public void main() {

		while (true) {
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

			switch (sel) {
			case 1:
				allPrintMember();
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

	public void allPrintMember() {

		System.out.println("\n===== 회원 전체 출력 =====");
		System.out.println("아이디\t패스워드\t이름\t성별\t나이\t전화번호\t\t취미\t가입일");

		DBConnect db = new DBConnect();
		ArrayList<Member> members = db.allPrintMember();

		for (Member m : members) {
			System.out.println(m);
		}
	}

	public void searchId() {

		System.out.println("\n===== 회원 아이디 검색 =====");
		System.out.print("검색할 아이디 입력 : ");
		String memberId = sc.next();

		DBConnect db = new DBConnect();
		Member member = db.searchId(memberId);

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

		DBConnect db = new DBConnect();
		ArrayList<Member> members = db.searchName(memberName);

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

	public void insertMember() {
		
		System.out.println("\n===== 회원 가입 =====");
		
		DBConnect db = new DBConnect();
		
		System.out.print("아이디 입력 : ");
		String memberId = sc.next();
		Member m = db.searchId(memberId);
		
		if (m == null) {
			
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
						
			Member member = new Member(memberId, memberPw, memberName, gender, age, phone, hobby, null);
			
			int result = db.insertMember(member);
			
			if (result > 0) {
				System.out.println("회원 가입에 성공하셨습니다.");
			} else {
				System.out.println("회원 가입에 실패하였습니다.");
			}
			
		} else {
			System.out.println("중복된 사용자가 존재합니다.");
		}
	}

	public void modifyMember() {
		System.out.println("\n===== 정보 수정 =====");
		Member m = new Member();
		DBConnect db = new DBConnect();

		System.out.print("아이디 입력 : ");
		String memberId = sc.next();
		Member mem = db.searchId(memberId);

		if (mem == null) {
			System.out.println("해당 회원이 존재하지 않습니다.");
		} else {
			m.setMemberId(memberId);

			System.out.print("비밀번호 입력 : ");
			String memberPw = sc.next();
			m.setMemberPw(memberPw);

			System.out.print("전화번호 입력(010-0000-0000) : ");
			String phone = sc.next();
			m.setPhone(phone);

			System.out.print("취미 입력 : ");
			String hobby = sc.next();
			m.setHobby(hobby);

			int result = db.modifyMember(m);

			if (result > 0) {
				System.out.println("회원 정보가 수정되었습니다.");
			} else {
				System.out.println("회원 정보 수정에 실패하였습니다.");
			}
		}
	}

	public void deleteMember() {
		
		System.out.println("\n===== 회원 삭제 =====");
		System.out.print("삭제할 아이디 입력 : ");
		String memberId = sc.next();
		
		DBConnect db = new DBConnect();
		Member m = db.searchId(memberId);
		
		if (m == null) {
			System.out.println("해당 회원이 존재하지 않습니다.");
		} else {
			System.out.print("정말로 삭제하시겠습니까?[y/n] : ");
			char ch = sc.next().charAt(0);
			
			if (ch == 'y') {
				int result = db.deleteMember(memberId);
				
				if (result > 0) {
					System.out.println("회원을 삭제하였습니다.");
				} else {
					System.out.println("회원 삭제에 실패하였습니다.");
				}
			} else {
				System.out.println("회원 삭제를 취소하셨습니다.");
			}
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
