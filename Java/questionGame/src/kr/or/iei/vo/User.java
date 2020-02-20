package kr.or.iei.vo;

import java.io.Serializable;

public class User implements Serializable {

	private String id;
	private String pw;
	private int personScore;
	private int idiomScore;
	private int movieScore;
	private int capitalScroe;
	private int dialogueScore;
	private int proverbScore;
	
	public User() {
		super();
	}
	
	public User(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
		
		personScore = 0;
		idiomScore = 0;
		movieScore = 0;
		capitalScroe = 0;
		dialogueScore = 0;
		proverbScore = 0;
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

	public int getPersonScore() {
		return personScore;
	}

	public void setPersonScore(int personScore) {
		this.personScore = personScore;
	}

	public int getIdiomScore() {
		return idiomScore;
	}

	public void setIdiomScore(int idiomScore) {
		this.idiomScore = idiomScore;
	}

	public int getMovieScore() {
		return movieScore;
	}

	public void setMovieScore(int movieScore) {
		this.movieScore = movieScore;
	}

	public int getCapitalScroe() {
		return capitalScroe;
	}

	public void setCapitalScroe(int capitalScroe) {
		this.capitalScroe = capitalScroe;
	}

	public int getDialogueScore() {
		return dialogueScore;
	}

	public void setDialogueScore(int dialogueScore) {
		this.dialogueScore = dialogueScore;
	}

	public int getProverbScore() {
		return proverbScore;
	}

	public void setProverbScore(int proverbScore) {
		this.proverbScore = proverbScore;
	}
	
}
