package member.model.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.SqlSessionTemplate;
import member.model.dao.MemberDao;
import member.model.vo.Member;

public class MemberService {

	public ArrayList<Member> selectAllMember() {
		
		SqlSession session = SqlSessionTemplate.getSqlSession();
		List<Member> list = new MemberDao().selectAllMember(session);
		
		session.close();
		
		return (ArrayList<Member>)list;
	}

	public int insertMember(Member m) {
		
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new MemberDao().insertMember(session, m);
		
		if (result > 0) {
			session.commit();
		} else {
			session.rollback();
		}
		
		session.close();
		
		return result;
	}

	public Member selectOneMember(Member m) {
		
		SqlSession session = SqlSessionTemplate.getSqlSession();
		Member member = new MemberDao().selectOneMember(session, m);
		
		session.close();
		
		return member;
	}

}
