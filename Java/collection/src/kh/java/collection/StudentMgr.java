package kh.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import kh.java.collection.vo.Student;

public class StudentMgr {

	ArrayList<Student> students = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);

	public void main() {
		while (true) {
			System.out.println("\n---------- 학생 관리 프로그램 ----------");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 전체 정보 출력");
			System.out.println("3. 학생 1명 정보 출력");
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
				return;
			default:
				System.out.println("0~5 사이의 숫자를 입력해주세요.");
			}

			delay();
		}
	}

	public void insertStudent() {

		System.out.println("\n----- 학생 정보 입력 -----");

		System.out.print("이름 입력 : ");
		String name = sc.next();

		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		sc.nextLine();

		System.out.print("주소 입력 : ");
		String addr = sc.nextLine();

		Student st = new Student(name, age, addr);
		students.add(st);

		System.out.println("학생이 추가되었습니다.");

	}

	public void printAllStudent() {

		if (students.isEmpty()) {
			System.out.println("학생 정보가 없습니다.");
		} else {

			System.out.println("\n----- 학생 전체 정보 출력 -----");
			System.out.println("이름\t나이\t주소");

			// Iterator를 이용한 출력 방법
//			Iterator iter = students.iterator();
//
//			while (iter.hasNext()) {
//				System.out.println(iter.next());
//			}

			// for-each문을 이용한 출력 방법
			for (Student st : students) {
				System.out.println(st);
			}

			// for문을 이용한 출력 방법
//			for (int i = 0; i < students.size(); i++) {
//				System.out.println(students.get(i));
//			}
			
			//ArrayList가 가지고 있는 forEach문 람다식을 이용해 더 단축 가능
//			students.forEach(st -> {
//				System.out.print(st);
//				System.out.println("\tHello");
//			});
		}
	}

	public void printOneStudent() {

		System.out.println("\n----- 학생 1명 정보 출력 -----");

		System.out.print("조회할 학생 이름 입력 : ");
		String name = sc.next();

		int searchIndex = searchStudent(name);

		if (searchIndex == -1) {
			System.out.println("학생이 존재하지 않습니다.");
		} else {
			System.out.println(students.get(searchIndex));
		}
	}

	public void modifyStudent() {

		System.out.println("\n----- 학생 정보 수정 -----");

		System.out.print("수정할 학생 이름 입력 : ");
		String name = sc.next();

		int searchIndex = searchStudent(name);

		if (searchIndex == -1) {
			System.out.println("학생이 존재하지 않습니다.");
		} else {
			System.out.print("이름 입력 : ");
			String nName = sc.next();

			System.out.print("나이 입력 : ");
			int nAge = sc.nextInt();

			sc.nextLine();

			System.out.print("주소 입력 : ");
			String nAddr = sc.nextLine();

			students.get(searchIndex).setName(nName);
			students.get(searchIndex).setAge(nAge);
			students.get(searchIndex).setAddr(nAddr);

			System.out.println("학생 정보가 수정되었습니다.");
		}

	}

	public void deleteStudent() {

		System.out.println("\n----- 학생 정보 삭제 -----");

		System.out.print("삭제할 학생 이름 입력 : ");
		String name = sc.next();

		int searchIndex = searchStudent(name);

		if (searchIndex == -1) {
			System.out.println("학생이 존재하지 않습니다.");
		} else {
			students.remove(searchIndex);

			System.out.println("학생 정보가 삭제되었습니다.");
		}
	}

	public int searchStudent(String name) {

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
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
