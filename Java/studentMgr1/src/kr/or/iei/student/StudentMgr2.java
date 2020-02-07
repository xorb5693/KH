package kr.or.iei.student;

import java.io.*;

public class StudentMgr2 {

	final static int ARRAYMAX = 10;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String[] names = new String[ARRAYMAX];
	int[] ages = new int[ARRAYMAX];
	String[] sexs = new String[ARRAYMAX];
	String[] addrs = new String[ARRAYMAX];
	int index;

	public StudentMgr2() {
		while (true) {
			System.out.println("===== 학생 관리 프로그램 v1.0 =====");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 정보 조회(전체)");
			System.out.println("3. 학생 정보 조회(1명)");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");

			int select;

			while (true) {
				try {
					System.out.print("선택 > ");
					select = Integer.parseInt(br.readLine());
					break;
				} catch (NumberFormatException ne) {
					System.err.println("숫자를 입력해 주세요.");
				} catch (IOException ie) {
					ie.printStackTrace();
				}
			}

			switch (select) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				printOneStudent();
				break;
			case 4:
				modifyStudnet();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("0~5 사이의 숫자를 입력해주세요.");
			}
		}
	}

	private void insertStudent() {

		if (index == ARRAYMAX) {
			return;
		}

		while (true) {
			try {
				System.out.println("\n===== 학생 등록하기 =====");
				System.out.print("이름을 입력해주세요. : ");
				names[index] = br.readLine();

				System.out.print("나이를 입력해주세요. : ");
				ages[index] = Integer.parseInt(br.readLine());

				System.out.print("성별을 입력해주세요.(남/여) : ");
				sexs[index] = br.readLine();

				System.out.print("주소를 입력해주세요. : ");
				addrs[index] = br.readLine();

				printInfo(index);
				System.out.println("학생 정보가 등록되었습니다.");
				index++;

				delay();
				return;

			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	private void printAllStudent() {

		System.out.println("\n===== 학생 전체 정보 조회 =====");
		System.out.println("이름\t나이\t성별\t주소");

		for (int i = 0; i < index; i++) {
			System.out.printf("%s\t%d\t%s\t%s\n", names[i], ages[i], sexs[i], addrs[i]);
		}

		delay();
	}

	private void printOneStudent() {

		System.out.println("\n===== 학생 정보 조회 =====");
		int searchStudent = searchStudent("조회");

		if (searchStudent != -1) {
			System.out.println("학생 정보를 출력합니다.");
			printInfo(searchStudent);
		}

		delay();
	}

	private void modifyStudnet() {

		System.out.println("\n===== 학생 정보 수정 =====");
		int searchStudent = searchStudent("수정");

		if (searchStudent != -1) {
			while (true) {
				try {
					System.out.print("이름을 입력해주세요. : ");
					names[searchStudent] = br.readLine();

					System.out.print("나이를 입력해주세요. : ");
					ages[searchStudent] = Integer.parseInt(br.readLine());

					System.out.print("성별을 입력해주세요.(남/여) : ");
					sexs[searchStudent] = br.readLine();

					System.out.print("주소를 입력해주세요. : ");
					addrs[searchStudent] = br.readLine();

					printInfo(searchStudent);
					System.out.println("학생 정보가 수정되었습니다.");

					delay();
					return;

				} catch (NumberFormatException ne) {
					System.err.println("숫자를 입력해 주세요.");
				} catch (IOException ie) {
					ie.printStackTrace();
				}
			}
		}

		delay();
	}

	private void deleteStudent() {

		System.out.println("\n===== 학생 정보 삭제 =====");
		int searchStudent = searchStudent("삭제");
		printInfo(searchStudent);
		while (true) {
			try {
				System.out.print("이 학생의 정보를 삭제하시겠습니까? [1. yes, 2. no] : ");
				int select = Integer.parseInt(br.readLine());
				
				switch(select) {
				case 1 :
					for (int i = searchStudent; i < index - 1; i++) {
						names[i] = names[i + 1];
						ages[i] = ages[i + 1];
						sexs[i] = sexs[i + 1];
						addrs[i] = addrs[i + 1];
					}
					index--;
					System.out.println("학생 정보를 삭제하였습니다.");
					delay();
					return;
				case 2 :
					System.out.println("취소하였습니다.");
					delay();
					return;
				default :
					System.out.println("1~2 사이의 숫자를 입력해 주세요.");
				}
				
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	private int searchStudent(String msg) {

		System.out.print(msg + "할 학생의 이름을 입력해 주세요. : ");

		try {

			String name = br.readLine();

			for (int i = 0; i < index; i++) {
				if (names[i].equals(name)) {
					return i;
				}
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		}

		System.out.println("등록된 학생이 아닙니다.");
		return -1;
	}

	private void printInfo(int serachNumber) {

		System.out.println("이름 : " + names[serachNumber]);
		System.out.println("나이 : " + ages[serachNumber]);
		System.out.println("성별 : " + sexs[serachNumber]);
		System.out.println("주소 : " + addrs[serachNumber]);
	}

	private void delay() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
