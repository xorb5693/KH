package notice.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import notice.model.service.NoticeService;
import notice.model.vo.Notice;

/**
 * Servlet implementation class InsertNoticeServlet
 */
@WebServlet(name = "InsertNotice", urlPatterns = { "/insertNotice" })
public class InsertNoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertNoticeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		//enctype을 설정하면 모든 데이터가 null로 입력됨
		//enctype=multipart/form-data인지 확인
		if(!ServletFileUpload.isMultipartContent(request)) {
			request.setAttribute("msg", "공지사항 타입오류[enctype]");
			request.setAttribute("loc", "/");
			request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp").forward(request, response);
			return;
		}
		
		//파일업로드 준비
		//1. 파일업로드 경로 지정
		String root = getServletContext().getRealPath("/");	//WebContent폴더를 호출
		String saveDirectory = root + "upload/notice";
//		System.out.println(saveDirectory);
		
		//2. 업로드 파일 크기 지정
		int maxSize = 10 * 1024 * 1024;
		//request -> MultipartRequest
		//매개변수 종류 : 변환할 request, 저장할 폴더 위치, 파일의 최대 크기, 인코딩, 중복 파일 발견시 처리 방법
		MultipartRequest mRequest = new MultipartRequest(request, saveDirectory, maxSize, "utf-8", new DefaultFileRenamePolicy());
		
		Notice n = new Notice();
		n.setNoticeTitle(mRequest.getParameter("noticeTitle"));
		n.setNoticeWriter(mRequest.getParameter("noticeWriter"));
		n.setNoticeContent(mRequest.getParameter("noticeContent"));
		n.setFilename(mRequest.getOriginalFileName("filename"));	//getOriginalFileName은 업로드한 파일의 오리지널 이름
		n.setFilepath(mRequest.getFilesystemName("filename"));		//getFilesystemName은 서버에 업로드된 실제 파일 이름
//		System.out.println("title : " + n.getNoticeTitle());
//		System.out.println("wirter : " + n.getNoticeWriter());
//		System.out.println("content : " + n.getNoticeContent());
//		System.out.println("filename : " + n.getFilename());
//		System.out.println("filepath : " + n.getFilepath());
		
		int result = new NoticeService().insertNotice(n);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp");
		request.setAttribute("loc", "/noticeList?reqPage=1");
		
		if (result > 0) {
			request.setAttribute("msg", "공지사항 등록 성공");
		} else {
			request.setAttribute("msg", "공지사항 등록 실패");
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
