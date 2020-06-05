package kr.or.tg.board.model.vo;

import java.util.ArrayList;

public class BoardData {

	ArrayList<Board> list;
	String pageNavi;

	public BoardData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardData(ArrayList<Board> list, String pageNavi) {
		super();
		this.list = list;
		this.pageNavi = pageNavi;
	}

	public ArrayList<Board> getList() {
		return list;
	}

	public void setList(ArrayList<Board> list) {
		this.list = list;
	}

	public String getPageNavi() {
		return pageNavi;
	}

	public void setPageNavi(String pageNavi) {
		this.pageNavi = pageNavi;
	}

}
