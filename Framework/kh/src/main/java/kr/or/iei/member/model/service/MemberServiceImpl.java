package kr.or.iei.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.or.iei.member.model.dao.MemberDaoImpl;
import kr.or.iei.member.model.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	@Qualifier("memberDao")
	private MemberDaoImpl dao;
	
	public MemberVO selectOneMember(MemberVO member) {
		
		return dao.selectOneMember(member);
	}
}
