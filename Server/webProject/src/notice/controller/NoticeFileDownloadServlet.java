package notice.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NoticeFileDownloadServlet
 */
@WebServlet(name = "NoticeFileDownload", urlPatterns = { "/noticeFileDownload" })
public class NoticeFileDownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeFileDownloadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String filename = request.getParameter("filename");
		String filepath = request.getParameter("filepath");
		
		//1) 경로설정
		String root = getServletContext().getRealPath("/");
		String saveDirectory = root + "upload/notice/";
		//파일이랑 서블릿 연결
		FileInputStream fis = new FileInputStream(saveDirectory + filepath);
		//속도를 위한 보조 스트림 생성
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		//파일을 내보내기 위한 스트림 생성
		ServletOutputStream sos = response.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(sos);
		
		String resFilname = "";
		//브라우저가 IE인지 확인
		boolean bool = request.getHeader("user-agent").indexOf("MSIE") != -1 || request.getHeader("user-agent").indexOf("Trident") != -1;
		System.out.println("IE여부 : " + bool);
		
		if (bool) {//IE인 경우
			resFilname = URLEncoder.encode(filename, "UTF-8");
			resFilname = resFilname.replace("\\\\", "%20");
			
		} else {//나머지 브라우저인 경우
			resFilname = new String(filename.getBytes("UTF-8"), "ISO-8859-1");
			
		}
		
		//파일 다운로드를 위한 HTTP Header 설정
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment; filename=" +resFilname);
		
		int read = -1;
		while((read = bis.read()) != -1) {
			bos.write(read);
		}
		
		bos.close();
		bis.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
