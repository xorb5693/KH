package kr.or.iei.control;

import java.util.Scanner;
import kr.or.iei.vo.Student;

public class StudentMgr {
	// 이름 배열, 나이 배열, 주소 배열, 스캐너, 인덱스

	private final static int ARRAYMAX = 10;

	Student[] students = new Student[ARRAYMAX];
	Scanner sc = new Scanner(System.in);
	int index;

	public void main() {
		while (true) {

			System.out.println("====== 학생 관리 프로그램 v1.1 =====");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 출력(전체)");
			System.out.println("3. 학생 정보 출력(1명)");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");

			int select = sc.nextInt();

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
				modifyStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("다시 입력해 주세요!!");
			}
		}
	}

	public void insertStudent() {

		if (index == ARRAYMAX) {
			System.out.println("\n학생 정원을 초과하였습니다.");
			return;
		}

		System.out.println("\n===== 학생 정보 입력 =====");
		System.out.print("학생 이름 입력 : ");
		String name = sc.next();

		System.out.print("학생 나이 입력 : ");
		int age = sc.nextInt();

		sc.nextLine();

		System.out.print("학생 주소 입력 : ");
		String addr = sc.nextLine();

		// //기본 생성자를 통해서 객체 생성 후 setter를 이용한 값 저장
		// Student stu = new Student();
		// //stu 이름 = null, 나이 = 0, 주소 = null
		// stu.setName(name);
		// stu.setAge(age);
		// stu.setAddr(addr);

		// 매개변수 생성자 이용
		Student stu = new Student(name, age, addr);

		students[index] = stu;
		index++;
	}

	public void printAllStudent() {

		System.out.println("\n===== 학생 전체 정보 출력 =====");
		System.out.println("이름\t나이\t주소");

		for (int i = 0; i < index; i++) {
			System.out.println(students[i]);
		}
	}

	public void printOneStudent() {

		System.out.println("\n===== 학생 정보 출력 =====");
		System.out.print("출력할 학생의 이름을 입력하세요. : ");
		String name = sc.next();

		int searchIndex = searchIndex(name);

		if (searchIndex == -1) {
			System.out.println("학생이 존재하지 않습니다.");
		} else {
			System.out.println("이름 : " + students[searchIndex].getName());
			System.out.println("나이 : " + students[searchIndex].getAge());
			System.out.println("주소 : " + students[searchIndex].getAddr());
		}
	}

	public void modifyStudent() {

		System.out.println("\n===== 학생 정보 수정 =====");
		System.out.print("수정할 학생의 이름을 입력하세요. : ");
		String name = sc.next();

		int searchIndex = searchIndex(name);

		if (searchIndex == -1) {
			System.out.println("학생이 존재하지 않습니다.");
		} else {
			System.out.print("학생 이름 입력 : ");
			String mName = sc.next();

			System.out.print("학생 나이 입력 : ");
			int mAge = sc.nextInt();

			sc.nextLine();

			System.out.print("학생 주소 입력 : ");
			String mAddr = sc.nextLine();
			
			students[searchIndex].setName(mName);
			students[searchIndex].setAge(mAge);
			students[searchIndex].setAddr(mAddr);

			System.out.println("학생 정보를 수정했습니다.");
		}
	}

	public void deleteStudent() {

		System.out.println("\n===== 학생 정보 삭제 =====");
		System.out.print("삭제할 학생의 이름을 입력하세요. : ");
		String name = sc.next();

		int searchIndex = searchIndex(name);

		if (searchIndex == -1) {
			System.out.println("학생이 존재하지 않습니다.");
		} else {
			for (int i = searchIndex; i < index - 1; i++) {
				students[i] = students[i + 1];
			}
			students[index - 1] = null;
			System.out.println("학생의 정보를 삭제했습니다.");
			index--;
		}
	}

	public int searchIndex(String name) {
		for (int i = 0; i < index; i++) {
			if (students[i].getName().equals(name)) {
				return i;
			}
		}

		return -1;
	}
}
