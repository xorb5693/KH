package kr.or.iei.point.model.vo;

public class Silver extends Grade {
	
	public Silver() {
		super();
	}

	public Silver(String grade, String name, int point) {
		super(grade, name, point);
	}

	@Override
	public double getBonus() {
		
		return getPoint() * 0.02;
	}

}
