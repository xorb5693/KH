package kr.or.tg.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.tg.member.model.dao.MemberDao;
import kr.or.tg.member.model.vo.Member;

@Service("memberService")
public class MemberService {

	@Autowired
	@Qualifier("memberDao")
	private MemberDao memberDao;

	@Transactional
	public int insertMember(Member m) {
		
		System.out.println(m.getMemberPw());
		return memberDao.insertMember(m);
	}

	public Member selectOneMember(Member m) {
		
		return memberDao.selectOneMember(m);
	}
}
