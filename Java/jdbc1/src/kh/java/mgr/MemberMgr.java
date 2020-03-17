package kh.java.mgr;

import java.util.ArrayList;
import java.util.Scanner;

import kh.java.DB.DBConnect;
import kh.java.DB.Member;

public class MemberMgr {
	
	Scanner sc = new Scanner(System.in);

	public void main() {
		
		while (true) {
			System.out.println("===== 회원관리 프로그램 =====");
			System.out.println("1. 회원 전체 정보 조회");	//select
			System.out.println("2. 회원 아이디로 조회");	//select
			System.out.println("3. 회원 이름으로 조회");	//select
			System.out.println("4. 회원 가입");			//insert
			System.out.println("5. 회원 정보 변경");		//update
			System.out.println("6. 회원 삭제");			//delete
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			
			switch (sel) {
			case 1 :
				break;
			case 2 :
				idSearch();
				break;
			case 3 :
				nameSearch();
				break;
			case 4 :
				break;
			case 5 :
				break;
			case 6 :
				break;
			case 0 :
				return;
			}
			
			delay();
		}
	}
	
	public void idSearch() {
		
		System.out.println("===== 아이디로 조회 =====");
		System.out.print("조회할 아이디 입력 : ");
		String memberId = sc.next();
		
		DBConnect db= new DBConnect();
//		HashMap<String, Object> member = db.idSearch(memberId);
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
		System.out.println("===== 이름으로 조회 =====");
		System.out.print("조회할 이름 입력 : ");
		String memberName = sc.next();
		
		DBConnect db = new DBConnect();
		ArrayList<Member> list = db.nameSearch(memberName);
		
		if (list.isEmpty()) {
			System.out.println("이름을 조회할 수 없습니다.");
		} else {
			for (Member member : list) {
//				System.out.println("===== 회원 정보 =====");
//				System.out.println("아이디 : " + member.getMemberId());
//				System.out.println("비밀번호 : " + member.getMemberPw());
//				System.out.println("이름 : " + member.getMemberName());
//				System.out.println("성별 : " + member.getGender());
//				System.out.println("나이 : " + member.getAge());
//				System.out.println("전화번호 : " + member.getPhone());
//				System.out.println("취미 : " + member.getHobby());
//				System.out.println("가입일 : " + member.getEnrollDate());
//				System.out.println();
				
				System.out.println(member);
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
