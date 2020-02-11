package kr.or.iei.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import kr.or.iei.point.Gold;
import kr.or.iei.point.Grade;
import kr.or.iei.point.Silver;
import kr.or.iei.point.Vip;
import kr.or.iei.point.Vvip;

public class PointMgr {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	Grade[] members = new Grade[30];
	int index;

	public PointMgr() {

	}

	public void main() {

		int select;

		while (true) {
			System.out.println("===== 포인트 관리 시스템 =====");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 정보 출력(전체)");
			System.out.println("3. 회원 정보 출력(1명)");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");

			try {
				select = Integer.parseInt(br.readLine());

				switch (select) {
				case 1:
					insertMember();
					break;
				case 2:
					printAllMemeber();
					break;
				case 3:
					printOneMember();
					break;
				case 4:
					modifyMember();
					break;
				case 5:
					deleteMember();
					break;
				case 0:
					return;
				default:
					System.out.println("0~5 사이의 숫자를 입력하세요.");
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력하세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}
	}

	public void insertMember() {

		System.out.println("\n===== 회원 가입 =====");

		String mGrade, mName;
		int mPoint;

		while (true) {
			System.out.print("회원 등급을 입력하세요. [Silver/Gold/VIP/VVIP] : ");
			try {
				mGrade = br.readLine().toLowerCase();

				if (mGrade.equals("silver") || mGrade.equals("gold") || mGrade.equals("vip") || mGrade.equals("vvip")) {
					break;
				} else {
					System.out.println("Silver, Gold, Vip 중 하나를 입력하세요.");
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
		while (true) {
			try {
				System.out.print("이름을 입력하세요. : ");

				mName = br.readLine();

				int searchMember = searchMember(mName);

				if (searchMember == -1) {
					break;
				} else {
					System.out.println("중복된 회원이 존재합니다.");
					continue;
				}

			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		while (true) {
			try {
				System.out.print("포인트를 입력하세요. : ");
				mPoint = Integer.parseInt(br.readLine());
				break;
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력하세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		switch (mGrade) {
		case "silver":
			members[index++] = new Silver(mName, mGrade, mPoint);
			break;
		case "gold":
			members[index++] = new Gold(mName, mGrade, mPoint);
			break;
		case "vip":
			members[index++] = new Vip(mName, mGrade, mPoint);
			break;
		case "vvip":
			members[index++] = new Vvip(mName, mGrade, mPoint);
		}

		System.out.println("회원이 등록되었습니다.");
		delay();
	}

	public void printAllMemeber() {

		System.out.println("\n===== 회원 정보 출력(전체) =====");

		System.out.println("이름\t등급\t포인트\t보너스");

		for (int i = 0; i < index; i++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n", members[i].getName(), members[i].getGrade().toUpperCase(),
					members[i].getPoint(), members[i].getBonus());
		}

		delay();
	}

	public void printOneMember() {

		String name;

		System.out.println("\n===== 회원 정보 출력(1명) =====");

		System.out.print("검색할 회원의 이름을 입력해주세요. : ");

		try {
			name = br.readLine();

			int searchMember = searchMember(name);

			if (searchMember == -1) {
				System.out.println("등록된 회원이 아닙니다.");
			} else {
				System.out.println("이름 : " + members[searchMember].getName());
				System.out.println("등급 : " + members[searchMember].getGrade().toUpperCase());
				System.out.println("포인트 : " + members[searchMember].getPoint());
				System.out.printf("보너스 : %.2f\n", members[searchMember].getBonus());
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}

		delay();
	}

	public void modifyMember() {

		String name;
		String mName, mGrade;
		int mPoint;

		System.out.println("\n===== 회원 정보 수정 =====");

		System.out.print("수정할 회원의 이름을 입력해주세요. : ");

		try {
			name = br.readLine();

			int searchMember = searchMember(name);

			if (searchMember == -1) {
				System.out.println("등록된 회원이 아닙니다.");
			} else {

				while (true) {
					System.out.print("회원 등급을 입력하세요. [Silver/Gold/VIP/VVIP] : ");
					try {
						mGrade = br.readLine().toLowerCase();

						if (mGrade.equals("silver") || mGrade.equals("gold") || mGrade.equals("vip") || mGrade.equals("vvip")) {
							break;
						} else {
							System.out.println("Silver, Gold, Vip 중 하나를 입력하세요.");
						}
					} catch (IOException ie) {
						ie.printStackTrace();
					}
				}
				while (true) {
					try {
						System.out.print("이름을 입력하세요. : ");

						mName = br.readLine();

						int searchMember2 = searchMember(mName);

						if (searchMember2 == -1 || name.equals(mName)) {
							break;
						} else {
							System.out.println("중복된 회원이 존재합니다.");
							continue;
						}

					} catch (IOException ie) {
						ie.printStackTrace();
					}
				}

				while (true) {
					try {
						System.out.print("포인트를 입력하세요. : ");
						mPoint = Integer.parseInt(br.readLine());
						break;
					} catch (NumberFormatException ne) {
						System.err.println("숫자를 입력하세요.");
					} catch (IOException ie) {
						ie.printStackTrace();
					}
				}

				switch (mGrade) {
				case "silver":
					members[searchMember] = new Silver(mName, mGrade, mPoint);
					break;
				case "gold":
					members[searchMember] = new Gold(mName, mGrade, mPoint);
					break;
				case "vip":
					members[searchMember] = new Vip(mName, mGrade, mPoint);
					break;
				case "vvip" : 
					members[searchMember] = new Vvip(mName, mGrade, mPoint);
					break;
				}

				System.out.println("회원 정보가 수정되었습니다.");
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}

		delay();
	}

	public void deleteMember() {

		String name;

		System.out.println("\n===== 회원 삭제 =====");

		System.out.print("삭제할 회원의 이름을 입력해주세요. : ");

		try {
			name = br.readLine();

			int searchMember = searchMember(name);

			if (searchMember == -1) {
				System.out.println("등록된 회원이 아닙니다.");
			} else {
				for (int i = searchMember; i < index - 1; i++) {
					members[i] = members[i + 1];
				}

				members[--index] = null;

				System.out.println("회원 정보가 삭제되었습니다.");
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}

		delay();
	}

	public int searchMember(String name) {

		for (int i = 0; i < index; i++) {
			if (members[i].getName().equals(name)) {
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
