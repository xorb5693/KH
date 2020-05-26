package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import company.model.service.CompanyService;
import company.model.vo.Company;
import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name = "Login", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String memberId = request.getParameter("memberId");
		String memberPw = request.getParameter("memberPw");
		Member m = new Member();
		m.setMemberId(memberId);
		m.setMemberPw(memberPw);
		
		Member member = new MemberService().selectOneMember(m);
		
		if (member == null) {
			request.setAttribute("loc", "/");
			request.setAttribute("msg", "아이디 또는 비밀번호를 확인하세요.");
		} else if (member.getMemberLevel() == 0) {
			request.setAttribute("loc", "/");
			request.setAttribute("msg", "관리자가 승인을 하지 않았습니다..");
		} else if (member.getMemberLevel() == 1) {
			Company com = new CompanyService().selectOneCompany(member.getCompanyCode());
			
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			session.setAttribute("company", com);
			
			request.setAttribute("loc", "/main");
			request.setAttribute("msg", "로그인 성공");
		}
		
		request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp").forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
