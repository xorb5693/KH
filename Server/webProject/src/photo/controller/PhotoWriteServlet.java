package photo.controller;

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

import photo.model.service.PhotoService;
import photo.model.vo.Photo;

/**
 * Servlet implementation class PhotoWriteServlet
 */
@WebServlet(name = "PhotoWrite", urlPatterns = { "/photoWrite" })
public class PhotoWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PhotoWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//mulitpart인지 확인
		if (!ServletFileUpload.isMultipartContent(request)) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp");
			request.setAttribute("msg", "[enctype]확인");
			request.setAttribute("loc", "/");
			rd.forward(request, response);
			return;
		}
		
		String root = getServletContext().getRealPath("/");
		String saveDirectory = root + "upload/photo";
		
		int maxSize = 8 * 1024 * 1024;
		
		MultipartRequest mRequest = new MultipartRequest(request, saveDirectory, maxSize, "utf-8", new DefaultFileRenamePolicy());
		
		String photoWriter = mRequest.getParameter("photoWriter");
		String photoContent = mRequest.getParameter("photoContent");
		String photoFilename = mRequest.getOriginalFileName("photoFilename");
		String photoFilepath = mRequest.getFilesystemName("photoFilename");
		
		Photo photo = new Photo();
		photo.setPhotoWriter(photoWriter);
		photo.setPhotoContent(photoContent);
		photo.setPhotoFilename(photoFilename);
		photo.setPhotoFilepath(photoFilepath);
		
		int result = new PhotoService().photoWrite(photo);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp");
		request.setAttribute("loc", "/photoList");
		
		if (result > 0) {
			request.setAttribute("msg", "게시글을 작성하였습니다.");
		} else {
			request.setAttribute("msg", "게시글을 작성하는데 실패하였습니다.");
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
