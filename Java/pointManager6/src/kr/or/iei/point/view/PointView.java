package kr.or.iei.point.view;

import java.util.ArrayList;
import java.util.Scanner;

import kr.or.iei.point.controller.PointController;
import kr.or.iei.point.model.vo.Gold;
import kr.or.iei.point.model.vo.Grade;
import kr.or.iei.point.model.vo.Silver;
import kr.or.iei.point.model.vo.Vip;
import kr.or.iei.point.model.vo.Vvip;

public class PointView {

	Scanner sc = new Scanner(System.in);

	public int mainMenu() {

		System.out.println("\n===== 포인트 관리 프로그램 =====");
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 전체 출력");
		System.out.println("3. 회원 1명 출력");
		System.out.println("4. 회원 수정");
		System.out.println("5. 회원 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");

		int select = sc.nextInt();

		return select;
	}

	public Grade insertMember(PointController pointCon) {

		String grade, name;
		int point;

		while (true) {

			System.out.print("등급을 입력하세요[Silver/Gold/VIP/VVIP] : ");
			grade = sc.next().toLowerCase();

			if (grade.equals("silver") || grade.equals("gold") || grade.equals("vip") || grade.equals("vvip")) {
				break;
			} else {
				System.out.println("[Silver/Golde/VIP/VVIP] 중 하나를 입력하세요.");
			}
		}

		while (true) {

			System.out.print("이름을 입력하세요 : ");
			name = sc.next();

			if (pointCon.searchName(name)) {
				System.out.println("중복된 이름입니다. 다시 입력하세요.");
			} else {
				break;
			}
		}

		while (true) {

			System.out.print("포인트를 입력하세요 : ");
			point = sc.nextInt();

			if (point < 0) {
				System.out.println("0이상의 숫자를 입력하세요.");
			} else {
				break;
			}
		}

		switch (grade) {
		case "silver":
			return new Silver(grade, name, point);
		case "gold":
			return new Gold(grade, name, point);
		case "vip":
			return new Vip(grade, name, point);
		case "vvip":
			return new Vvip(grade, name, point);
		default:
			return null;
		}

	}

	public void printAllMember(ArrayList<Grade> members) {
		System.out.println("\n----- 회원 전체 출력 -----");
		System.out.println("등급\t이름\t포인트\t보너스 포인트");
		
		for (Grade member : members) {
			System.out.println(member);
		}
	}
	
	public void printOneMember(Grade member) {
		
		System.out.println("등급 : " + member.getGrade().toUpperCase());
		System.out.println("이름 : " + member.getName());
		System.out.println("포인트 : " + member.getPoint());
		System.out.println("보너스 포인트 : " + member.getBonus());
	}
	
	public Grade modifyMember(PointController pointCon, String name) {
		
		String nGrade, nName;
		int nPoint;

		while (true) {

			System.out.print("등급을 입력하세요[Silver/Gold/VIP/VVIP] : ");
			nGrade = sc.next().toLowerCase();

			if (nGrade.equals("silver") || nGrade.equals("gold") || nGrade.equals("vip") || nGrade.equals("vvip")) {
				break;
			} else {
				System.out.println("[Silver/Golde/VIP/VVIP] 중 하나를 입력하세요.");
			}
		}

		while (true) {

			System.out.print("이름을 입력하세요 : ");
			nName = sc.next();

			if (pointCon.searchName(nName) && !nName.equals(name)) {
				System.out.println("중복된 이름입니다. 다시 입력하세요.");
			} else {
				break;
			}
		}

		while (true) {

			System.out.print("포인트를 입력하세요 : ");
			nPoint = sc.nextInt();

			if (nPoint < 0) {
				System.out.println("0이상의 숫자를 입력하세요.");
			} else {
				break;
			}
		}

		switch (nGrade) {
		case "silver":
			return new Silver(nGrade, nName, nPoint);
		case "gold":
			return new Gold(nGrade, nName, nPoint);
		case "vip":
			return new Vip(nGrade, nName, nPoint);
		case "vvip":
			return new Vvip(nGrade, nName, nPoint);
		default:
			return null;
		}
		
	}
	
	public String getName() {
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		return name;
	}
	
	public void printMsg(String msg) {
		System.out.println(msg);
	}

}
