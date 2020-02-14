package kr.or.iei.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import kr.or.iei.point.Gold;
import kr.or.iei.point.Grade;
import kr.or.iei.point.Silver;
import kr.or.iei.point.Vip;
import kr.or.iei.point.Vvip;

public class PointMgr {

	ArrayList<Grade> members = new ArrayList<Grade>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void main() {

		while (true) {

			System.out.println("\n===== 포인트 관리 시스템 =====");
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 전체 정보 출력");
			System.out.println("3. 회원 1명 정보 출력");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");

			try {
				int select = Integer.parseInt(br.readLine());

				switch (select) {
				case 1:
					insertMember();
					break;
				case 2:
					printAllMember();
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
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			} finally {
				delay();
			}
		}
	}

	public void insertMember() {

		String nGrade, nName;
		int nPoint;

		System.out.println("\n----- 회원 등록 -----");

		while (true) {

			System.out.print("등급을 입력하세요 [Silver/Gold/VIP/VVIP] : ");

			try {
				nGrade = br.readLine().toLowerCase();

				if (nGrade.equals("silver") || nGrade.equals("gold") || nGrade.equals("vip") || nGrade.equals("vvip")) {
					break;
				} else {
					System.out.println("[Silver/Gold/VIP/VVIP] 중 하나를 입력하세요.");
					continue;
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

		while (true) {

			System.out.print("이름을 입력하세요 : ");

			try {
				nName = br.readLine().toLowerCase();
				int searchIndex = searchIndex(nName);

				if (searchIndex == -1) {
					break;
				} else {
					System.out.println("동일한 사용자가 존재합니다.");
					continue;
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

		while (true) {

			System.out.print("포인트를 입력하세요 : ");

			try {
				nPoint = Integer.parseInt(br.readLine());

				if (nPoint < 0) {
					System.out.println("0이상의 숫자를 입력하세요.");
					continue;
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
				delay();
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

		switch (nGrade) {
		case "silver":
			members.add(new Silver(nGrade, nName, nPoint));
			break;
		case "gold":
			members.add(new Gold(nGrade, nName, nPoint));
			break;
		case "vip":
			members.add(new Vip(nGrade, nName, nPoint));
			break;
		case "vvip":
			members.add(new Vvip(nGrade, nName, nPoint));
			break;
		}

		System.out.println("회원 등록이 완료되었습니다.");
	}

	public void printAllMember() {
		
		if (members.isEmpty()) {
			System.out.println("등록된 회원이 없습니다.");
			return;
		}

		System.out.println("\n----- 회원 전체 정보 출력 -----");
		System.out.println("이름\t등급\t포인트\t보너스 포인트");

		for (Grade member : members) {
			System.out.println(member);
		}
	}

	public void printOneMember() {

		if (members.isEmpty()) {
			System.out.println("등록된 회원이 없습니다.");
			return;
		}

		System.out.println("\n----- 회원 1명 정보 출력 -----");
		System.out.print("조회할 이름을 입력하세요 : ");

		try {
			String name = br.readLine();

			int searchIndex = searchIndex(name);

			if (searchIndex == -1) {
				System.out.println("등록된 회원이 아닙니다.");
				return;
			} else {
				System.out.println("이름 : " + members.get(searchIndex).getName());
				System.out.println("등급 : " + members.get(searchIndex).getGrade());
				System.out.println("포인트 : " + members.get(searchIndex).getPoint());
				System.out.println("보너스 포인트 : " + members.get(searchIndex).getBonus());
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		}

	}

	public void modifyMember() {

		if (members.isEmpty()) {
			System.out.println("등록된 회원이 없습니다.");
			return;
		}

		String nName, nGrade;
		int nPoint;
		
		System.out.println("\n----- 회원 정보 수정 -----");
		System.out.print("수정할 이름을 입력하세요 : ");

		try {
			String name = br.readLine();

			int searchIndex = searchIndex(name);

			if (searchIndex == -1) {
				System.out.println("등록된 회원이 아닙니다.");
				return;
			} else {

				while (true) {

					System.out.print("등급을 입력하세요 [Silver/Gold/VIP/VVIP] : ");

					try {
						nGrade = br.readLine().toLowerCase();

						if (nGrade.equals("silver") || nGrade.equals("gold") || nGrade.equals("vip") || nGrade.equals("vvip")) {
							break;
						} else {
							System.out.println("[Silver/Gold/VIP/VVIP] 중 하나를 입력하세요.");
							continue;
						}
					} catch (IOException ie) {
						ie.printStackTrace();
					}

				}

				while (true) {

					System.out.print("이름을 입력하세요 : ");

					try {
						nName = br.readLine().toLowerCase();
						int searchIndex2 = searchIndex(nName);

						if (searchIndex2 == -1 || name.equals(nName)) {
							break;
						} else {
							System.out.println("동일한 사용자가 존재합니다.");
							continue;
						}
					} catch (IOException ie) {
						ie.printStackTrace();
					}

				}

				while (true) {

					System.out.print("포인트를 입력하세요 : ");

					try {
						nPoint = Integer.parseInt(br.readLine());

						if (nPoint < 0) {
							System.out.println("0이상의 숫자를 입력하세요.");
							continue;
						} else {
							break;
						}
					} catch (NumberFormatException ne) {
						System.err.println("숫자를 입력해 주세요.");
						delay();
					} catch (IOException ie) {
						ie.printStackTrace();
					}

				}
				
				if (members.get(searchIndex).getGrade().equals(nGrade)) {
					members.get(searchIndex).setGrade(nGrade);
					members.get(searchIndex).setName(nName);
					members.get(searchIndex).setPoint(nPoint);
				} else {
					switch(nGrade) {
					case "silver" :
						members.set(searchIndex, new Silver(nGrade, nName, nPoint));
						break;
					case "gold" :
						members.set(searchIndex, new Gold(nGrade, nName, nPoint));
						break;
					case "vip" :
						members.set(searchIndex, new Vip(nGrade, nName, nPoint));
						break;
					case "vvip" :
						members.set(searchIndex, new Vvip(nGrade, nName, nPoint));
						break;
					}
				}
				
				System.out.println("수정이 완료되었습니다.");
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public void deleteMember() {

		if (members.isEmpty()) {
			System.out.println("등록된 회원이 없습니다.");
			return;
		}

		System.out.println("\n----- 회원 정보 삭제 -----");
		System.out.print("삭제할 이름을 입력하세요 : ");

		try {
			String name = br.readLine();

			int searchIndex = searchIndex(name);

			if (searchIndex == -1) {
				System.out.println("등록된 회원이 아닙니다.");
				return;
			} else {
				members.remove(searchIndex);
				System.out.println("삭제가 완료되었습니다.");
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public int searchIndex(String name) {

		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getName().equals(name)) {
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
