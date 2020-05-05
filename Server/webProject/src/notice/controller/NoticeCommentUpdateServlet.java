package notice.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import notice.model.service.NoticeService;

/**
 * Servlet implementation class NoticeCommentUpdateServlet
 */
@WebServlet(name = "NoticeCommentUpdate", urlPatterns = { "/noticeCommentUpdate" })
public class NoticeCommentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeCommentUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String noticeCommentContent = request.getParameter("noticeCommentContent");
		int noticeCommentNo = Integer.parseInt(request.getParameter("noticeCommentNo"));
		int noticeRef = Integer.parseInt(request.getParameter("noticeRef"));
		
		int result = new NoticeService().updateComment(noticeCommentNo, noticeCommentContent);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp");
		request.setAttribute("loc", "/noticeView?noticeNo=" + noticeRef);
		
		if (result > 0) {
			request.setAttribute("msg", "댓글을 수정하였습니다.");
		} else {
			request.setAttribute("msg", "댓글 수정에 실패하였습니다.");
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
