package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet(name = "UpdateMember", urlPatterns = { "/updateMember" })
public class UpdateMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		Member m = new Member();
		m.setAddress(request.getParameter("address"));
		m.setAge(Integer.parseInt(request.getParameter("age")));
		m.setEmail(request.getParameter("email"));
		m.setMemberId(request.getParameter("memberId"));
		m.setMemberName(request.getParameter("memberName"));
		m.setMemberPw(request.getParameter("memberPw"));
		m.setPhone(request.getParameter("phone"));
		
		int result = new MemberService().updateMember(m);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp");
		request.setAttribute("loc", "/mypage?memberId=" + m.getMemberId());
		
		if (result > 0) {
			HttpSession session = request.getSession(false);
			session.setAttribute("member", m);
			request.setAttribute("msg", "회원정보 수정 성공!");
		} else {
			request.setAttribute("msg", "회원정보 수정 실패");
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
