package kr.or.iei.point;

public class Vip extends Silver {

	public Vip() {
		
	}
	
	public Vip(String name, String rank, int point) {
		super(name, rank, point);
	}
	
	@Override
	public double getBonus() {
		return getPoint() * 0.07;
	}
}
