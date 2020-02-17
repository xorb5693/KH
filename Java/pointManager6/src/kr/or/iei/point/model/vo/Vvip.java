package kr.or.iei.point.model.vo;

public class Vvip extends Grade {
	
	public Vvip() {
		
		super();
	}

	public Vvip(String grade, String name, int point) {
		
		super(grade, name, point);
	}

	@Override
	public double getBonus() {

		return getPoint() * 0.1;
	}

}
