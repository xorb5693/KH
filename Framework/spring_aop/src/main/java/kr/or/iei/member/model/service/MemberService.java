package kr.or.iei.member.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.iei.member.model.dao.MemberDao;
import kr.or.iei.member.model.vo.Member;

@Service("memberService")
public class MemberService {

	@Autowired
	@Qualifier("memberDao")
	private MemberDao dao;
	
	public MemberService() {
		System.out.println("시슴2!!!!!!!!!!!!!!!!!!!!!!");
	}

	public Member selectOneMember(Member m) throws IllegalArgumentException {
		
		System.out.println("입력 아이디 : " + m.getMemberId());
		if (m.getMemberId().equals("")) {
			throw new IllegalArgumentException("아이디를 입력하세요");
		}
		
		return dao.selectOneMember(m);
	}

	@Transactional
	public int insertMember(Member m) {
		
		return dao.insertMember(m);
	}

	@Transactional
	public int updateMember(Member m) {

		return dao.updateMember(m);
	}

	@Transactional
	public int deleteMember(Member m) {
		
		return dao.deleteMember(m);
	}

	public ArrayList<Member> selectAllMmember() {
		
		List<Member> list = dao.selectAllMember();
		
		return (ArrayList<Member>)list;
	}

}
