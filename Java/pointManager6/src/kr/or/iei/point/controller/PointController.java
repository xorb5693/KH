package kr.or.iei.point.controller;

import java.util.ArrayList;
import java.util.HashMap;

import kr.or.iei.point.model.vo.Grade;
import kr.or.iei.point.view.PointView;

public class PointController {

	PointView view = new PointView();
	HashMap<String, Grade> members = new HashMap<String, Grade>();

	public void main() {

		while (true) {
			int select = view.mainMenu();

			switch (select) {
			case 1:
				insertMember();
				break;
			case 2:
				view.printAllMember(new ArrayList(members.values()));
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
				view.printMsg("0~5 사이의 숫자를 입력하세요.");
			}
			
			delay();
		}
	}

	public void insertMember() {
		Grade member = view.insertMember(members.keySet());
		if (member != null) {
			members.put(member.getName(), member);
			view.printMsg("회원이 등록되었습니다.");
		} else {
			view.printMsg("회원 등록이 실패했습니다.");
		}
	}
	
	public void printOneMember() {
		
		view.printMsg("\n----- 회원 1명 출력 -----");
		String name = view.getName();
		
		if (members.containsKey(name)) {
			view.printOneMember(members.get(name));
		} else {
			view.printMsg("회원이 존재하지 않습니다.");
		}
	}
	
	public void modifyMember() {
		
		view.printMsg("\n----- 회원 정보 수정 -----");
		String name = view.getName();
		
		if (members.containsKey(name)) {
			Grade member = view.modifyMember(members.keySet(), name);
			
			if (member != null) {
				if (member.getName().equals(name)) {
					members.put(name, member);
				} else {
					members.remove(name);
					members.put(member.getName(), member);
				}
				view.printMsg("회원 정보가 수정되었습니다.");
			} else {
				view.printMsg("회원 정보 수정이 실패했습니다.");
			}
		} else {
			view.printMsg("회원이 존재하지 않습니다.");
		}
	}
	
	public void deleteMember() {
		view.printMsg("\n----- 회원 정보 삭제 -----");
		String name = view.getName();
		
		if (members.containsKey(name)) {
			members.remove(name);
			view.printMsg("회원 정보가 삭제되었습니다.");
		} else {
			view.printMsg("회원이 존재하지 않습니다.");
		}
	}


	public void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
