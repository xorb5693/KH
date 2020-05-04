package notice.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCTemplate;
import notice.model.vo.Notice;
import notice.model.vo.NoticeComment;

public class NoticeDao {
	
	private Notice setNotice(ResultSet rset, int index) throws SQLException {
				
		return new Notice(rset.getInt(index++), 
				rset.getString(index++), 
				rset.getString(index++), 
				rset.getString(index++), 
				rset.getDate(index++), 
				rset.getString(index++), 
				rset.getString(index++));
	}
	
	private NoticeComment setNoticeComment(ResultSet rset, int index) throws SQLException {
		
		return new NoticeComment(rset.getInt(index++),
				rset.getInt(index++),
				rset.getString(index++),
				rset.getString(index++),
				rset.getInt(index++),
				rset.getInt(index++),
				rset.getDate(index++));
				
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
				Notice n = setNotice(rset, 2);
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

	public int insertNotice(Connection conn, Notice n) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "insert into notice values(seq_notice.nextval, ?, ?, ?, sysdate, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			int index = 1;
			pstmt.setString(index++, n.getNoticeTitle());
			pstmt.setString(index++, n.getNoticeWriter());
			pstmt.setString(index++, n.getNoticeContent());
			pstmt.setString(index++, n.getFilename());
			pstmt.setString(index++, n.getFilepath());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}

	public Notice selectOneNotice(Connection conn, int noticeNo) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Notice n = null;
		String query = "select * from notice where notice_no=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
			rset = pstmt.executeQuery();
			
			if (rset.next()) {
				n = setNotice(rset, 1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return n;
	}

	public int deleteNotice(Connection conn, int noticeNo) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "delete from notice where notice_no=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

	public int updateNotice(Connection conn, Notice n) {

		PreparedStatement pstmt = null;
		int result = 0;
		String query = "update notice set notice_title=?, notice_content=?, filename=?, filepath=? where notice_no=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			int index = 1;
			pstmt.setString(index++, n.getNoticeTitle());
			pstmt.setString(index++, n.getNoticeContent());
			pstmt.setString(index++, n.getFilename());
			pstmt.setString(index++, n.getFilepath());
			pstmt.setInt(index++, n.getNoticeNo());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}

	public int noticeCommentInsert(Connection conn, NoticeComment comment) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "insert into notice_comment values(seq_notice_comment.nextval, ?, ?, ?, ?, ?, SYSDATE)";
		
		try {
			pstmt = conn.prepareStatement(query);
			int index = 1;
			pstmt.setInt(index++, comment.getNoticeCommentLevel());
			pstmt.setString(index++, comment.getNoticeCommentWriter());
			pstmt.setString(index++, comment.getNoticeCommentContent());
			pstmt.setInt(index++, comment.getNoticeRef());
//			pstmt.setInt(index++, comment.getNoticeCommentRef() != 0? comment.getNoticeCommentRef() : null);
			pstmt.setString(index++, comment.getNoticeCommentRef()==0 ? null : String.valueOf(comment.getNoticeCommentRef()));
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

	public ArrayList<NoticeComment> selectCommentList(Connection conn, int noticeNo) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<NoticeComment> list = new ArrayList<NoticeComment>();
		String query = "select * from notice_comment where notice_ref = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				NoticeComment comment = setNoticeComment(rset, 1);
				list.add(comment);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return list;
	}

}
