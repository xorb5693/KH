package kh.exam.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCTemplate;
import kh.exam.model.vo.Board;
import kh.exam.model.vo.Member;

public class ExamDao {

	public Member getMember(ResultSet rset) throws SQLException {

		Member m = new Member(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5));

		return m;
	}
	
	public Member idSearch(Connection conn, String memberId) {

		Member m = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * from exam_member where member_id = ?";

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

	public int insertMember(Connection conn, Member m) {

		PreparedStatement pstmt = null;
		int result = 0;

		String query = "insert into exam_member values(mem_seq.nextval, ?, ?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemberId());
			pstmt.setString(2, m.getMemberPw());
			pstmt.setString(3, m.getMemberName());
			pstmt.setString(4, m.getPhone());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}

		return result;
	}
	
	public String searchMember(Connection conn, Member m) {
		
		String memberId = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select member_id from exam_member where member_name = ? and phone = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemberName());
			pstmt.setString(2, m.getPhone());
			
			rset = pstmt.executeQuery();
			
			if (rset.next()) {
				memberId = rset.getString(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return memberId;
	}
	
	public Member login(Connection conn, Member m) {
		
		Member member = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from exam_member where member_id = ? and member_pw = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemberId());
			pstmt.setString(2, m.getMemberPw());
			
			rset = pstmt.executeQuery();
			
			if (rset.next()) {
				member = getMember(rset);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return member;
	}
	
	public ArrayList<Board> getBoardList(Connection conn) {
		
		ArrayList<Board> boards = new ArrayList<Board>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select board_no, board_title, NVL(member_name, '탈퇴회원'), read_count, write_date from exam_board "
				+ "left join exam_member on (member_id = board_writer) order by board_no desc";
		
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Board board =  new Board(
						rset.getInt(1),
						rset.getString(2),
						null,
						rset.getString(3),
						rset.getInt(4),
						rset.getDate(5)
				);
				
				boards.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return boards;
	}
	
	public Board readBoard(Connection conn, int boardNo) {
		
		Board board = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select board_no, board_title, board_content, NVL(member_name, '탈퇴회원'), read_count, write_date from exam_board "
				+ "left join exam_member on (member_id = board_writer) where board_no = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, boardNo);
			
			rset = pstmt.executeQuery();
			
			if (rset.next()) {
				board = new Board(
						rset.getInt(1),
						rset.getString(2),
						rset.getString(3),
						rset.getString(4),
						rset.getInt(5),
						rset.getDate(6)
				);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return board;
	}
	
	public int plusReadCount(Connection conn, int boardNo) {
		
		int result = 0;
		PreparedStatement pstmt = null;

		String query = "update exam_board set read_count = read_count + 1 where board_no = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, boardNo);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public Board readMyBoard(Connection conn, int boardNo, String boardWriter) {
		
		Board board = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select board_no from exam_board where board_no = ? and board_writer = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, boardNo);
			pstmt.setString(2, boardWriter);
			
			rset = pstmt.executeQuery();
			
			if (rset.next()) {
				board = new Board();
				board.setBoardNo(rset.getInt(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return board;
	}

	public int modifyBoard(Connection conn, Board board) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update exam_board set board_title = ?, board_content = ? where board_no = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, board.getBoardTitle());
			pstmt.setString(2, board.getBoardContent());
			pstmt.setInt(3, board.getBoardNo());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}
	
	public int deleteBoard(Connection conn, int boardNo) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from exam_board where board_no = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, boardNo);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}
	
	public int insertBoard(Connection conn, Board board) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "insert into exam_board values(board_seq.nextval, ?, ?, ?, 0, sysdate)";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, board.getBoardTitle());
			pstmt.setString(2, board.getBoardContent());
			pstmt.setString(3, board.getBoardWriter());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}
		
	public int modifyMember(Connection conn, Member m) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update exam_member set member_pw = ?, phone = ? where member_id = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemberPw());
			pstmt.setString(2, m.getPhone());
			pstmt.setString(3, m.getMemberId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

	public int deleteMember(Connection conn, Member m) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from exam_member where member_id = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemberId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}
	
}
