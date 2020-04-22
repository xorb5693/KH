package kh.java.member.model.service;

import java.sql.Connection;

import common.JDBCTemplate;
import kh.java.member.model.dao.MemberDao;
import kh.java.member.model.vo.Member;

public class MemberService {

	private static final String ipAddress ="127.0.0.1";

	public Member selectOneMember(Member login) {
		
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		MemberDao dao = new MemberDao();
		Member m = dao.selectOneMember(conn, login);
		
		JDBCTemplate.close(conn);
		
		return m;
	}

	public int insertMember(Member join) {
		
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		int result = new MemberDao().insertMember(conn, join);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}
	
}
