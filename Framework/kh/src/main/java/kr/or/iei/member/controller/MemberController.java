package kr.or.iei.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.iei.member.model.service.MemberServiceImpl;
import kr.or.iei.member.model.vo.MemberVO;

@Controller
@RequestMapping("/kh/member")
public class MemberController {

	@Autowired
	@Qualifier("memberService")
	private MemberServiceImpl service;
	
	@RequestMapping("/login.kh")
	public String loginMember(MemberVO member) {
		
		MemberVO m = service.selectOneMember(member);
		
		if (m != null) {
			return "success";
		} else {
			return "fail";
		}
	}
}
