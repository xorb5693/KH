package board.model.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import board.model.vo.Board;

public class BoardDao {

	public int totalCount(SqlSession session) {

		return session.selectOne("board.totalCount");
	}

	public List<Board> selectList(SqlSession session, HashMap<String, String> map) {
		
		return session.selectList("board.selectList", map);
	}

}
