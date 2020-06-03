package kr.or.iei.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import kr.or.iei.member.model.service.MemberService;
import kr.or.iei.member.model.vo.Member;

@Component
public class ScheduledTest {

	@Autowired
	@Qualifier("memberService")
	private MemberService service;
	
	@Scheduled(cron = "10 * * * * *")
	public void scheduleTest2() {
		
		Member m = new Member();
		m.setMemberId("user01");
		m.setMemberPw("1234");
		Member member = service.selectOneMember(m);
		System.out.println(member.getMemberName());
	}
	
//	@Scheduled(fixedDelay = 5000)
//	public void scheduleTest3() {
//		System.out.println("5초마다 동작");
//	}
}
