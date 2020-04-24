package kh.java.member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCTemplate;
import kh.java.member.model.vo.Member;

public class MemberDao {

	private Member setMember(ResultSet rset) throws SQLException {

		Member m = new Member(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getInt(5));

		return m;
	}

	public Member selectOneMember(Connection conn, Member login) {

		Member m = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "select * from member where member_id=? and member_pw=?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, login.getMemberId());
			pstmt.setString(2, login.getMemberPw());

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

	public int insertMember(Connection conn, Member join) {

		PreparedStatement pstmt = null;
		int result = 0;
		String query = "insert into member values(mem_seq.nextval, ?, ?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, join.getMemberId());
			pstmt.setString(2, join.getMemberPw());
			pstmt.setString(3, join.getMemberName());
			pstmt.setInt(4, join.getFootSize());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}

		return result;
	}

	public int removeMember(Connection conn, String memberId) {

		PreparedStatement pstmt = null;
		int result = 0;
		String query = "delete from member where member_id = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}

		return result;
	}

	public int updateMember(Connection conn, Member m) {

		PreparedStatement pstmt = null;
		int result = 0;
		String query = "update member set member_id=?, member_pw=?, member_name=?, foot_size=? where member_no=?";		
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemberId());
			pstmt.setString(2, m.getMemberPw());
			pstmt.setString(3, m.getMemberName());
			pstmt.setInt(4, m.getFootSize());
			pstmt.setInt(5, m.getMemberNo());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}

		return result;
	}

	public ArrayList<Member> selectAllMember(Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Member> members = new ArrayList<Member>();
		String query = "select * from member order by member_no";
		
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				Member m = setMember(rset);
				members.add(m);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return members;
	}

	public Member selectOneMember(Connection conn, String memberId) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member m = null;
		String query = "select * from member where member_id = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			
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
