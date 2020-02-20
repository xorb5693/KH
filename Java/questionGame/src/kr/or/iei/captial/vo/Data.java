package kr.or.iei.captial.vo;

import java.io.Serializable;

public class Data{
	private String number;
	private String qustion;
	private transient String answer;
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Data(String number, String qustion, String answer) {
		super();
		this.number = number;
		this.qustion = qustion;
		this.answer = answer;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getQustion() {
		return qustion;
	}
	public void setQustion(String qustion) {
		this.qustion = qustion;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
