package kr.or.iei.member.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.or.iei.member.model.vo.Member;

public class MemberRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rset, int rowNum) throws SQLException {
		
		Member m = new Member();
		m.setAge(rset.getInt("age"));
		m.setEnrollDate(rset.getString("enroll_date"));
		m.setMemberId(rset.getString("member_id"));
		m.setMemberName(rset.getString("member_name"));
		m.setMemberNo(rset.getInt("member_no"));
		m.setMemberPw(rset.getString("member_pw"));
		
		return m;
	}

	
}
