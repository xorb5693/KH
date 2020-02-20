package kr.or.iei.proverb.vo;

public class Question {

	private String question;
	private String answer;
	private String mean;
	private boolean check;


	public Question() {
		super();
	}

	public Question(String question, String answer, String mean, boolean check) {
		super();
		this.question = question;
		this.answer = answer;
		this.mean = mean;
		this.check = check;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}
	
	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	@Override
	public String toString() {
		return question + " / " + answer + " / " + mean;
	}
}
