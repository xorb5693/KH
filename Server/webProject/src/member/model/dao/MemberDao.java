package member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.JDBCTemplate;
import member.model.vo.Member;

public class MemberDao {
	
	private Member setMember(ResultSet rset) throws SQLException {
		
		return new Member(rset.getString(1),
				rset.getString(2),
				rset.getString(3),
				rset.getInt(4),
				rset.getString(5),
				rset.getString(6),
				rset.getString(7),
				rset.getDate(8));
	}

	public Member selectOneMember(Connection conn, String memberId, String memberPw) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member m = null;
		String query = "select * from member where member_id=? and member_pw = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			pstmt.setString(2, memberPw);
			
			rset = pstmt.executeQuery();
			
			if (rset.next()) {
				m = setMember(rset);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return m;
	}

}
