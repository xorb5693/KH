package member.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import common.JDBCTemplate;
import member.model.dao.MemberDao;
import member.model.vo.Member;

public class MemberService {

	private static final String ipAddress = "127.0.0.1";

	public Member selectOneMember(String memberId, String memberPw) {
		
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		Member m = new MemberDao().selectOneMember(conn, memberId, memberPw);
		
		JDBCTemplate.close(conn);
		
		return m;
	}

	public int insertMember(Member m) {

		Connection conn = JDBCTemplate.getConnection(ipAddress);
		
		int result = new MemberDao().insertMember(conn, m);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public Member selectOneMember(String memberId) {
		
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		Member m = new MemberDao().selectOneMember(conn, memberId);
		
		JDBCTemplate.close(conn);
		
		return m;
	}

	public int updateMember(Member m) {
		
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		int result = new MemberDao().updateMember(conn, m);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);

		return result;
	}

	public int deleteMember(String memberId) {
		
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		int result = new MemberDao().deleteMember(conn, memberId);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public ArrayList<Member> selectAllMember() {
		
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		ArrayList<Member> list = new MemberDao().selectAllMember(conn);
		
		JDBCTemplate.close(conn);
		
		return list;
	}

	public ArrayList<Member> selectMember(String type, String keyword) {
		
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		ArrayList<Member> list = null;
		
		switch(type) {
		case "memberId":
			list = new MemberDao().selectIdMember(conn, keyword);
			break;
		case "memberName":
			list = new MemberDao().selectNameMember(conn, keyword);
			break;
		}
		
		JDBCTemplate.close(conn);
		
		return list;
	}
}
