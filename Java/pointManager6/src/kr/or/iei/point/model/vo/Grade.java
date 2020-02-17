package kr.or.iei.point.model.vo;

public abstract class Grade {

	String grade;
	String name;
	int point;
	public Grade() {
		super();
	}
	
	public Grade(String grade, String name, int point) {
		super();
		this.grade = grade;
		this.name = name;
		this.point = point;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return getGrade().toUpperCase() + "\t" + getName() + "\t" + getPoint() + "\t" + getBonus();
	}

	public abstract double getBonus();
}
