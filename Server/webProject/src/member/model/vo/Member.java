package member.model.vo;

import java.sql.Date;

public class Member {
	private String memberId;
	private String memberPw;
	private String memberName;
	private int age;
	private String email;
	private String phone;
	private String address;
	private Date enrollDate;

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String memberId, String memberPw, String memberName, int age, String email, String phone,
			String address, Date enrollDate) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.enrollDate = enrollDate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

}
