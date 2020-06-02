package kr.or.iei.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class LogAdvice {

	@Pointcut("execution(* kr.or.iei..*MemberService.*(kr.or.iei.member.model.vo.Member))")
	public void allPointcut() {}
	
//	@Before("allPointcut()")
//	public void pringLog(JoinPoint jp) {
//		String methodName = jp.getSignature().getName();
//		Object[] args = jp.getArgs();
//		Member m = (Member)args[0];
//		
//		System.out.println("메소드명 : " + methodName);
//		System.out.println("매개변수 : " + m);
//		System.out.println("아이디 : " + m.getMemberId());
//	}
//	
//	@AfterReturning(pointcut = "allPointcut()", returning = "returnObj")
//	public void afterReturningAdvice(JoinPoint jp, Object returnObj) {
//		
//		String methodName = jp.getSignature().getName();
//		System.out.println(methodName + " 메소드 호출");
//		if (returnObj instanceof Member) {
//			Member m = (Member)returnObj;
//			System.out.println("[" + m.getMemberName() + "] 님이 로그인했습니다.");
//		}
//	}
//	
//	@AfterThrowing(pointcut = "allPointcut()", throwing = "excpObj")
//	public void afterThrowingAdvice(JoinPoint jp, Exception excpObj) {
//		String methodName = jp.getSignature().getName();
//		System.out.println(methodName + "메소드 호출");
//		System.out.println("예외메세지 : " + excpObj);
//	}
	
	@Around("allPointcut()")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		
		String metodName = pjp.getSignature().getName();
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		//비지니스 메소드를 수행하고, 리턴값을 obj에 저장
		Object obj = pjp.proceed();
		
		stopWatch.stop();
		
		System.out.println(metodName + "() 메소드 수행시간 : " + stopWatch.getTotalTimeMillis() + "(ms)초");
		
		return obj;
	}
	
}
