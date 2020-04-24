package kh.java.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.java.member.model.service.MemberService;
import kh.java.member.model.vo.Member;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet(name = "Join", urlPatterns = { "/join" })
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		Member m = new Member();
		m.setMemberId(request.getParameter("memberId"));
		m.setMemberPw(request.getParameter("memberPw"));
		m.setMemberName(request.getParameter("memberName"));
		m.setFootSize(Integer.parseInt(request.getParameter("footSize")));
		
		int result = new MemberService().insertMember(m);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/member/msg.jsp");
		
		if (result > 0) {
			//회원가입 성공시 -> 성공 메세지 후 로그인 화면
			request.setAttribute("msg", "회원가입 성공!");
			request.setAttribute("loc", "/");			
		} else {
			//회원가입 실패시 ->실패 메세지 후 회원가입 화면
			request.setAttribute("msg", "회원가입 실패!");
			request.setAttribute("loc", "/joinFrm");
		}
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
