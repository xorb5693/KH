package kh.java.cotroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet(name = "Calc", urlPatterns = { "/cal" })
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1. request 데이터 인코딩
		request.setCharacterEncoding("utf-8");
		
		//2. 넘어온 값 변수에 저장
		int firstValue = Integer.parseInt(request.getParameter("firstValue"));
		String oper = request.getParameter("cal");
		int secondValue = Integer.parseInt(request.getParameter("secondValue"));
		int result = 0;

		//3. 비지니스 로직 호출
		switch (oper) {
		case "+":
			result = firstValue + secondValue;
			break;
		case "-":
			result = firstValue - secondValue;
			break;
		case "*":
			result = firstValue * secondValue;
			break;
		case "/":
			result = firstValue / secondValue;
			break;
		}
		
		//4. 결과 처리
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>계산결과</title></head>");
		out.println("<body>");
		out.println("<h2>연산결과</h2><hr>");
		out.println("<p>" + firstValue + oper + secondValue + "=" + result + "</p>");
		out.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
