package test.contoller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.model.vo.Member;

/**
 * Servlet implementation class El4Servlet
 */
@WebServlet(name = "El4", urlPatterns = { "/el4" })
public class El4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public El4Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Member> list = new ArrayList<Member>();
		list.add(new Member("id1", "pw1", "이름1"));
		list.add(new Member("id2", "pw2", "이름2"));
		
		RequestDispatcher rd = request.getRequestDispatcher("/EL/test4.jsp");
		request.setAttribute("list", list);
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
