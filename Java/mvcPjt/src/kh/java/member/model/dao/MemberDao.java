package kh.java.member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCTemplate;
import kh.java.member.model.vo.Member;

public class MemberDao {
	
	private Member getMember(ResultSet rset) {
		
		Member m = null;
		try {
			m = new Member(rset.getString(1), 
					rset.getString(2), 
					rset.getString(3), 
					rset.getString(4),
					rset.getInt(5),
					rset.getString(6),
					rset.getString(7),
					rset.getDate(8));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return m;
	}

	public ArrayList<Member> printAllMember(Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "select * from member order by enroll_date";
		ArrayList arr = new ArrayList<Member>();
		
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				Member m = getMember(rset);
				arr.add(m);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}

		return arr;
	}

	public ArrayList printOneMember(Connection conn, String memberName) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "select * from member where member_name = ? order by enroll_date";
		ArrayList<Member> arr = new ArrayList<Member>();
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberName);
			
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				Member m = getMember(rset);
				arr.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return arr;
	}

	public int insertMember(Connection conn, Member m) {
		
		PreparedStatement pstmt = null;
		String query = "insert into member values(?, ?, ?, ?, ?, ?, ?, sysdate)";
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemberId());
			pstmt.setString(2, m.getMemberPw());
			pstmt.setString(3, m.getMemberName());
			pstmt.setString(4, m.getGender());
			pstmt.setInt(5, m.getAge());
			pstmt.setString(6, m.getPhone());
			pstmt.setString(7, m.getHobby());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

	public Member selectId(Connection conn, String memberId) {
		
		Member m = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "select * from member where member_id = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			rset = pstmt.executeQuery();
			
			if (rset.next()) {
				m = getMember(rset);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return m;
	}

	public int modifyMember(Connection conn, Member modifyM) {

		PreparedStatement pstmt = null;
		String query = "update member set member_name = ?, age = ?, hobby = ? where member_id = ?";
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, modifyM.getMemberName());
			pstmt.setInt(2, modifyM.getAge());
			pstmt.setString(3, modifyM.getHobby());
			pstmt.setString(4, modifyM.getMemberId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

	public int[] deleteMember(Connection conn, Member m) {
		
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		int result[] = {0, 0};
		String query1 = "delete from member where member_id = ?";
		String query2 = "insert into del_member values(del_seq.nextval, ?, sysdate)";
		
		try {
			pstmt1 = conn.prepareStatement(query1);
			pstmt1.setString(1, m.getMemberId());
			result[0] = pstmt1.executeUpdate();
			
			pstmt2 = conn.prepareStatement(query2);
			pstmt2.setString(1, m.getMemberId());
			result[1] = pstmt2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt2);
			JDBCTemplate.close(pstmt1);
		}
		
		return result;
	}

}
