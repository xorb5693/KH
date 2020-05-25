package member.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import member.model.vo.Member;

public class MemberDao {

	public List<Member> selectAllMember(SqlSession session) {
		
		return session.selectList("member.selectAllMemeber");
	}

	public int insertMember(SqlSession session, Member m) {
		
		return session.insert("member.insertMember", m);
	}

}
