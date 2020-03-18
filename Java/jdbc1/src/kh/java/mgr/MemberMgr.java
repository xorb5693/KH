package kh.java.mgr;

import java.util.ArrayList;
import java.util.Scanner;

import kh.java.DB.DBConnect;
import kh.java.DB.Member;

public class MemberMgr {

	Scanner sc = new Scanner(System.in);

	public void main() {

		while (true) {
			System.out.println("\n===== 회원관리 프로그램 =====");
			System.out.println("1. 회원 전체 정보 조회"); // select
			System.out.println("2. 회원 아이디로 조회"); // select
			System.out.println("3. 회원 이름으로 조회"); // select
			System.out.println("4. 회원 가입"); // insert
			System.out.println("5. 회원 정보 변경"); // update
			System.out.println("6. 회원 삭제"); // delete
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				allMemberSeach();
				break;
			case 2:
				idSearch();
				break;
			case 3:
				nameSearch();
				break;
			case 4:
				insertMember();
				break;
			case 5:
				updateMember();
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

	private void allMemberSeach() {

		System.out.println("\n===== 전체 조회 =====");
		System.out.println("아이디\t패스워드\t이름\t성별\t나이\t전화번호\t\t취미\t가입일");

		DBConnect db = new DBConnect();
		ArrayList<Member> members = db.allMemberSearch();

		for (Member m : members) {
			System.out.println(m);
		}
	}

	public void idSearch() {

		System.out.println("\n===== 아이디로 조회 =====");
		System.out.print("조회할 아이디 입력 : ");
		String memberId = sc.next();

		DBConnect db = new DBConnect();
		// HashMap<String, Object> member = db.idSearch(memberId);
		Member member = db.idSearch(memberId);

		if (member == null) {
			System.out.println("아이디를 조회할 수 없습니다.");
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

	public void nameSearch() {
		System.out.println("\n===== 이름으로 조회 =====");
		System.out.print("조회할 이름 입력 : ");
		String memberName = sc.next();

		DBConnect db = new DBConnect();
		ArrayList<Member> list = db.nameSearch(memberName);

		if (list.isEmpty()) {
			System.out.println("이름을 조회할 수 없습니다.");
		} else {
			for (Member member : list) {
				// System.out.println("===== 회원 정보 =====");
				// System.out.println("아이디 : " + member.getMemberId());
				// System.out.println("비밀번호 : " + member.getMemberPw());
				// System.out.println("이름 : " + member.getMemberName());
				// System.out.println("성별 : " + member.getGender());
				// System.out.println("나이 : " + member.getAge());
				// System.out.println("전화번호 : " + member.getPhone());
				// System.out.println("취미 : " + member.getHobby());
				// System.out.println("가입일 : " + member.getEnrollDate());
				// System.out.println();

				System.out.println(member);
			}
		}
	}

	private void insertMember() {
		System.out.println("\n===== 회원 가입 =====");
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

		Member member = new Member(memberId, memberPw, memberName, gender, age, phone, hobby, null);

		DBConnect db = new DBConnect();
		int result = db.insertMember(member);

		if (result > 0) {
			System.out.println("회원 가입 완료.");
		} else {
			System.out.println("회원 가입 실패. 관리자에게 문의하세요.");
		}
	}

	private void updateMember() {

		// 비밀번호, 전화번호, 취미만 수정
		System.out.println("\n===== 회원 정보 수정 =====");
		System.out.print("수정할 아이디 입력 : ");
		String memberId = sc.next();

		DBConnect db = new DBConnect();
		Member mem = db.idSearch(memberId);

		if (mem == null) {

			System.out.println("존재하지 않는 아이디입니다.");
		} else {

			System.out.print("비밀번호 입력 : ");
			String memberPw = sc.next();

			System.out.print("전화번호 입력(010-0000-0000) : ");
			String phone = sc.next();

			System.out.print("취미 입력 : ");
			String hobby = sc.next();

			Member member = new Member(memberId, memberPw, null, null, 0, phone, hobby, null);
			int result = db.updateMember(member);
			
			if (result > 0) {
				System.out.println("회원 정보가 수정되었습니다.");
			} else {
				System.out.println("회원 정보 수정에 실패했습니다.");
			}
		}
	}

	private void deleteMember() {
		
		System.out.println("\n==== 회원 정보 삭제 ====");
		System.out.print("삭제할 아이디를 입력하세요 : ");
		String memberId = sc.next();
		
		DBConnect db = new DBConnect();
		Member mem = db.idSearch(memberId);
		
		if (mem == null) {

			System.out.println("존재하지 않는 아이디입니다.");
		} else {
			
			System.out.print("정말로 삭제하시겠습니까?[y/n] : ");
			char ch = sc.next().charAt(0);
			
			if (ch == 'y') {
				
				int result = db.deleteMember(memberId);
				if (result > 0) {
					System.out.println("회원 정보를 삭제했습니다.");
				} else {
					System.out.println("회원 정보 삭제에 실패하였습니다.");
				}
			} else {
				System.out.println("회원 정보 삭제를 취소하였습니다.");
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
