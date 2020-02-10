package kr.or.iei.controller;

import kr.or.iei.point.Silver;
import java.util.Scanner;

public class PointMgr {

	Scanner sc = new Scanner(System.in);
	Silver[] user = new Silver[30];
	int index;

	public void main() {
		while (true) {
			System.out.println("====== 포인트 관리 =====");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 정보 출력(전체)");
			System.out.println("3. 회원 정보 출력(1명)");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 탈퇴");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");

			int select = sc.nextInt();

			switch (select) {
			case 1:
				inserUser();
				break;
			case 2:
				printAllUser();
				break;
			case 3:
				printOneUser();
				break;
			case 4:
				modifyUser();
				break;
			case 5:
				deleteUser();
				break;
			case 0:
				return;
			default:
				System.out.println("0~5 사이의 숫자를 입력하세요.");
			}
		}
	}

	public void inserUser() {

		System.out.println("\n===== 회원 등록 =====");
		String name;
		String rank;
		int point;

		int searchUser;

		while (true) {
			System.out.print("이름을 입력하세요. : ");
			name = sc.next();
			searchUser = searchUser(name);

			if (searchUser == -1) {
				break;
			} else {
				System.out.println("중복된 회원이 존재합니다. 다시 입력하세요.");
			}
		}

		System.out.print("등급을 입력하세요. : ");
		rank = sc.next();

		System.out.print("포인트 점수를 입력하세요. : ");
		point = sc.nextInt();

		user[index] = new Silver(name, rank, point);
		System.out.println("회원 등록이 완료되었습니다.");
		index++;
		delay();
	}

	public void printAllUser() {

		System.out.println("\n===== 회원 정보 출력(전체) =====");
		System.out.println("이름\t등급\t포인트\t보너스 포인트");

		for (int i = 0; i < index; i++) {
			System.out.println(user[i].getName() + "\t" + user[i].getRank() + "\t" + user[i].getPoint() + "\t" + user[i].bonusPoint());
		}

		delay();
	}

	public void printOneUser() {

		System.out.println("\n===== 회원 정보 출력(1명) =====");
		System.out.print("검색할 회원의 이름을 입력하세요. : ");
		String name = sc.next();

		int searchUser = searchUser(name);

		if (searchUser == -1) {
			System.out.println("해당 회원은 존재하지 않습니다.");
		} else {
			System.out.println("이름 : " + user[searchUser].getName());
			System.out.println("등급 : " + user[searchUser].getRank());
			System.out.println("포인트 점수 : " + user[searchUser].getPoint());
			System.out.println("보너스 포인트 : " + user[searchUser].bonusPoint());
		}

		delay();
	}

	public void modifyUser() {

		String name;
		String rank;
		int point;

		System.out.println("\n===== 회원 정보 수정 =====");
		System.out.print("수정할 회원의 이름을 입력하세요. : ");
		name = sc.next();

		int searchUser1 = searchUser(name);

		if (searchUser1 == -1) {
			System.out.println("해당 회원은 존재하지 않습니다.");
		} else {
			while (true) {
				System.out.print("이름을 입력하세요. : ");
				name = sc.next();
				int searchUser2 = searchUser(name);

				if (searchUser2 == -1) {
					break;
				} else {
					System.out.println("중복된 회원이 존재합니다. 다시 입력하세요.");
				}
			}

			System.out.print("등급을 입력하세요. : ");
			rank = sc.next();

			System.out.print("포인트 점수를 입력하세요. : ");
			point = sc.nextInt();

			user[searchUser1].setName(name);
			user[searchUser1].setRank(rank);
			user[searchUser1].setPoint(point);

			System.out.println("회원 정보 수정이 완료되었습니다.");
		}

		delay();
	}

	public void deleteUser() {

		System.out.println("\n===== 회원 탈퇴 =====");
		System.out.print("탈퇴할 회원의 이름을 입력하세요. : ");
		String name = sc.next();

		int searchUser = searchUser(name);

		if (searchUser == -1) {
			System.out.println("해당 회원은 존재하지 않습니다.");
		} else {
			for (int i = searchUser; i < index - 1; i++) {
				user[i] = user[i + 1];
			}

			user[index - 1] = null;
			index--;
			System.out.println("회원 탈퇴가 완료되었습니다.");
		}

		delay();
	}

	public int searchUser(String name) {

		for (int i = 0; i < index; i++) {
			if (user[i].getName().equals(name)) {
				return i;
			}
		}

		return -1;
	}


	public void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
