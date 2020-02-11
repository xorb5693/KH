package kr.or.iei.point;

public class Vip extends Grade {

	public Vip() {
		
	}
	
	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getBonus() {
		return getPoint() * 0.05;
	}
}
