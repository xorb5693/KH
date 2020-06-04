package kr.or.tg.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.tg.member.model.vo.Member;

@Repository("memberDao")
public class MemberDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public int insertMember(Member m) {
		
		return sqlSession.insert("member.insertMember", m);
	}

	public Member selectOneMember(Member m) {
		
		return sqlSession.selectOne("member.selectOneMember", m);
	}
}
