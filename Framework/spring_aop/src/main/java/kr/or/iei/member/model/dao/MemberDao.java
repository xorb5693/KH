package kr.or.iei.member.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.iei.member.model.vo.Member;

@Repository("memberDao")
public class MemberDao {
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public MemberDao() {
		System.out.println("시슴3!!!!!!!!!!!!!!!!");
	}

	public Member selectOneMember(Member m) {
		
		return sqlSession.selectOne("member.selectOneMember", m);
	}

	public int insertMember(Member m) {
		
		return sqlSession.insert("member.insertMember", m);
	}

	public int updateMember(Member m) {
				
		return sqlSession.update("member.updateMember", m);
	}

	public int deleteMember(Member m) {
		
		return sqlSession.delete("member.deleteMember", m);
	}

	public List<Member> selectAllMember() {
				
		return sqlSession.selectList("member.selectAllMember");
	}
}
