package kr.or.iei.member.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.or.iei.member.model.vo.Member;

@Repository("memberDao")
public class MemberDao {
	
	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	public MemberDao() {
		System.out.println("시슴3!!!!!!!!!!!!!!!!");
	}

	public List<Member> selectOneMember(Member m) {
		
		String query = "select * from member where member_id=? and member_pw=?";
		Object[] params = {m.getMemberId(), m.getMemberPw()};
		List<Member> list = jdbcTemplate.query(query, params, new MemberRowMapper());
		
		return list;
	}

	public int insertMember(Member m) {
		
		String query = "insert into member values(member_seq.nextval, ?, ?, ?, ?, sysdate)";
		Object[] params = {m.getMemberId(), m.getMemberPw(), m.getMemberName(), m.getAge()};
		
		int result = jdbcTemplate.update(query, params);
		
		return result;
	}

	public int updateMember(Member m) {
		
		String query = "update member set member_pw=?, member_name=?, age=? where member_id=?";
		Object[] params = {m.getMemberPw(), m.getMemberName(), m.getAge(), m.getMemberId()};
		
		int result = jdbcTemplate.update(query, params);
		
		return result;
	}

	public int deleteMember(Member m) {
		
		String query = "delete from member where member_id=?";
		Object[] params = {m.getMemberId()};
		
		int result = jdbcTemplate.update(query, params);
		
		return result;
	}

	public List<Member> checkId(String memberId) {
		
		String query = "select * from member where member_id=?";
		Object[] params = {memberId};
		List<Member> list = jdbcTemplate.query(query, params, new MemberRowMapper());
		
		return list;
	}

	public List<Member> selectAllMember() {
		
		String query = "select * from member";
		List<Member> list = jdbcTemplate.query(query, new MemberRowMapper());
		
		return list;
	}
}
