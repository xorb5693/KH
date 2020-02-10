package kr.or.iei.controller;

import java.util.Scanner;
import kr.or.iei.point.Gold;
import kr.or.iei.point.Silver;
import kr.or.iei.point.Vip;

public class PointMgr {

	Scanner sc = new Scanner(System.in);
	Silver[] silver = new Silver[10];
	int sIndex;

	Gold[] gold = new Gold[10];
	int gIndex;

	Vip[] vip = new Vip[10];
	int vIndex;

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

		while (true) {

			System.out.print("등급을 입력하세요.[Silver/Gold/Vip] : ");
			rank = sc.next().toLowerCase(); // 대문자로 입력된 것을 소문자로 변환

			if (rank.equals("silver") || rank.equals("gold") || rank.equals("vip")) {
				break;
			} else {
				System.out.println("실버/골드 중 하나를 입력해 주세요.");
			}
		}

		System.out.print("포인트 점수를 입력하세요. : ");
		point = sc.nextInt();

		switch (rank) {
		case "silver":
			silver[sIndex++] = new Silver(name, rank, point);
			break;
		case "gold":
			gold[gIndex++] = new Gold(name, rank, point);
			break;
		case "vip":
			vip[vIndex++] = new Vip(name, rank, point);
			break;
		}

		System.out.println("회원 등록이 완료되었습니다.");
		delay();
	}

	public void printAllUser() {

		System.out.println("\n===== 회원 정보 출력(전체) =====");
		System.out.println("이름\t등급\t포인트\t보너스 포인트");

		for (int i = 0; i < sIndex; i++) {
			System.out.println(silver[i].getName() + "\t" + silver[i].getRank().toUpperCase() + "\t"
					+ silver[i].getPoint() + "\t" + silver[i].getBonus());
		}

		for (int i = 0; i < gIndex; i++) {
			System.out.println(gold[i].getName() + "\t" + gold[i].getRank().toUpperCase() + "\t" + gold[i].getPoint()
					+ "\t" + gold[i].getBonus());
		}

		for (int i = 0; i < vIndex; i++) {
			System.out.println(vip[i].getName() + "\t" + vip[i].getRank().toUpperCase() + "\t" + vip[i].getPoint()
					+ "\t" + vip[i].getBonus());
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
		} else if (searchUser - silver.length < 0) {
			System.out.println("이름 : " + silver[searchUser].getName());
			System.out.println("등급 : " + silver[searchUser].getRank().toUpperCase());
			System.out.println("포인트 점수 : " + silver[searchUser].getPoint());
			System.out.println("보너스 포인트 : " + silver[searchUser].getBonus());
		} else if (searchUser - (silver.length + gold.length) < 0) {
			searchUser = searchUser - silver.length;
			System.out.println("이름 : " + gold[searchUser].getName());
			System.out.println("등급 : " + gold[searchUser].getRank().toUpperCase());
			System.out.println("포인트 점수 : " + gold[searchUser].getPoint());
			System.out.println("보너스 포인트 : " + gold[searchUser].getBonus());
		} else {
			searchUser = searchUser - silver.length - gold.length;
			System.out.println("이름 : " + vip[searchUser].getName());
			System.out.println("등급 : " + vip[searchUser].getRank().toUpperCase());
			System.out.println("포인트 점수 : " + vip[searchUser].getPoint());
			System.out.println("보너스 포인트 : " + vip[searchUser].getBonus());
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
		} else if (searchUser1 - silver.length < 0) {
			//기존 정보가 Silver인 경우

			while (true) {
				System.out.print("이름을 입력하세요. : ");
				name = sc.next();
				if (!name.equals(silver[searchUser1].getName())) {
					int searchUser2 = searchUser(name);

					if (searchUser2 == -1) {
						break;
					} else {
						System.out.println("중복된 회원이 존재합니다. 다시 입력하세요.");
					}
				}
			}

			System.out.print("등급을 입력하세요.[Silver/Gold/Vip] : ");
			rank = sc.next().toLowerCase();

			System.out.print("포인트 점수를 입력하세요. : ");
			point = sc.nextInt();

			if (rank.equals("silver")) {
				silver[searchUser1].setName(name);
				silver[searchUser1].setRank(rank);
				silver[searchUser1].setPoint(point);
			} else {
				for (int i = searchUser1; i < sIndex - 1; i++) {
					silver[i] = silver[i + 1];
				}

				silver[sIndex - 1] = null;
				sIndex--;

				switch (rank) {
				case "gold":
					gold[gIndex++] = new Gold(name, rank, point);
					break;
				case "vip":
					vip[vIndex++] = new Vip(name, rank, point);
					break;
				}
			}

		} else if (searchUser1 - (silver.length + gold.length) < 0) {
			//기존 정보가 Gold인 경우
			searchUser1 = searchUser1 - silver.length;

			while (true) {
				System.out.print("이름을 입력하세요. : ");
				name = sc.next();
				if (!name.equals(gold[searchUser1].getName())) {
					int searchUser2 = searchUser(name);

					if (searchUser2 == -1) {
						break;
					} else {
						System.out.println("중복된 회원이 존재합니다. 다시 입력하세요.");
					}
				}
			}

			System.out.print("등급을 입력하세요.[Silver/Gold/Vip] : ");
			rank = sc.next().toLowerCase();

			System.out.print("포인트 점수를 입력하세요. : ");
			point = sc.nextInt();

			if (rank.equals("gold")) {
				gold[searchUser1].setName(name);
				gold[searchUser1].setRank(rank);
				gold[searchUser1].setPoint(point);
			} else {
				for (int i = searchUser1; i < gIndex - 1; i++) {
					gold[i] = gold[i + 1];
				}

				gold[gIndex - 1] = null;
				gIndex--;

				switch (rank) {
				case "silver":
					silver[sIndex++] = new Silver(name, rank, point);
					break;
				case "vip":
					vip[vIndex++] = new Vip(name, rank, point);
					break;
				}
			}

		} else {
			//기존 정보가 Vip인 경우
			searchUser1 = searchUser1 - silver.length - gold.length;

			while (true) {
				System.out.print("이름을 입력하세요. : ");
				name = sc.next();

				if (!name.equals(vip[searchUser1].getName())) {
					int searchUser2 = searchUser(name);

					if (searchUser2 == -1) {
						break;
					} else {
						System.out.println("중복된 회원이 존재합니다. 다시 입력하세요.");
					}
				}
			}

			System.out.print("등급을 입력하세요.[Silver/Gold/Vip] : ");
			rank = sc.next().toLowerCase();

			System.out.print("포인트 점수를 입력하세요. : ");
			point = sc.nextInt();

			if (rank.equals("vip")) {
				vip[searchUser1].setName(name);
				vip[searchUser1].setRank(rank);
				vip[searchUser1].setPoint(point);
			} else {
				for (int i = searchUser1; i < vIndex - 1; i++) {
					vip[i] = vip[i + 1];
				}

				vip[vIndex - 1] = null;
				vIndex--;

				switch (rank) {
				case "silver":
					silver[sIndex++] = new Silver(name, rank, point);
					break;
				case "gold":
					gold[gIndex++] = new Gold(name, rank, point);
					break;
				}
			}

		}

		System.out.println("회원 정보 수정이 완료되었습니다.");
		delay();
	}

	public void deleteUser() {

		System.out.println("\n===== 회원 탈퇴 =====");
		System.out.print("탈퇴할 회원의 이름을 입력하세요. : ");
		String name = sc.next();

		int searchUser = searchUser(name);

		if (searchUser == -1) {
			System.out.println("해당 회원은 존재하지 않습니다.");
		} else if (searchUser - silver.length < 0) {

			for (int i = searchUser; i < sIndex - 1; i++) {
				silver[i] = silver[i + 1];
			}

			silver[sIndex - 1] = null;
			sIndex--;
			System.out.println("회원 탈퇴가 완료되었습니다.");

		} else if (searchUser - (silver.length + gold.length) < 0) {
			searchUser = searchUser - silver.length;

			for (int i = searchUser; i < gIndex - 1; i++) {
				gold[i] = gold[i + 1];
			}

			gold[gIndex - 1] = null;
			gIndex--;

			System.out.println("회원 탈퇴가 완료되었습니다.");
		} else {
			searchUser = searchUser - silver.length - gold.length;

			for (int i = searchUser; i < vIndex - 1; i++) {
				vip[i] = vip[i + 1];
			}

			vip[vIndex - 1] = null;
			vIndex--;

			System.out.println("회원 탈퇴가 완료되었습니다.");
		}

		delay();
	}

	public int searchUser(String name) {

		for (int i = 0; i < sIndex; i++) {
			if (silver[i].getName().equals(name)) {
				return i;
			}
		}

		for (int i = 0; i < gIndex; i++) {
			if (gold[i].getName().equals(name)) {
				return i + silver.length;
			}
		}

		for (int i = 0; i < vIndex; i++) {
			if (vip[i].getName().equals(name)) {
				return i + silver.length + gold.length;
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
