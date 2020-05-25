package company.model.vo;

public class Company {

	private int companyCode;
	private String companyName;
	private String companyLogo;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(int companyCode, String companyName, String companyLogo) {
		super();
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.companyLogo = companyLogo;
	}

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

}
