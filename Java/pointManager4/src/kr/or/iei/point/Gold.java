package kr.or.iei.point;

public class Gold extends Grade {

	public Gold() {
		
	}
	
	public Gold(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getBonus() {
		return getPoint() * 0.07;
	}
}
