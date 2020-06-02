package kr.or.iei.notice.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.iei.notice.model.dao.NoticeDao;
import kr.or.iei.notice.model.vo.Notice;
import kr.or.iei.notice.model.vo.NoticeData;

@Service("noticeService")
public class NoticeService {

	@Autowired
	@Qualifier("noticeDao")
	private NoticeDao noticeDao;

	@Transactional
	public int insertNotice(Notice notice) {
		
		return noticeDao.insertNotice(notice);
	}

	public NoticeData noticeList(int reqPage, String type, String keyword) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("type", type);
		map.put("keyword", keyword);
		
		int totalCount = noticeDao.totalCount(map);
		int numPerPage = 5;
		int totalPage;
		if (totalCount % numPerPage == 0) {
			totalPage = totalCount / numPerPage;
		} else {
			totalPage = totalCount / numPerPage + 1; 
		}
		
		int start = (reqPage - 1) * numPerPage + 1;
		int end = reqPage * numPerPage;
		
		map.put("start", String.valueOf(start));
		map.put("end", String.valueOf(end));
		List<Notice> list = noticeDao.noticeList(map);
		
		int pageNaviSize = 5;
		int pageNo; 
		if (reqPage % pageNaviSize == 0) {
			pageNo = ((reqPage / pageNaviSize) - 1) * pageNaviSize + 1;
		} else {
			pageNo = (reqPage / pageNaviSize) * pageNaviSize + 1;
		}
		
		StringBuffer pageNavi = new StringBuffer("");
		
		if (pageNo != 1) {
			pageNavi.append("<a href='noticeList.do?reqPage=" + (pageNo - 1) + "&type=" + type + "&keyword=" + keyword + "'><</a>");
		}
		
		for (int i = 0; i < pageNaviSize; i++) {
			
			if (pageNo == reqPage) {
				pageNavi.append("<span>" + pageNo + "</span>");
			} else {
				pageNavi.append("<a href='noticeList.do?reqPage=" + pageNo + "&type=" + type + "&keyword=" + keyword + "'>" + pageNo + "</a>");
			}
			
			pageNo++;
			if (pageNo > totalPage) {
				break;
			}
		}
		
		if (pageNo <= totalPage) {
			pageNavi.append("<a href='noticeList.do?reqPage=" + pageNo + "&type=" + type + "&keyword=" + keyword + "'>></a>");
		}
				
		return new NoticeData((ArrayList<Notice>)list, pageNavi.toString());
	}

	public Notice noticeRead(int noticeNo) {
		
		return noticeDao.noticeRead(noticeNo);
	}

	@Transactional
	public int noticeDelete(int noticeNo) {
		
		return noticeDao.noticeDelete(noticeNo);
	}

	@Transactional
	public int noticeUpdate(Notice notice) {

		return noticeDao.noticeUpdate(notice);
	}
}
