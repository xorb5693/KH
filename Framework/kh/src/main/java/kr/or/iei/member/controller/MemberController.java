package kr.or.iei.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping("/datePicker.kh")
	public String datePicker(String datePicker) {
		
		System.out.println(datePicker);
		
		if (datePicker == null) {
			return "fail";
		} else {
			return "success";
		}
	}
	
	@ResponseBody
	@RequestMapping("/arduinoTest.kh")
	public String arduino(String card, String mode) {
		card.replace(" ", "");
		String cardNo = card.replaceAll(" ", ".").substring(1);
		System.out.println(mode + " : " + cardNo);
		int index = cardNo.lastIndexOf(".");
		return "$user" + cardNo.substring(index + 1);
	}
}
