package kh.java.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBConnect {

	public Member idSearch(String memberId) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
//		HashMap<String, Object> member = new HashMap<String, Object>();
		Member mem = null;
		
		String query = "select * from member where member_id = '" + memberId + "'";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "jdbc", "1234");
			
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
//				member.put("id", rset.getString("member_id"));
//				member.put("pw", rset.getString("member_pw"));
//				member.put("name", rset.getString("member_name"));
//				member.put("gender", (rset.getString("gender").charAt(0) == 'M' ? "남자" : "여자"));
//				member.put("age", rset.getInt("age"));
//				member.put("phone", rset.getString("phone"));
//				member.put("hobby", rset.getString("hobby"));
//				Date enrollDate = rset.getDate("enroll_date");
//				member.put("enrollDate", enrollDate);
				
//				mem = new Member(
//						rset.getString("member_id"),
//						rset.getString("member_pw"),
//						rset.getString("member_name"),
//						(rset.getString("gender").charAt(0) == 'M' ? "남자" : "여자"), 
//						rset.getInt("age"),
//						rset.getString("phone"),
//						rset.getString("hobby"),
//						rset.getDate("enroll_date")
//				);

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
		
//		return member;
		return mem;
	}
	
	public ArrayList<Member> nameSearch(String memberName) {
		
		ArrayList<Member> list = new ArrayList<Member>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
//		드라이버 등록
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
//			Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "jdbc", "1234");
			
//			Statemnt 객체 생성
			stmt = conn.createStatement();
			
//			쿼리문 요청 후 결과 받기
			String query = "select * from member where member_name = '" + memberName + "' order by member_id";
			rset = stmt.executeQuery(query);
		
//			결과처리
			
			while (rset.next()) {
				Member mem = new Member(
						rset.getString("member_id"),
						rset.getString("member_pw"),
						rset.getString("member_name"),
						((rset.getString("gender").charAt(0) == 'M') ? "남자" : "여자"),
						rset.getInt("age"),
						rset.getString("phone"),
						rset.getString("hobby"),
						rset.getDate("enroll_date")
				);
				
				list.add(mem);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			자원 반환
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
}
