package kr.or.iei.student;

import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class StudentMgr {
	
	String[] names = new String[10];	//학생 이름 저장용 배열
	int[] ages = new int[10];		//학생 나이 저장용 배열
	String[] addrs = new String[10];	//학생 주소 저장용 배열
	int index;						//배열 인덱스 관리
	Scanner sc = new Scanner(System.in);
	
	public void main() {
		while (true) {
			System.out.println("===== 학생 관리 프로그램 v1.0 =====");
			System.out.println("1. 학생등록");
			System.out.println("2. 학생 정보 조회(전체)");
			System.out.println("3. 학생 정보 조회(1명)");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1 :
				insertStudent();
				break;
			case 2 :
				printAllStudnet();
				break;
			case 3 :
				printOneStudnet();
				break;
			case 4 :
				modifyStudent();
				break;
			case 5 :
				deleteStudnet();
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	//1. 학생 등록
	private void insertStudent() {
		
		if (index == names.length) {
			System.out.println("배열이 꽉 차 있습니다.");
			return;
		}
		
		System.out.println("\n===== 학생 정보 입력 =====");
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		sc.nextLine();	//개행처리문자 제거용 코드
		
		System.out.print("주소 입력 : ");
		String addr = sc.nextLine();
		
		names[index] = name;
		ages[index] = age;
		addrs[index] = addr;
		
		index++;
		
		System.out.println("학생 정보 등록 성공!");
	}
	
	//2. 학생 정보 조회(전체 정보)
	private void printAllStudnet() {
		
		System.out.println("\n===== 학생 전체 정보 출력 ======");
		System.out.println("이름\t나이\t주소");
		
		for (int i = 0; i < index; i++) {
			System.out.printf("%s\t%d\t%s\n", names[i], ages[i], addrs[i]);
		}
	}
	
	//3. 학생 정보 조회(1명) - 이름 검색
	private void printOneStudnet() {
		
		System.out.println("\n===== 학생 정보 출력(1명) =====");
		int searchIndex = searchStudent("조회");
		
		if (searchIndex != -1) {
			System.out.println("이름 : " + names[searchIndex]);
			System.out.println("나이 : " + ages[searchIndex]);
			System.out.println("주소 : " + addrs[searchIndex]);
		}
	}
	
	//4. 학생 정보 수정
	private void modifyStudent() {
		System.out.println("\n===== 학생 정보 수정 =====");
		int searchIndex = searchStudent("수정");
		
		if (searchIndex != -1) {
			System.out.print("수정할 학생 이름 입력 : ");
			names[searchIndex] = sc.next();
			
			System.out.print("수정할 나이 입력 : ");
			ages[searchIndex] = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("수정할 주소 입력 : ");
			addrs[searchIndex] = sc.nextLine();
			
			System.out.println("수정이 완료되었습니다.");
		}
	}
	
	//5. 학생 정보 삭제
	private void deleteStudnet() {
		System.out.println("\n===== 학생 정보 삭제 =====");
		int searchIndex = searchStudent("삭제");
		
		if (searchIndex != -1) {
			//배열이 꽉 차 있을 때 i + 1이 index까지 증가하면 배열이 초과된다.
			for (int i = searchIndex; i < index - 1; i++) {
				names[i] = names[i + 1];
				ages[i] = ages[i + 1];
				addrs[i] = addrs[i + 1];
			}
			
			//실질적으로 불필요한 코드
			names[index - 1] = null;
			ages[index - 1] = 0;
			addrs[index - 1] = null;
			
			index--;
		}
	}
	
	//6. 이름을 바탕으로 배열의 몇번에 존재하는지 찾아 그 번호를 리턴하는 메소드
	private int searchStudent(String msg) {
		System.out.print(msg + "할 학생 이름을 입력하세요 : ");
		String name = sc.next();
		
		for (int i = 0; i < index; i++) {
			if (names[i].equals(name)) {
				return i;
			}
		}

		System.out.println("학생 정보가 없습니다.");
		return -1;
	}
}
