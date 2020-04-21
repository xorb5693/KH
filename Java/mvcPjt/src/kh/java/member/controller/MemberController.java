package kh.java.member.controller;

import java.util.ArrayList;

import kh.java.member.model.service.MemberService;
import kh.java.member.model.vo.Member;
import kh.java.memver.view.MemberView;

public class MemberController {

	MemberView view = new MemberView();
	MemberService service = new MemberService();

	public void main() {
		while (true) {
			int sel = view.mainMenu();

			switch (sel) {
			case 1:
				printAllMember();
				break;
			case 2:
				printOneMember();
				break;
			case 3:
				insertMember();
				break;
			case 4:
				modifyMember();
				break;
			case 5:
				deleteMember();
				break;
			case 0:
				return;
			}
			
			delay();
		}
	}

	public void printAllMember() {
		ArrayList<Member> arr = service.printAllMember();

		if (arr.isEmpty()) {
			view.printMsg("등록된 회원이 없습니다.");
		} else {
			view.printAllMember(arr);
		}
	}
	
	public void printOneMember() {
		String memberName = view.getName();
		ArrayList<Member> arr = service.printOneMember(memberName);
		
		if (arr.isEmpty()) {
			view.printMsg("해당 회원이 존재하지 않습니다.");
		} else {
			view.printOneMember(arr);
		}
	}

	public void insertMember() {
		Member m = view.insertMember();

		int result = service.insertMember(m);

		if (result > 0) {
			view.printMsg("회원가입 성공!");
		} else {
			view.printMsg("회원가입 실패");
		}
	}
	
	public void modifyMember() {
		
		String memberId = view.getId("수정");
		
		Member m = service.selectId(memberId);
		
		if (m == null) {
			view.printMsg("해당 회원이 존재하지 않습니다.");
		} else {
			Member modifyM = view.modifyMember(memberId);
			int result = service.modifyMember(modifyM);
			
			if (result > 0) {
				view.printMsg("회원정보 수정 성공!");
			} else {
				view.printMsg("회원정보 수정 실패");
			}
		}
	}
	
	public void deleteMember() {
		
		String memberId = view.getId("삭제");
		Member m = service.selectId(memberId);
		
		if (m == null) {
			view.printMsg("해당 회원이 존재하지 않습니다.");
		} else {
			char ch = view.request();
			
			if (ch == 'y') {
				int result[] = service.deleteMember(m);
				
				if (result[0] > 0 && result[1] > 0) {
					System.out.println("회원 정보 삭제에 성공했습니다.");
				} else {
					System.out.println("회원 정보 삭제에 실패했습니다.");
				}
			} else {
				view.printMsg("회원 삭제를 취소하셨습니다.");
			}
		}
	}
	
	public void delay() {
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
