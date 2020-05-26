package board.model.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import board.model.dao.BoardDao;
import board.model.vo.Board;
import board.model.vo.BoardData;
import common.SqlSessionTemplate;

public class BoardService {

	public BoardData selectList(int reqPage) {
		
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int totalCount = new BoardDao().totalCount(session);
		int numPerPage = 10;
		int totalPage;
		
		if (totalCount % numPerPage == 0) {
			totalPage = totalCount / numPerPage;
		} else {
			totalPage = totalCount / numPerPage + 1;
		}
		
		int start = (reqPage - 1) * numPerPage + 1;
		int end = reqPage * numPerPage;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("start", String.valueOf(start));
		map.put("end", String.valueOf(end));
		
		List<Board> list = new BoardDao().selectList(session, map);
		
		StringBuffer pageNavi = new StringBuffer("");
		int pageNaviSize = 3;
		int pageNo = ((reqPage - 1) / pageNaviSize) * pageNaviSize + 1;
		
		if (pageNo != 1) {
			pageNavi.append("<a href='/boardList?reqPage=" + (pageNo - 1) + "'>[이전]</a>");
		}
		
		for (int i = 0; i < pageNaviSize; i++) {
			
			if (reqPage == pageNo) {
				pageNavi.append("<span>" + pageNo + "</span>");
			} else {
				
			}
		}
		
		return null;
	}

}
