package kr.or.tg.board.model.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.tg.board.model.vo.Board;

@Repository("boardDao")
public class BoardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public int totalCount(HashMap<String, String> map) {
		
		return sqlSession.selectOne("board.totalCount", map);
	}

	public List<Board> selectAllBoard(HashMap<String, String> map) {

		return sqlSession.selectList("board.selectAllBoard", map);
	}
}
