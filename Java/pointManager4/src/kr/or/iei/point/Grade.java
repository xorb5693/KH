package kr.or.iei.point;

public class Grade {
	
	private String name;
	private String grade;
	private int point;
	
	public Grade() {
		
	}
	
	public Grade(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	public int getPoint() {
		return point;
	}

	public double getBonus() {
		return getPoint() * 0.02;
	}
}
