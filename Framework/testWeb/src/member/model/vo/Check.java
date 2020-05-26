package member.model.vo;

public class Check {

	private String ckNo;
	private String ckId;
	private String ckName;
	private String ckAge;

	public Check() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Check(String ckNo, String ckId, String ckName, String ckAge) {
		super();
		this.ckNo = ckNo;
		this.ckId = ckId;
		this.ckName = ckName;
		this.ckAge = ckAge;
	}

	public String getCkNo() {
		return ckNo;
	}

	public void setCkNo(String ckNo) {
		this.ckNo = ckNo;
	}

	public String getCkId() {
		return ckId;
	}

	public void setCkId(String ckId) {
		this.ckId = ckId;
	}

	public String getCkName() {
		return ckName;
	}

	public void setCkName(String ckName) {
		this.ckName = ckName;
	}

	public String getCkAge() {
		return ckAge;
	}

	public void setCkAge(String ckAge) {
		this.ckAge = ckAge;
	}

}
