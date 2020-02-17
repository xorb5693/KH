package kh.java.student.controller;

import java.util.ArrayList;

import kh.java.student.model.vo.Student;
import kh.java.student.view.StudentView;

public class StudentController {

	StudentView view = new StudentView();
	ArrayList<Student> students = new ArrayList<Student>();

	public void main() {
		while (true) {
			int select = view.mainMenu();

			switch (select) {
			case 1:
				insertStudent();
				break;
			case 2:
				view.printAllStudent(students);
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
				view.printMsg("0~5사이의 숫자를 입력하세요.");
			}
			
			delay();
		}
	}

	public void insertStudent() {

		Student stu = view.insertStudent();
		students.add(stu);
		view.printMsg("학생 정보가 등록되었습니다.");
	}

	public void printOneStudent() {

		view.printMsg("\n-----학생 1명 정보 출력 -----");
		
		String name = view.getName();
		int searchIndex = searchStudent(name);

		if (searchIndex == -1) {
			view.printMsg("학생이 존재하지 않습니다.");
		} else {
			view.printOneStudent(students.get(searchIndex));
		}
	}
	
	public void modifyStudent() {
	
		view.printMsg("\n----- 학생 정보 수정 -----");
		
		String name = view.getName();
		int searchIndex = searchStudent(name);
		
		if (searchIndex == -1) {
			view.printMsg("학생이 존재하지 않습니다.");
		} else {
			Student stu = view.modifyStudent();
			students.set(searchIndex, stu);
			view.printMsg("학생 정보가 수정되었습니다.");
		}
	}
	
	public void deleteStudent() {

		view.printMsg("\n----- 학생 정보 삭제 -----");
		
		String name = view.getName();
		int searchIndex = searchStudent(name);
		
		if (searchIndex == -1) {
			view.printMsg("학생이 존재하지 않습니다.");
		} else {
			students.remove(searchIndex);
			view.printMsg("학생 정보가 삭제되었습니다.");
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

	private void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	
}
