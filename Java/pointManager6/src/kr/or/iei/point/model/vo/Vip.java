package kr.or.iei.point.model.vo;

public class Vip extends Grade {
	
	public Vip() {
		
		super();
	}

	public Vip(String grade, String name, int point) {
		
		super(grade, name, point);
	}

	@Override
	public double getBonus() {

		return getPoint() * 0.07;
	}

}
