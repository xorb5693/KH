package kr.or.iei.point;

public class Vvip extends Grade {

	public Vvip() {
		
	}
	
	public Vvip(String grade, String name, int age) {
		super(grade, name, age);
	}
	
	@Override
	public double getBonus() {
		return getPoint() * 0.1;
	}
}
