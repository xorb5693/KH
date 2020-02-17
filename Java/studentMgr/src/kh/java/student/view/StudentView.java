package kh.java.student.view;

import java.util.ArrayList;
import java.util.Scanner;

import kh.java.student.model.vo.Student;

public class StudentView {

	Scanner sc = new Scanner(System.in);

	public int mainMenu() {
		System.out.println("\n===== 학생 관리 프로그램 =====");
		System.out.println("1. 학생 정보 등록");
		System.out.println("2. 학생 전체 정보 보기");
		System.out.println("3. 학생 1명 정보 보기");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");

		int select = sc.nextInt();

		return select;
	}

	public Student insertStudent() {

		System.out.println("\n----- 학생 정보 등록 ------");
		System.out.print("이름 입력 : ");
		String name = sc.next();

		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		sc.nextLine();

		System.out.print("주소 입력 : ");
		String addr = sc.nextLine();

		Student stu = new Student(name, age, addr);

		return stu;

	}

	public void printAllStudent(ArrayList<Student> students) {

		System.out.println("\n----- 학생 전체 정보 출력 -----");
		System.out.println("이름\t나이\t주소");

		for (Student stu : students) {
			System.out.println(stu);
		}

	}

	public void printOneStudent(Student stu) {

		System.out.println();

		System.out.println("이름 : " + stu.getName());
		System.out.println("나이 : " + stu.getAge());
		System.out.println("주소 : " + stu.getAddr());

	}
	
	public Student modifyStudent() {
		
		System.out.print("수정할 이름 입력 : ");
		String name = sc.next();

		System.out.print("수정할 나이 입력 : ");
		int age = sc.nextInt();

		sc.nextLine();

		System.out.print("수정할 주소 입력 : ");
		String addr = sc.nextLine();

		Student stu = new Student(name, age, addr);
		
		return stu;
	}

	public String getName() {

		System.out.print("학생 이름 입력 : ");

		String name = sc.next();

		return name;
	}

	public void printMsg(String msg) {

		System.out.println(msg);
		
	}

}
