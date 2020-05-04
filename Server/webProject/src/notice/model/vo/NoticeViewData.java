package notice.model.vo;

import java.util.ArrayList;

public class NoticeViewData {

	private Notice n;
	private ArrayList<NoticeComment> list;

	public NoticeViewData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoticeViewData(Notice n, ArrayList<NoticeComment> list) {
		super();
		this.n = n;
		this.list = list;
	}

	public Notice getN() {
		return n;
	}

	public void setN(Notice n) {
		this.n = n;
	}

	public ArrayList<NoticeComment> getList() {
		return list;
	}

	public void setList(ArrayList<NoticeComment> list) {
		this.list = list;
	}

}
