package kh.java.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBConnect {
	
	private final static String ipAddress = "127.0.0.1";

	public ArrayList<Member> allMemberSearch() {

		ArrayList<Member> list = new ArrayList<Member>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;

		// 드라이버 등록
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + ipAddress +":1521:xe", "jdbc", "1234");

			// Statemnt 객체 생성
			stmt = conn.createStatement();

			// 쿼리문 요청 후 결과 받기
			String query = "select * from member order by member_id";
			rset = stmt.executeQuery(query);

			// 결과처리

			while (rset.next()) {
				Member mem = new Member(rset.getString("member_id"), rset.getString("member_pw"),
						rset.getString("member_name"), ((rset.getString("gender").charAt(0) == 'M') ? "남자" : "여자"),
						rset.getInt("age"), rset.getString("phone"), rset.getString("hobby"),
						rset.getDate("enroll_date"));

				list.add(mem);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 자원 반환
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;
	}

	public Member idSearch(String memberId) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		// HashMap<String, Object> member = new HashMap<String, Object>();
		Member mem = null;

		String query = "select * from member where member_id = '" + memberId + "'";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + ipAddress + ":1521:xe", "jdbc", "1234");

			stmt = conn.createStatement();

			rset = stmt.executeQuery(query);

			if (rset.next()) {
				// member.put("id", rset.getString("member_id"));
				// member.put("pw", rset.getString("member_pw"));
				// member.put("name", rset.getString("member_name"));
				// member.put("gender", (rset.getString("gender").charAt(0) == 'M' ? "남자" :
				// "여자"));
				// member.put("age", rset.getInt("age"));
				// member.put("phone", rset.getString("phone"));
				// member.put("hobby", rset.getString("hobby"));
				// Date enrollDate = rset.getDate("enroll_date");
				// member.put("enrollDate", enrollDate);

				// mem = new Member(
				// rset.getString("member_id"),
				// rset.getString("member_pw"),
				// rset.getString("member_name"),
				// (rset.getString("gender").charAt(0) == 'M' ? "남자" : "여자"),
				// rset.getInt("age"),
				// rset.getString("phone"),
				// rset.getString("hobby"),
				// rset.getDate("enroll_date")
				// );

				mem = new Member();
				mem.setMemberId(rset.getString("member_id"));
				mem.setMemberPw(rset.getString("member_pw"));
				mem.setMemberName(rset.getString("member_name"));
				mem.setGender((rset.getString("gender").charAt(0) == 'M' ? "남자" : "여자"));
				mem.setAge(rset.getInt("age"));
				mem.setPhone(rset.getString("phone"));
				mem.setHobby(rset.getString("hobby"));
				mem.setEnrollDate(rset.getDate("enroll_date"));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// return member;
		return mem;
	}

	public ArrayList<Member> nameSearch(String memberName) {

		ArrayList<Member> list = new ArrayList<Member>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;

		// 드라이버 등록
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + ipAddress + ":1521:xe", "jdbc", "1234");

			// Statemnt 객체 생성
			stmt = conn.createStatement();

			// 쿼리문 요청 후 결과 받기
			String query = "select * from member where member_name = '" + memberName + "' order by member_id";
			rset = stmt.executeQuery(query);

			// 결과처리

			while (rset.next()) {
				Member mem = new Member(rset.getString("member_id"), rset.getString("member_pw"),
						rset.getString("member_name"), ((rset.getString("gender").charAt(0) == 'M') ? "남자" : "여자"),
						rset.getInt("age"), rset.getString("phone"), rset.getString("hobby"),
						rset.getDate("enroll_date"));

				list.add(mem);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 자원 반환
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;
	}

	public int insertMember(Member member) {

		Connection conn = null;
		Statement stmt = null;
		int result = 0;

		String query = "insert into member values(" + "'" + member.getMemberId() + "', " + "'" + member.getMemberPw()
				+ "', " + "'" + member.getMemberName() + "', " + "'" + member.getGender() + "', " + member.getAge()
				+ ", " + "'" + member.getPhone() + "', " + "'" + member.getHobby() + "', " + "SYSDATE)";

		// System.out.println(query);

		// 드라이버 등록
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + ipAddress + ":1521:xe", "jdbc", "1234");

			// Statemnt 객체 생성
			stmt = conn.createStatement();
			// 쿼리문 요청 후 결과 받기
			result = stmt.executeUpdate(query);
			// 결과처리
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
			// 자원 반환
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	public int updateMember(Member member) {

		// 비밀번호, 전화번호, 취미만 수정
		Connection conn = null;
		Statement stmt = null;
		int result = 0;

		String query = "update member set " + "member_pw = '" + member.getMemberPw() + "', " + "phone = '"
				+ member.getPhone() + "', " + "hobby = '" + member.getHobby() + "' " + "where member_id = '"
				+ member.getMemberId() + "'";

		// System.out.println(query);

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + ipAddress + ":1521:xe", "jdbc", "1234");

			stmt = conn.createStatement();

			result = stmt.executeUpdate(query);

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
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	public int deleteMember(String memberId) {

		Connection conn = null;
		Statement stmt = null;
		int result = 0;

		String query = "delete from member where member_id = '" + memberId + "'";

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + ipAddress + ":1521:xe", "jdbc", "1234");

			stmt = conn.createStatement();

			result = stmt.executeUpdate(query);

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
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
