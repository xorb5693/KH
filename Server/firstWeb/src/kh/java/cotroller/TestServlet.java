package kh.java.cotroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet(name = "Test", urlPatterns = { "/test" })
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	//생성자
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //get 방식
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 전송 값에 한글이 있을 경우를 대비하여 인코딩 처리 
		request.setCharacterEncoding("utf-8");
		
		//2. 웹에서 보내준 데이터를 꺼내서 변수에 저장
		String test = request.getParameter("test");
		String test3 = request.getParameter("test3");
		System.out.println(test + "/" + test3);
		
		//3. 비지니스 로직 처리(Service 호출)
		
		//4. 처리 결과 내보내기(Response)
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>result</title></head>");
		out.println("<body>");
		out.println("<h1>서블릿 호출 완료</h1>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//post 방식
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
