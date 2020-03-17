package kh.java.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest {

	public void main() {
		// 1. 드라이버 등록
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Connection 객체 생성
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "kh", "kh");

			String query = "select * from employee";
//			String query = "select emp_name as name from employee";
			// 3. Statement 객체 생성
			Statement stmt = conn.createStatement();
			// 4. 쿼리문 요청 후 결과 받기
			ResultSet rset = stmt.executeQuery(query);

			// 5. 결과처리
			while (rset.next()) {
				 String name = rset.getString(2);
				 int salary = rset.getInt("salary");
				 String phone = rset.getString("phone");
				 System.out.println(name + " : " + salary + " - " + phone);

//				String name = rset.getString("name");
//				System.out.println(name);
			}

			rset.close();
			stmt.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteEmp() {

		Connection conn = null;
		Statement stmt = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("해고할 지원 이름 입력 : ");

		String fireName = sc.next();
		String query = "delete from employee where emp_name = '" + fireName + "'";

		// 1. 드라이버 등록
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "kh", "kh");
			
			// 3. Statement 객체 생성
			stmt = conn.createStatement();
			
			// 4. 쿼리문 요청 후 결과 받기
			int result = stmt.executeUpdate(query);
			
			// 5. 결과처리
			if (result > 0) {
				conn.commit();
				System.out.println("삭제완료");
			} else {
				conn.rollback();
				System.out.println("삭제실패");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// 6. 자원 반환
	}

}
