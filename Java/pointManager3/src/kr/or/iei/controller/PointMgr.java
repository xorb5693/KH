package kr.or.iei.controller;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import kr.or.iei.point.Silver;
import kr.or.iei.point.Gold;
import kr.or.iei.point.Vip;

public class PointMgr {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	Silver[] silver = new Silver[10];
	int sIndex;
	Gold[] gold = new Gold[10];
	int gIndex;
	Vip[] vip = new Vip[10];
	int vIndex;

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
			System.out.print("회원 등급을 입력하세요. [Silver/Gold/Vip] : ");
			try {
				mGrade = br.readLine().toLowerCase();

				if (mGrade.equals("silver") || mGrade.equals("gold") || mGrade.equals("vip")) {
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
			silver[sIndex++] = new Silver(mName, mGrade, mPoint);
			break;
		case "gold":
			gold[gIndex++] = new Gold(mName, mGrade, mPoint);
			break;
		case "vip":
			vip[vIndex++] = new Vip(mName, mGrade, mPoint);
			break;
		}

		System.out.println("회원이 등록되었습니다.");
		delay();
	}

	public void printAllMemeber() {

		System.out.println("\n===== 회원 정보 출력(전체) =====");

		System.out.println("이름\t등급\t포인트\t보너스");

		for (int i = 0; i < sIndex; i++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n", silver[i].getName(), silver[i].getGrade().toUpperCase(),
					silver[i].getPoint(), silver[i].getBonus());
		}

		for (int i = 0; i < gIndex; i++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n", gold[i].getName(), gold[i].getGrade().toUpperCase(),
					gold[i].getPoint(), gold[i].getBonus());
		}

		for (int i = 0; i < vIndex; i++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n", vip[i].getName(), vip[i].getGrade().toUpperCase(),
					vip[i].getPoint(), vip[i].getBonus());
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
				if (searchMember - silver.length < 0) {
					System.out.println("이름 : " + silver[searchMember].getName());
					System.out.println("등급 : " + silver[searchMember].getGrade().toUpperCase());
					System.out.println("포인트 : " + silver[searchMember].getPoint());
					System.out.printf("보너스 : %.2f\n", silver[searchMember].getBonus());
				} else if (searchMember - silver.length - gold.length < 0) {
					searchMember -= silver.length;

					System.out.println("이름 : " + gold[searchMember].getName());
					System.out.println("등급 : " + gold[searchMember].getGrade().toUpperCase());
					System.out.println("포인트 : " + gold[searchMember].getPoint());
					System.out.printf("보너스 : %.2f\n", gold[searchMember].getBonus());
				} else {
					searchMember -= (silver.length + gold.length);

					System.out.println("이름 : " + vip[searchMember].getName());
					System.out.println("등급 : " + vip[searchMember].getGrade().toUpperCase());
					System.out.println("포인트 : " + vip[searchMember].getPoint());
					System.out.printf("보너스 : %.2f\n", vip[searchMember].getBonus());
				}
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
					System.out.print("회원 등급을 입력하세요. [Silver/Gold/Vip] : ");
					try {
						mGrade = br.readLine().toLowerCase();

						if (mGrade.equals("silver") || mGrade.equals("gold") || mGrade.equals("vip")) {
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

				if (searchMember - silver.length < 0) {

					if (mGrade.equals("silver")) {
						silver[searchMember].setName(mName);
						silver[searchMember].setPoint(mPoint);
					} else {

						for (int i = searchMember; i < sIndex - 1; i++) {
							silver[i] = silver[i + 1];
						}

						silver[--sIndex] = null;
						
						switch(mGrade) {
						case "gold":
							gold[gIndex++] = new Gold(mName, mGrade, mPoint);
							break;
						case "vip":
							vip[vIndex++] = new Vip(mName, mGrade, mPoint);
							break;
						}
					}

				} else if (searchMember - silver.length - gold.length < 0) {
					searchMember -= silver.length;

					if (mGrade.equals("gold")) {
						silver[searchMember].setName(mName);
						silver[searchMember].setPoint(mPoint);
					} else {

						for (int i = searchMember; i < gIndex - 1; i++) {
							gold[i] = gold[i + 1];
						}

						gold[--gIndex] = null;
						
						switch(mGrade) {
						case "silver":
							silver[sIndex++] = new Silver(mName, mGrade, mPoint);
							break;
						case "vip":
							vip[vIndex++] = new Vip(mName, mGrade, mPoint);
							break;
						}
					}

				} else {
					searchMember -= (silver.length + gold.length);

					if (mGrade.equals("vip")) {
						silver[searchMember].setName(mName);
						silver[searchMember].setPoint(mPoint);
					} else {

						for (int i = searchMember; i < vIndex - 1; i++) {
							vip[i] = vip[i + 1];
						}

						vip[--vIndex] = null;
						
						switch(mGrade) {
						case "silver":
							silver[sIndex++] = new Silver(mName, mGrade, mPoint);
							break;
						case "gold":
							gold[gIndex++] = new Gold(mName, mGrade, mPoint);
							break;
						}
					}
				}

				System.out.println("회원 정보가 수정되었습니다.");
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}
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
				if (searchMember - silver.length < 0) {

					for (int i = searchMember; i < sIndex - 1; i++) {
						silver[i] = silver[i + 1];
					}

					silver[--sIndex] = null;

				} else if (searchMember - silver.length - gold.length < 0) {
					searchMember -= silver.length;

					for (int i = searchMember; i < gIndex - 1; i++) {
						gold[i] = gold[i + 1];
					}

					gold[--gIndex] = null;
				} else {
					searchMember -= (silver.length + gold.length);

					for (int i = searchMember; i < vIndex - 1; i++) {
						vip[i] = vip[i + 1];
					}

					vip[--vIndex] = null;
				}

				System.out.println("회원 정보가 삭제되었습니다.");
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}

		delay();
	}

	public int searchMember(String name) {

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
