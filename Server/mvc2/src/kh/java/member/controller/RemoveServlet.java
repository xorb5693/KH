package kh.java.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kh.java.member.model.service.MemberService;
import kh.java.member.model.vo.Member;

/**
 * Servlet implementation class RemoveServlet
 */
@WebServlet(name = "Remove", urlPatterns = { "/remove" })
public class RemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		String memberId = ((Member)session.getAttribute("member")).getMemberId();
		
		int result = new MemberService().removeMember(memberId);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/member/msg.jsp");
				
		if (result > 0) {
			request.setAttribute("msg", "회원 탈퇴 성공");
			request.setAttribute("loc", "/logout");
		} else {
			request.setAttribute("msg", "회원 탈퇴 실패");
			request.setAttribute("loc", "/");
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
