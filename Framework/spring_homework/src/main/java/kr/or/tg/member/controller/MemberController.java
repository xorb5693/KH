package kr.or.tg.member.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.tg.company.model.service.CompanyService;
import kr.or.tg.company.model.vo.Company;
import kr.or.tg.member.model.service.MemberService;
import kr.or.tg.member.model.vo.Member;

@Controller
public class MemberController {

	@Autowired
	@Qualifier("memberService")
	private MemberService memberService;
	
	@Autowired
	@Qualifier("companyService")
	private CompanyService companyService;
	
	@RequestMapping("/joinFrm.do")
	public String joinFrm(Model model) {
		
		ArrayList<Company>list = companyService.selectListCompany();
		model.addAttribute("list", list);
		return "member/join";
	}
	
	@RequestMapping("/join.do")
	public String join(Member m, Model model) {
//		System.out.println(m.getMemberPw());
		
		int result = memberService.insertMember(m);

		model.addAttribute("loc", "/");
		
		if (result > 0) {
			model.addAttribute("msg", "회원가입 성공");
		} else {
			model.addAttribute("msg", "회원가입 실패");
		}
		return "common/msg";
	}
	
	@ResponseBody
	@RequestMapping(value = "/checkId.do", produces = "text/html; charset=utf-8")
	public String checkId(Member m) {
//		System.out.println(m.getMemberId());
//		System.out.println(m.getMemberPw());
		Member member = memberService.selectOneMember(m);
		
		if (member == null) {
			return "0";
		} else {
			return "1";
		}
	}
	
	@RequestMapping("/login.do")
	public String login(HttpSession session, Member m, Model model) {
		
		Member member = memberService.selectOneMember(m);
		
		if (member == null){
			model.addAttribute("msg", "아이디 혹은 비밀번호를 확인하세요.");
			model.addAttribute("loc", "/");
			return "common/msg";
		} else if (member.getMemberLevel() == 1){
			Company company = companyService.selectOneCompany(member.getCompanyCode());
			session.setAttribute("company", company);
			session.setAttribute("member", member);
			return "redirect:/main.do";
		} else {
			model.addAttribute("msg", "관리자가 허용하지 않은 회원입니다.");
			model.addAttribute("loc", "/");
			return "common/msg";
		}
		
	}
	
	@RequestMapping("/main.do")
	public String mainPage() {
		
		return "member/main";
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/";
	}
}
