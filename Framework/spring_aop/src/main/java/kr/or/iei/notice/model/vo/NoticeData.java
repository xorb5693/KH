package kr.or.iei.notice.model.vo;

import java.util.ArrayList;

public class NoticeData {

	private ArrayList<Notice> list;
	private String pageNavi;

	public NoticeData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoticeData(ArrayList<Notice> list, String pageNavi) {
		super();
		this.list = list;
		this.pageNavi = pageNavi;
	}

	public ArrayList<Notice> getList() {
		return list;
	}

	public void setList(ArrayList<Notice> list) {
		this.list = list;
	}

	public String getPageNavi() {
		return pageNavi;
	}

	public void setPageNavi(String pageNavi) {
		this.pageNavi = pageNavi;
	}

}
