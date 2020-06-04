package kr.or.tg.board.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import kr.or.tg.board.model.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	@Qualifier("boardService")
	private BoardService boardService;
}
