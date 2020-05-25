package member.model.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.SqlSessionTemplate;
import member.model.dao.MemberDao;
import member.model.vo.Member;

public class MemberService {

	public Member selectOneMember(Member m) {
		
		SqlSession session = SqlSessionTemplate.getSqlSession();
		Member member = new MemberDao().selectOneMember(session, m);
		
		session.close();
		
		return member;
	}

	public int insertMember(Member m) {

		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new MemberDao().inserMember(session, m);
		
		if (result > 0) {
			session.commit();
		} else {
			session.rollback();
		}
		
		session.close();
		
		return result;
	}

	public ArrayList<Member> selectAllMember() {
		
		SqlSession session = SqlSessionTemplate.getSqlSession();
		List<Member> list = new MemberDao().selectAllMember(session);
		
		session.close();
		
		return (ArrayList<Member>)list;
	}

	public int updateMember(Member m) {
		
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new MemberDao().updateMember(session, m);
		
		if (result > 0) {
			session.commit();
		} else {
			session.rollback();
		}
		
		session.close();
		
		return result;
	}

	public int deleteMember(int memberNo) {
		
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new MemberDao().deleteMember(session, memberNo);
		
		if (result > 0) {
			session.commit();
		} else {
			session.rollback();
		}
		
		session.close();
		
		return result;
	}

}
