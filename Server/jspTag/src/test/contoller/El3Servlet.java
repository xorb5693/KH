package test.contoller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.model.vo.Member;

/**
 * Servlet implementation class El3Servlet
 */
@WebServlet(name = "El3", urlPatterns = { "/el3" })
public class El3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public El3Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Member[] arr = new Member[2];
		arr[0] = new Member("user1", "pass1", "유저1");
		arr[1] = new Member("user2", "pass2", "유저2");
		
		RequestDispatcher rd = request.getRequestDispatcher("/EL/test3.jsp");
		request.setAttribute("arr", arr);
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
