package kh.java.serial;

import java.io.Serializable;

//직렬화 가능
public class User implements Serializable {

	private static final long serialVersionUID = 11111111111L;
	private String id;
	private String pw;
	private int age;
	private Score score;
	
	public User() {
		super();
	}

	public User(String id, String pw, int age, Score score) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}
	
}
