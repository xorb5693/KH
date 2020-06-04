package kr.or.tg.commons;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.or.tg.member.model.vo.Member;

@Service
@Aspect
public class MemberPwEncAdvice {

	@Autowired
	@Qualifier("SHA256Util")
	private SHA256Util enc;
	
	@Pointcut("execution(* kr.or.tg.member.model.service.MemberService.*Member(kr.or.tg.member.model.vo.Member))")
	public void encPwPointcut() {
		
	}
	
	@Before("encPwPointcut()")
	public void passwordEnc(JoinPoint jp) throws Exception {
		
		String methodName = jp.getSignature().getName();
		System.out.println(methodName + "() 메소드 pw 암호화");
		
		Member m = (Member)jp.getArgs()[0];
		
		if (m.getMemberPw() != null) {
			m.setMemberPw(enc.encData(m.getMemberPw()));
		}
	}
}
