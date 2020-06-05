package kr.or.iei.notice.contoroller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import kr.or.iei.notice.model.service.NoticeService;
import kr.or.iei.notice.model.vo.Notice;
import kr.or.iei.notice.model.vo.NoticeData;

@Controller
public class NoticeController {

	@Autowired
	@Qualifier("noticeService")
	private NoticeService noticeService;

	@RequestMapping(value = "/noticeWriteFrm.do")
	public String noticeWriteFrm() {

		return "notice/noticeWrite";
	}

	@RequestMapping(value = "/noticeWrite.do")
	public String noticeWrite(HttpServletRequest request, MultipartFile file, Notice notice) {

//		System.out.println(notice.getNoticeTitle());
//		System.out.println(notice.getNoticeWriter());
//		System.out.println(notice.getNoticeContent());

		if (!file.isEmpty()) {

			String savePath = request.getSession().getServletContext().getRealPath("/resources/upload/notice/");

			// 업로드한 파일의 실제 파일명
			String originalFilename = file.getOriginalFilename();
			System.out.println(originalFilename);

			String onlyFilename = originalFilename.substring(0, originalFilename.lastIndexOf("."));
			// 확장자
			String extension = originalFilename.substring(originalFilename.lastIndexOf("."));

			String filepath = onlyFilename + "_" + System.currentTimeMillis() + extension;

			String fullpath = savePath + filepath;

			try {

				notice.setFilename(originalFilename);
				notice.setFilepath(filepath);
				byte[] bytes = file.getBytes();

				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(fullpath)));
				bos.write(bytes);
				bos.close();

				System.out.println("파일업로드 완료");

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		int result = noticeService.insertNotice(notice);

		if (result > 0) {
			return "notice/noticeWriteSuccess";
		} else {
			return "notice/noticeWriteFailed";
		}
	}

	@RequestMapping(value = "/noticeList.do")
	public String noticeList(int reqPage, String type, String keyword, Model model) {

		NoticeData data = noticeService.noticeList(reqPage, type, keyword);
		model.addAttribute("list", data.getList());
		model.addAttribute("pageNavi", data.getPageNavi());

		return "notice/noticeList";
	}

	@RequestMapping(value = "/noticeRead.do")
	public String noticeRead(int noticeNo, Model model) {

		Notice notice = noticeService.noticeRead(noticeNo);
		model.addAttribute("notice", notice);

		return "notice/noticeRead";
	}

	@ResponseBody
	@RequestMapping(value = "/noticeFileDownload.do", produces = "application/octet-stream")
	public void noticeFileDownload(String filename, String filepath, HttpServletRequest request, HttpServletResponse response) {
		try {
			
			//경로설정
			String directory = request.getSession().getServletContext().getRealPath("/resources/upload/notice/");
			
			//파일을 가져오기 위한 스트림
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(directory + filepath)));
			
			//파일을 내보내기 위한 스트림
			BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
			
			String resFilname = "";
			// 브라우저가 IE인지 확인

			boolean bool = request.getHeader("user-agent").indexOf("MSIE") != -1
					|| request.getHeader("user-agent").indexOf("Trident") != -1;
			System.out.println("IE여부 : " + bool);

			if (bool) {// IE인 경우
				resFilname = URLEncoder.encode(filename, "UTF-8");
				resFilname = resFilname.replace("\\\\", "%20");

			} else {// 나머지 브라우저인 경우
				resFilname = new String(filename.getBytes("UTF-8"), "ISO-8859-1");

			}

			// 파일 다운로드를 위한 HTTP Header 설정
			response.setHeader("Content-Disposition", "attachment; filename=" + resFilname);
			
			int read = -1;
			while ((read = bis.read()) != -1) {
				bos.write(read);
			}
			
			bos.flush();
			bos.close();
			bis.close();
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/noticeDelete.do")
	public String noticeDelete(int noticeNo, HttpServletRequest request) {
		
		Notice n = noticeService.noticeRead(noticeNo);
		int result = noticeService.noticeDelete(noticeNo);
		
		if (result > 0) {
			if (n.getFilepath() != null) {
				String directory = request.getSession().getServletContext().getRealPath("/resources/upload/notice/");
				File file = new File(directory + n.getFilepath());
				file.delete();
			}
		}
		
		return "redirect:/noticeList.do?reqPage=1";
	}
	
	@RequestMapping(value = "/noticeModifyFrm.do")
	public String noticeModifyFrm(int noticeNo, Model model) {
		
		Notice n = noticeService.noticeRead(noticeNo);
		model.addAttribute("notice", n);
		
		return "notice/noticeModify";
	}
	
	@RequestMapping(value = "/noticeModify.do")
	public String noticeModify(HttpServletRequest request, MultipartFile file, Notice notice, 
			String status, String oldFilename, String oldFilepath) {
		
		String directory = request.getSession().getServletContext().getRealPath("/resources/upload/notice/");
		System.out.println(status);
		System.out.println(oldFilepath);
		if (status.equals("delete")) {
			File f = new File(directory + oldFilepath);
			f.delete();
			notice.setFilename(null);
			notice.setFilepath(null);
		} else {
			notice.setFilename(oldFilename);
			notice.setFilepath(oldFilepath);
		}
		
		if (!file.isEmpty()) {

			// 업로드한 파일의 실제 파일명
			String originalFilename = file.getOriginalFilename();
			System.out.println(originalFilename);

			String onlyFilename = originalFilename.substring(0, originalFilename.lastIndexOf("."));
			// 확장자
			String extension = originalFilename.substring(originalFilename.lastIndexOf("."));

			String filepath = onlyFilename + "_" + System.currentTimeMillis() + extension;

			String fullpath = directory + filepath;

			try {

				notice.setFilename(originalFilename);
				notice.setFilepath(filepath);
				byte[] bytes = file.getBytes();

				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(fullpath)));
				bos.write(bytes);
				bos.close();

				System.out.println("파일업로드 완료");

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		noticeService.noticeUpdate(notice);
		
		return "redirect:/noticeRead.do?noticeNo=" + notice.getNoticeNo();
	}
}
