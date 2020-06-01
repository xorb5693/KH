package kr.or.iei.notice.contoroller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
			
			//업로드한 파일의 실제 파일명
			String originalFilename = file.getOriginalFilename();
			System.out.println(originalFilename);
					
			String onlyFilename = originalFilename.substring(0, originalFilename.lastIndexOf("."));
			//확장자
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
}
