package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

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
		
		Member m = new Member(request.getParameter("memberId"), 
				request.getParameter("memberPw"), 
				request.getParameter("memberName"), 
				Integer.parseInt(request.getParameter("age")), 
				request.getParameter("email"),
				request.getParameter("phone"), 
				request.getParameter("address"), null);
		
		int result = new MemberService().insertMember(m);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp");
		
		if (result > 0) {
			request.setAttribute("msg", "회원가입 성공!");
			request.setAttribute("loc", "/loginFrm");
		} else {
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
