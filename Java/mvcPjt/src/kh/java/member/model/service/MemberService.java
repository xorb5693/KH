package kh.java.member.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import common.JDBCTemplate;
import kh.java.member.model.dao.MemberDao;
import kh.java.member.model.vo.Member;

public class MemberService {
	
	private static final String ipAddress = "127.0.0.1";
	
	private void setGender(Member m) {
		if (m.getGender().charAt(0) == 'M') {
			m.setGender("남자");
		} else {
			m.setGender("여자");
		}
	}

	public ArrayList<Member> printAllMember() {
		
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		MemberDao dao = new MemberDao();
		ArrayList<Member> arr = dao.printAllMember(conn);
		
		JDBCTemplate.close(conn);
		
		for (Member m : arr) {
			setGender(m);
		}
		
		return arr;
	}

	public ArrayList<Member> printOneMember(String memberName) {
		
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		MemberDao dao = new MemberDao();
		ArrayList<Member> arr = dao.printOneMember(conn, memberName);
		
		JDBCTemplate.close(conn);
		
		for (Member m : arr) {
			setGender(m);
		}
		
		return arr;
	}

	public int insertMember(Member m) {
		
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		MemberDao dao = new MemberDao();
		int result = dao.insertMember(conn, m);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public Member selectId(String memberId) {
		
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		MemberDao dao = new MemberDao();
		Member m = dao.selectId(conn, memberId);
		
		JDBCTemplate.close(conn);
		
		return m;
	}

	public int modifyMember(Member modifyM) {
		
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		MemberDao dao = new MemberDao();
		int result = dao.modifyMember(conn, modifyM);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public int[] deleteMember(Member m) {
		
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		MemberDao dao = new MemberDao();
		int result[] = dao.deleteMember(conn, m);
		
		if (result[0] > 0 && result[1] > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}
}
