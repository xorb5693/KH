package kr.or.iei.point;

public class Silver extends Grade {

	public Silver() {
		
	}
	
	public Silver(String grade, String name, int point) {
		super(grade, name, point);
	}
	
	@Override
	public double getBonus() {
		return getPoint() * 0.02;
	}
}
