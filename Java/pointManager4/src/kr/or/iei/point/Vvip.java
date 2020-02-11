package kr.or.iei.point;

public class Vvip extends Grade {

	public Vvip() {
		
	}
	
	public Vvip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getBonus() {
		return getPoint() * 0.1;
	}
}
