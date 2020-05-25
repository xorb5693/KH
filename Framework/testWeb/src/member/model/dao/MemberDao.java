package member.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import member.model.vo.Member;

public class MemberDao {

	public Member selectOneMember(SqlSession session, Member m) {
		
		return session.selectOne("member.selectOneMember", m);
	}

	public int inserMember(SqlSession session, Member m) {
		
		return session.insert("member.insertMember", m);
	}

	public List<Member> selectAllMember(SqlSession session) {
		
		return session.selectList("member.selectAllMember");
	}

	public int updateMember(SqlSession session, Member m) {
		
		return session.update("member.updateMember", m);
	}

	public int deleteMember(SqlSession session, int memberNo) {
		
		return session.delete("member.deleteMember", memberNo);
	}

}
