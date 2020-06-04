package kr.or.tg.board.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("boardDao")
public class BoardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
}
