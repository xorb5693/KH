package kh.java.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBConnect {

	private static final String ipAddress = "127.0.0.1";

	public ArrayList<Member> allPrintMember() {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Member> members = new ArrayList<Member>();

		String query = "select * from member order by member_id";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + ipAddress + ":1521:xe", "jdbc", "1234");

			pstmt = conn.prepareStatement(query);

			rset = pstmt.executeQuery();

			while (rset.next()) {
				Member member = new Member(rset.getString(1), rset.getString(2), rset.getString(3),
						((rset.getString(4).charAt(0) == 'M') ? "남자" : "여자"), rset.getInt(5), rset.getString(6),
						rset.getString(7), rset.getDate(8));

				members.add(member);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return members;
	}

	public Member searchId(String memberId) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member member = null;
		
		String query = "select * from member where member_id like ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + ipAddress + ":1521:xe", "jdbc", "1234");
			
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
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return member;
	}

	public ArrayList<Member> searchName(String memberName) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Member> members = new ArrayList<Member>();
		
		String query = "select * from member where member_name like ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + ipAddress + ":1521:xe", "jdbc", "1234");
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%" + memberName + "%");
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				Member m = new Member(
						rset.getString(1),
						rset.getString(2),
						rset.getString(3),
						(rset.getString(4).charAt(0) == 'M' ? "남자" : "여자"),
						rset.getInt(5),
						rset.getString(6),
						rset.getString(7),
						rset.getDate(8)
				);
				
				members.add(m);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return members;
	}
	
	public int insertMember(Member m) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "insert into member values(?, ?, ?, ?, ?, ?, ?, sysdate)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + ipAddress + ":1521:xe", "jdbc", "1234");
			
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
				conn.commit();
			} else {
				conn.rollback();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	public int modifyMember(Member m) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;

		String query = "update member set member_pw = ?, phone = ?, hobby = ? where member_id = ?";
		try {
			// 1. 드라이버 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + ipAddress + ":1521:xe", "jdbc", "1234");

			// 3. Statment 객체 생성 - > PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(query);

			// 4. 위치홀더에 값을 대입하여 쿼리문 완성
			pstmt.setString(1, m.getMemberPw());
			pstmt.setString(2, m.getPhone());
			pstmt.setString(3, m.getHobby());
			pstmt.setString(4, m.getMemberId());

			result = pstmt.executeUpdate();

			if (result > 0) {
				conn.commit();
			} else {
				conn.rollback();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return result;
	}

	public int deleteMember(String memberId) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "delete from member where member_id = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + ipAddress + ":1521:xe", "jdbc", "1234");
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			
			result = pstmt.executeUpdate();
			
			if (result > 0) {
				conn.commit();
			} else {
				conn.rollback();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
}
