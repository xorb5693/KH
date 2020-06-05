package kr.or.tg.board.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.or.tg.board.model.dao.BoardDao;
import kr.or.tg.board.model.vo.Board;
import kr.or.tg.board.model.vo.BoardData;
import kr.or.tg.member.model.dao.MemberDao;

@Service("boardService")
public class BoardService {
	
	@Autowired
	@Qualifier("boardDao")
	private BoardDao boardDao;
	
	@Autowired
	@Qualifier("memberDao")
	private MemberDao memberDao;

	public BoardData selectAllBoard(HashMap<String, String> map, int reqPage) {
		
		int totalCount = boardDao.totalCount(map);
		int numPerPage = 10;
		int totalPage;
		if (totalCount % numPerPage == 0) {
			totalPage = (totalCount / numPerPage) + 1;
		} else {
			totalPage = (totalCount / numPerPage);
		}
		
		int start = (reqPage - 1) * numPerPage + 1;
		int end = reqPage * numPerPage;
		
		map.put("start", String.valueOf(start));
		map.put("end", String.valueOf(end));
		
		List<Board> list = boardDao.selectAllBoard(map);
		
		StringBuffer pageNavi = new StringBuffer("");
		int pageSize = 10;
		int pageNo = ((reqPage - 1) / pageSize) * pageSize + 1;
		
		if (pageNo != 1) {
			pageNavi.append("<a href='/board.do?boardType=" + map.get("boardType") + "&reqPage=" + (pageNo -1 ));
			if (map.get("type") != null) {
				pageNavi.append("&type=" + map.get("type") + "&keyword=" + map.get("keyowrd"));
			}
			pageNavi.append("'>이전</a>");
		}
		
		for (int i = 0; i < pageSize; i++) {
			if (pageNo == reqPage) {
				pageNavi.append("<span>" + pageNo + "<span>");
			} else {
				pageNavi.append("<a href='/board.do?boardType=" + map.get("boardType") + "&reqPage=" + pageNo);
				
				if (map.get("type") != null) {
					pageNavi.append("&type=" + map.get("type") + "&keyword=" + map.get("keyowrd"));
				}
				pageNavi.append("'>" + pageNo + "</a>");
			}
			
			pageNo++;
			
			if (pageNo > totalPage) {
				break;
			}
		}
		
		if (pageNo <= totalPage) {
			pageNavi.append("<a href='/board.do?boardType=" + map.get("boardType") + "&reqPage=" + pageNo);
			
			if (map.get("type") != null) {
				pageNavi.append("&type=" + map.get("type") + "&keyword=" + map.get("keyowrd"));
			}
			pageNavi.append("'>다음</a>");
		}
		
		return new BoardData((ArrayList<Board>)list, pageNavi.toString());
	} 
}
