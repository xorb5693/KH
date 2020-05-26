package member.model.vo;

public class Select {

	private String select;
	private String keyword;

	public Select() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Select(String select, String keyword) {
		super();
		this.select = select;
		this.keyword = keyword;
	}

	public String getSelect() {
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}
