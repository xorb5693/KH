package member.model.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import member.model.vo.Check;
import member.model.vo.Member;
import member.model.vo.Select;

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

	public int totalCount(SqlSession session) {
		
		return session.selectOne("member.totalCount");
	}

	public List<Member> selectAllMemberPage(SqlSession session, HashMap<String, Integer> map) {
		
		return session.selectList("member.selectMemberListPage", map);
	}

	public List<Member> memberInfo(SqlSession session, Check check) {
		
		return session.selectList("member.memberInfo", check);
	}

	public List<Member> selectKeyword(SqlSession session, Select sel) {
		
		return session.selectList("member.slelctKeyword", sel);
	}

	public List<Member> selectKeyword(SqlSession session, Member m) {
		
		return session.selectList("member.selectKeyword2", m);
	}

	public List<Member> selectKeyword(SqlSession session, String[] memberId) {
		
		//배열을 매개변수로 사용하는 경우 mybatis에서 map으로 자동으로 변환한다.
//		HashMap<String, String[]> map = new HashMap<String, String[]>();
//		map.put("array", array객체);
//		map.put("list", list 객체);
		return session.selectList("member.selectKeyword3", memberId);
	}

}
