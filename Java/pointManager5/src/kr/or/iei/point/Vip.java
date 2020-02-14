package kr.or.iei.point;

public class Vip extends Grade {

	public Vip() {
		
	}
	
	public Vip(String grade, String name, int age) {
		super(grade, name, age);
	}
	
	@Override
	public double getBonus() {
		return getPoint() * 0.07;
	}
}
