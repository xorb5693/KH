package photo.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCTemplate;
import photo.model.vo.Photo;

public class PhotoDao {
	
	public Photo setPhoto(ResultSet rset, int index) throws SQLException {
		
		return new Photo(rset.getInt(index++),
				rset.getString(index++),
				rset.getString(index++),
				rset.getString(index++),
				rset.getString(index++),
				rset.getDate(index++),
				rset.getInt(index++));
	}

	public int photoWrite(Connection conn, Photo photo) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "insert into photo values(seq_photo.nextval, ?, ?, ?, ?, sysdate, 0)";
		
		try {
			pstmt = conn.prepareStatement(query);
			int index = 1;
			pstmt.setString(index++, photo.getPhotoWriter());
			pstmt.setString(index++, photo.getPhotoContent());
			pstmt.setString(index++, photo.getPhotoFilename());
			pstmt.setString(index++, photo.getPhotoFilepath());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

	public int totalCount(Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;
		String query = "select count(*) as cnt from photo";
		
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

	public ArrayList<Photo> morePhoto(Connection conn, int start, int end) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Photo> list = new ArrayList<Photo>();
		String query = "SELECT * FROM (SELECT ROWNUM AS RNUM, P.* FROM (SELECT * FROM PHOTO ORDER BY PHOTO_NO DESC) P) WHERE RNUM BETWEEN ? AND ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				Photo photo = setPhoto(rset, 2);
				
				list.add(photo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
