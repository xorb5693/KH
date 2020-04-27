package test.contoller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.model.vo.Member;

/**
 * Servlet implementation class El2Servlet
 */
@WebServlet(name = "El2", urlPatterns = { "/el2" })
public class El2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public El2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HashMap<String, Member> map = new HashMap<String, Member>();
		map.put("m1", new Member("id1", "pw1", "name1"));
		map.put("m2", new Member("id2", "pw2", "name2"));
		
		RequestDispatcher rd = request.getRequestDispatcher("/EL/test2.jsp");
		request.setAttribute("map", map);
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
