package member.model.vo;

import java.util.ArrayList;

public class MemberData {

	ArrayList<Member> list;
	String pageNavi;

	public MemberData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberData(ArrayList<Member> list, String pageNavi) {
		super();
		this.list = list;
		this.pageNavi = pageNavi;
	}

	public ArrayList<Member> getList() {
		return list;
	}

	public void setList(ArrayList<Member> list) {
		this.list = list;
	}

	public String getPageNavi() {
		return pageNavi;
	}

	public void setPageNavi(String pageNavi) {
		this.pageNavi = pageNavi;
	}

}
