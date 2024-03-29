package notice.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import common.JDBCTemplate;
import notice.model.dao.NoticeDao;
import notice.model.vo.Notice;
import notice.model.vo.NoticeComment;
import notice.model.vo.NoticePageData;
import notice.model.vo.NoticeViewData;

public class NoticeService {
	
	public NoticePageData selectList(int reqPage) {
		
		Connection conn = JDBCTemplate.getConnection();
		int numPerPage = 10;	//한페이지당 게시물 수
		//총 게시물 수를 구해오는 dao 호출
		int totalCount = new NoticeDao().totalCount(conn);
		int totalPage = 0;
		
		//총 페이지수를 연산
		if (totalCount % numPerPage == 0) {
			totalPage = totalCount / numPerPage;
		} else {
			totalPage = totalCount / numPerPage + 1;
		}
		
		//조회해 올 게시물 시작번호와 끝번호 연산
		int start = (reqPage - 1) * numPerPage + 1;
		int end = reqPage * numPerPage;
		
		//해당 페이지의 게시물들 조회
		ArrayList<Notice> list = new NoticeDao().selectList(conn, start, end);
		
		//페이지 네비게이션 작성 시작
		String pageNavi = "";
		//페이지 네비게이션 길이
		int pageNaviSize = 5;
		int pageNo = ((reqPage - 1) / pageNaviSize) * pageNaviSize + 1;
		if (pageNo != 1) {
			pageNavi +="<a class='btn' href='/noticeList?reqPage="+ (pageNo - pageNaviSize) + "'>이전</a>";
		}
		
		for (int i = 0; i < pageNaviSize; i++) {
			if (reqPage == pageNo) {
				pageNavi += "<span class='selectPage'>" + pageNo + "</span>";
			} else {
				pageNavi += "<a class='btn' href='/noticeList?reqPage=" + pageNo + "'>" + pageNo + "</a>";
			}

			pageNo++;
			
			if (pageNo > totalPage) {
				break;
			}
		}
		
		if (pageNo <= totalPage) {
			pageNavi += "<a class='btn' href='/noticeList?reqPage=" + pageNo + "'>다음</a>";
		}
		
		NoticePageData data = new NoticePageData(list, pageNavi);
		
		JDBCTemplate.close(conn);
		
		return data;
	}

	public int insertNotice(Notice n) {

		Connection conn = JDBCTemplate.getConnection();
		int result = new NoticeDao().insertNotice(conn, n);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public NoticeViewData selectOneNotice(int noticeNo) {
		
		Connection conn = JDBCTemplate.getConnection();
		Notice n = new NoticeDao().selectOneNotice(conn, noticeNo);
		ArrayList<NoticeComment> list = new NoticeDao().selectCommentList(conn, noticeNo);
		
		NoticeViewData data = new NoticeViewData(n, list);
		
		JDBCTemplate.close(conn);
		
		return data;
	}

	public int deleteNotice(int noticeNo) {
		
		Connection conn = JDBCTemplate.getConnection();
		int result = new NoticeDao().deleteNotice(conn, noticeNo);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public int updateNotice(Notice n) {
		
		Connection conn = JDBCTemplate.getConnection();
		int result = new NoticeDao().updateNotice(conn, n);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public int noticeCommentInsert(NoticeComment comment) {
		
		Connection conn = JDBCTemplate.getConnection();
		int result = new NoticeDao().noticeCommentInsert(conn, comment);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public int deleteComment(int noticeCommentNo) {
		
		Connection conn = JDBCTemplate.getConnection();
		int result = new NoticeDao().deleteComment(conn, noticeCommentNo);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public int updateComment(int noticeCommentNo, String noticeCommentContent) {

		Connection conn = JDBCTemplate.getConnection();
		int result = new NoticeDao().updateComment(conn, noticeCommentNo, noticeCommentContent);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

}
