package kh.java.member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCTemplate;
import kh.java.member.model.vo.Member;

public class MemberDao {


	public ArrayList<Member> printAllMember(Connection conn) {

		ArrayList<Member> members = new ArrayList<Member>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;

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
		}

		return members;
	}

	public Member searchId(String memberId, Connection conn) {

		Member member = null;
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
		}

		return member;
	}

	public ArrayList<Member> searchName(String memberName, Connection conn) {

		ArrayList<Member> members = new ArrayList<Member>();
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
		}

		return members;
	}

	public int insertMember(Member m, Connection conn) {

		int result = 0;
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

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}

		return result;
	}

	public int modifyMember(Member m, Connection conn) {

		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update member set member_pw = ?, phone = ?, hobby = ? where member_id = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemberPw());
			pstmt.setString(2, m.getPhone());
			pstmt.setString(3, m.getHobby());
			pstmt.setString(4, m.getMemberId());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
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
