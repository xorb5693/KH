package kr.or.iei.notice.model.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.iei.notice.model.vo.Notice;

@Repository("noticeDao")
public class NoticeDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	public int insertNotice(Notice notice) {
		
		return sqlSession.insert("notice.noticeInsert", notice);
	}

	public int totalCount(HashMap<String, String> map) {
		
		return sqlSession.selectOne("notice.totalCount", map);
	}

	public List<Notice> noticeList(HashMap<String, String> map) {

		return sqlSession.selectList("notice.noticeList", map);
	}

	public Notice noticeRead(int noticeNo) {
		
		return sqlSession.selectOne("notice.noticeRead", noticeNo);
	}

	public int noticeDelete(int noticeNo) {

		return  sqlSession.delete("notice.noticeDelete", noticeNo);
	}

	public int noticeUpdate(Notice notice) {
		
		return sqlSession.update("notice.noticeUpdate", notice);
	}

}
