package kh.java.member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCTemplate;
import kh.java.member.model.vo.Member;

public class MemberDao {

	private static final String ipAddress = "127.0.0.1";

	public ArrayList<Member> printAllMember() {

		ArrayList<Member> members = new ArrayList<Member>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Connection conn = JDBCTemplate.getConnection(ipAddress);

		String query = "select * from member order by member_id";

		try {
			pstmt = conn.prepareStatement(query);

			rset = pstmt.executeQuery();

			while (rset.next()) {

				Member m = new Member(
						rset.getString(1), 
						rset.getString(2), 
						rset.getString(3),
						(rset.getString(4).charAt(0) == 'M' ? "남성" : "여성"), 
						rset.getInt(5), 
						rset.getString(6),
						rset.getString(7), 
						rset.getDate(8)
				);
				
				members.add(m);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(conn);
		}

		return members;
	}

	public Member searchId(String memberId) {

		Member member = null;
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * from member where member_id = ?";

		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);

			rset = pstmt.executeQuery();

			if (rset.next()) {
				member = new Member(
						rset.getString(1), 
						rset.getString(2), 
						rset.getString(3),
						(rset.getString(4).charAt(0) == 'M' ? "남자" : "여자"), 
						rset.getInt(5), 
						rset.getString(6),
						rset.getString(7), 
						rset.getDate(8)
				);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(conn);
		}

		return member;
	}

	public ArrayList<Member> searchName(String memberName) {

		ArrayList<Member> members = new ArrayList<Member>();
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * from member where member_name like ? order by member_id";

		try {
			
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, "%" + memberName + "%");

			rset = pstmt.executeQuery();

			while (rset.next()) {
				Member member = new Member(
						rset.getString(1), 
						rset.getString(2), 
						rset.getString(3),
						(rset.getString(4).charAt(0) == 'M' ? "남자" : "여자"), 
						rset.getInt(5), 
						rset.getString(6),
						rset.getString(7), 
						rset.getDate(8)
				);

				members.add(member);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(conn);
		}

		return members;
	}

	public int insertMember(Member m) {

		int result = 0;
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		PreparedStatement pstmt = null;

		String query = "insert into member values(?, ?, ?, ?, ?, ?, ?, sysdate)";

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

			if (result > 0) {
				JDBCTemplate.commit(conn);
			} else {
				JDBCTemplate.rollback(conn);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(conn);
		}

		return result;
	}

	public int modifyMember(Member m) {

		int result = 0;
		Connection conn = JDBCTemplate.getConnection(ipAddress);
		PreparedStatement pstmt = null;

		String query = "update member set member_pw = ?, phone = ?, hobby = ? where member_id = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemberPw());
			pstmt.setString(2, m.getPhone());
			pstmt.setString(3, m.getHobby());
			pstmt.setString(4, m.getMemberId());

			result = pstmt.executeUpdate();

			if (result > 0) {
				JDBCTemplate.commit(conn);
			} else {
				JDBCTemplate.rollback(conn);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(conn);
		}

		return result;
	}

	public int deleteMember(String memberId, Connection conn) {

		String query = "delete from member where member_id = ?";
		PreparedStatement pstmt = null;
		int result = 0;

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

	public int insertDelMember(String memberId, Connection conn) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "insert into del_member values(del_seq.nextval, ?, sysdate)";
		
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
}
