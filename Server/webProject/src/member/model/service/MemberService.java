package member.model.service;

import java.sql.Connection;

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
}
