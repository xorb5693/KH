package kh.java.controller;

import java.util.ArrayList;

import kh.java.member.model.dao.MemberDao;
import kh.java.member.model.vo.Member;
import kh.java.member.view.MemberView;

public class MemberController {

	MemberView view = new MemberView(this);

	public void main() {
		while (true) {
			int sel = view.mainMenu();

			switch (sel) {
			case 1:
				printAllMember();
				break;
			case 2:
				view.searchId();
				break;
			case 3:
				view.searchName();
				break;
			case 4:
				insertMember();
				break;
			case 5:
				modifyMember();
				break;
			case 6:
				deleteMember();
				break;
			case 0:
				return;
			}

			delay();
		}
	}

	public void printAllMember() {

		MemberDao dao = new MemberDao();
		ArrayList<Member> members = dao.printAllMember();
		view.printAllMember(members);
	}

	public Member searchId(String memberId) {

		MemberDao dao = new MemberDao();
		Member m = dao.searchId(memberId);

		return m;
	}

	public ArrayList<Member> searchName(String memberName) {

		MemberDao dao = new MemberDao();
		ArrayList<Member> members = dao.searchName(memberName);

		return members;
	}

	public void insertMember() {

		Member m = view.insertMember();
		MemberDao dao = new MemberDao();

		int result = dao.insertMember(m);

		if (result > 0) {
			view.printMsg("회원 가입에 성공하셨습니다.");
		} else {
			view.printMsg("회원 가입에 실패하였습니다.");
		}
	}

	public void modifyMember() {

		Member m = view.modifyMember();
		MemberDao dao = new MemberDao();
		int result = dao.modifyMember(m);

		if (result > 0) {
			view.printMsg("회원 정보가 수정되었습니다.");
		} else {
			view.printMsg("회원 정보 수정에 실패하였습니다.");
		}
	}

	public void deleteMember() {

		String memberId = view.deleteMember();

		if (memberId != null) {

			MemberDao dao = new MemberDao();
			int result = dao.deleteMember(memberId);

			if (result > 0) {
				view.printMsg("회원을 삭제하였습니다.");
			} else {
				view.printMsg("회원 삭제에 실패하였습니다.");
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
