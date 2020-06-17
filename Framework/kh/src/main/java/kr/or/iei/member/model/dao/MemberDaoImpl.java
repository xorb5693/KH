package kr.or.iei.member.model.dao;

import org.springframework.stereotype.Repository;

import kr.or.iei.member.model.vo.MemberVO;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {

	public MemberVO selectOneMember(MemberVO member) {
		
		if (member.getMemberId().equals("user01") && member.getMemberPw().equals("1234")) {
			return member;
		} else {
			return null;
		}
	}
}
