package kr.or.tg.board.contorller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.tg.board.model.service.BoardService;
import kr.or.tg.board.model.vo.BoardData;
import kr.or.tg.member.model.vo.Member;

@Controller
public class BoardController {

	@Autowired
	@Qualifier("boardService")
	private BoardService boardService;
	
	@RequestMapping("/board.do")
	public String boardList(HttpSession session, int boardType, int reqPage, String type, String keyword, Model model) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("boardType", String.valueOf(boardType));
		map.put("type", type);
		map.put("keyword", keyword);
		
		if (boardType == 2) {
			map.put("companyCode", String.valueOf(((Member)session.getAttribute("member")).getCompanyCode()));
		}
		
		model.addAttribute("boardType", boardType);
		BoardData data = boardService.selectAllBoard(map, reqPage);
		
		model.addAttribute("list", data.getList());
		model.addAttribute("pageNavi", data.getPageNavi());
		model.addAttribute("reqPage", reqPage);
		return "board/boardList";
	}
}
