package kr.or.iei.member.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import kr.or.iei.member.model.service.MemberService;
import kr.or.iei.member.model.vo.Member;

@Controller
public class MemberController {
	
	@Autowired
	@Qualifier("memberService")
	private MemberService service;
	
	public MemberController() {
		System.out.println("시슴!!!!!!!!!!!!!!!!!");
	}

	@RequestMapping(value = "/login.do")
	public String loginMember(HttpSession session, Member m) {
		
		Member member =service.selectOneMember(m);
		if (member != null) {
			session.setAttribute("member", member);
			return "member/loginSuccess";
		} else {
			return "member/loginFailed";
		}
	}
	
	@RequestMapping(value = "/joinFrm.do")
	public String joinFrm() {
		return "member/join";
	}
	
	@RequestMapping(value = "/join.do")
	public String join(Member m) {
		
		int result = service.insertMember(m);
		
		if (result > 0) {
			return "member/joinSuccess";
		} else {
			return "member/joinFailed";
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "/checkId.do", produces = "text/html; charset=utf-8")
	public String checkId(Member m) {
		
		Member member = service.selectOneMember(m);
		//member = null -> 사용 가능한 아이디(0)
		//member != null -> 이미 사용중인 아이디(1)
		
		if (member == null) {
			return "0";
		} else {
			return "1";
		}
	}
	
	@RequestMapping(value = "logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/mypage.do")
	public String mypage(HttpSession session, Model model) {
		Member m = (Member)session.getAttribute("member");
		model.addAttribute("m", m);
		
		return "member/mypage";
	}
	
	@RequestMapping(value = "/mUpdate.do")
	public String mUpdate(HttpSession session, Model model, Member m) {
		if (m.getMemberPw().equals("")) {
			m.setMemberPw(null);
		}
		int result = service.updateMember(m);
		if (result > 0) {
			Member member = service.selectOneMember(m);
			session.setAttribute("member", member);
			model.addAttribute("m", member);
		}
		
		return "member/mypage";
	}
	
	@RequestMapping(value = "/delete.do")
	public String deleteMember(HttpSession session) {
		
		Member m = (Member)session.getAttribute("member");
		int result = service.deleteMember(m);
		
		if (result > 0) {
			System.out.println("회원탈퇴");
		}
		
		return "redirect:/logout.do";
	}
	
	@RequestMapping(value = "/allMember.do")
	public String allMember() {
		return "member/allMember";
	}
	
	@ResponseBody
	@RequestMapping(value = "/selectAllMember.do", produces = "application/json; charset=utf-8")
	public String AllMember() {
		
		ArrayList<Member> list = service.selectAllMmember();
		
		return new Gson().toJson(list);
	}
}
