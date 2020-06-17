package kr.or.iei.member.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)	//스프링에서 단위테스트를 하기 위한 선언문
@WebAppConfiguration					//WebApplicationConetxt @Autowired하기 위한 선언
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"
						, "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
//필요한 context 파일 경로 지정
public class MemberControllerTest {

	//로그를 출력하기 위한 객체 생성
	private static final Logger logger = LoggerFactory.getLogger(MemberControllerTest.class);
	
	@Autowired
	private WebApplicationContext wac;
	
	//가상의 요청과 응답을 처리하기 위한 객체 선언
	private MockMvc mockMvc;
	
	@Before
	public void setUp() {
		//MockMvc 객체 생성 
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
		logger.info("MockMvc 시슴 생성 완료!!");
	}
	
	@After
	public void after() {
		logger.info("테스트 다 끝남!!!!!!!!!!!");
	}
	
	@Test
	public void testMemberLogin() {
		logger.info("테스트 시작!!");
		
		try {
			mockMvc.perform(post("/kh/member/login.kh")	//perform 메소드로 URL 맵핑
					.param("memberId", "user01")
					.param("memberPw", "1234"))			//param 메소드로 데이터 전달
					.andDo(print())						//실행을 하고 print를 통해서 처리된 내용을 출력
					.andExpect(status().isOk());		//에러 없이 정상적인 상태(status 200)가 되도록 검증
			logger.info("테스트 성공!!");
		} catch (Exception e) {
			logger.error("테스트 수행 중 예외 발생 : " + e.getMessage());
		}
	}
}
