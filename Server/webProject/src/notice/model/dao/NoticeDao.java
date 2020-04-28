package notice.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCTemplate;
import notice.model.vo.Notice;

public class NoticeDao {
	
	private Notice setNotice(ResultSet rset) throws SQLException {
		
		int index = 1;
		
		return new Notice(rset.getInt(index++), 
				rset.getString(index++), 
				rset.getString(index++), 
				rset.getString(index++), 
				rset.getDate(index++), 
				rset.getString(index++), 
				rset.getString(index++));
	}

	public ArrayList<Notice> selectList(Connection conn, int start, int end) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Notice> list = new ArrayList<Notice>();
		String query = "SELECT * " + 
				"FROM(" + 
				"SELECT ROWNUM AS RNUM, N.* " + 
				"FROM ( " + 
				"SELECT * FROM NOTICE ORDER BY NOTICE_NO DESC) N " + 
				") WHERE RNUM BETWEEN ? AND ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Notice n = new Notice();
				n.setNoticeNo(rset.getInt("notice_no"));
				n.setNoticeTitle(rset.getString("notice_title"));
				n.setNoticeWriter(rset.getString("notice_writer"));
				n.setNoticeDate(rset.getDate("notice_date"));
				list.add(n);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return list;
	}

	public int totalCount(Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;
		String query = "select count(*) as cnt from notice";
		
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			if (rset.next()) {
				result = rset.getInt("cnt");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

}
