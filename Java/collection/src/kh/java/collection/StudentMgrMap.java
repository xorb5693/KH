package kh.java.collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import kh.java.collection.vo.Student;

public class StudentMgrMap {

	HashMap<String, Student> students = new HashMap<String, Student>();
	Scanner sc = new Scanner(System.in);

	public void main() {
		while (true) {
			System.out.println("\n===== 학생 관리 프로그램 ======");
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
				System.out.println("0~5사이의 숫자를 입력하세요.");
			}
		}
	}

	public void insertStudent() {
		
		System.out.println("\n----- 학생 정보 등록 ------");
		String name;
		
		while (true) {
			System.out.print("이름 입력 : ");
			name = sc.next();
			
			if (students.containsKey(name)) {
				System.out.println("중복된 이름입니다.");
			} else {
				break;
			}
		}
		
		System.out.print("나이 입력 : ");
		int age =sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("주소 입력 : ");
		String addr = sc.nextLine();
		
		students.put(name, new Student(name, age, addr));
		
		System.out.println("학생 정보가 등록되었습니다.");
	}
	
	public void printAllStudent() {
		
		System.out.println("\n----- 학생 전체 정보 출력 -----");
		System.out.println("이름\t나이\t주소");
		
		Set<String> keys = students.keySet();
	
		for(String key : keys) {
			System.out.println(students.get(key));
		}
	}
	
	public void printOneStudent() {
		
		System.out.println("\n----- 학생 1명 정보 출력 -----");
		System.out.print("조회할 학생 이름 : ");
		
		String name = sc.next();
		
		if (students.containsKey(name)) {
			Student st = students.get(name);
			System.out.println("이름 : " + st.getName());
			System.out.println("나이 : " + st.getAge());
			System.out.println("주소 : " + st.getAddr());
		} else {
			System.out.println("학생이 존재하지 않습니다.");
		}
	}
	
	public void modifyStudent() {
		
		System.out.println("\n----- 학생 정보 수정 -----");
		System.out.print("수정할 학생 이름 : ");
		
		String name = sc.next();
		String nName;
		
		if (students.containsKey(name)) {
			while (true) {
				System.out.print("이름 입력 : ");
				nName = sc.next();
				
				if (students.containsKey(nName) && !name.equals(nName)) {
					System.out.println("중복된 이름입니다.");
				} else {
					break;
				}
			}
			
			System.out.print("나이 입력 : ");
			int age =sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("주소 입력 : ");
			String addr = sc.nextLine();
			
			students.remove(name);
			students.put(nName, new Student(nName, age,addr));
			
			System.out.println("학생 정보가 수정되었습니다.");
		} else {
			System.out.println("학생이 존재하지 않습니다.");
		}
	}
	
	public void deleteStudent() {
		
		System.out.println("\n----- 학생 정보 삭제 -----");
		System.out.print("삭제할 학생 이름 : ");
		
		String name = sc.next();

		if (students.containsKey(name)) {
			students.remove(name);
			System.out.println("학생 정보가 삭제되었습니다.");
		} else {
			System.out.println("학생이 존재하지 않습니다.");
		}
	}
	
}
