package kr.or.iei.point;

public class Silver extends Grade {

	public Silver() {
		
	}
	
	public Silver(String name, String grade, int point) {
		super(name, grade, point);
	}

	@Override
	public double getBonus() {
		return getPoint() * 0.02;
	}
}
