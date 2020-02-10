package kr.or.iei.point;

public class Gold extends Silver {
	//grand 변수, name 변수, point 변수
	//getter, setter, bonusPoint 메소드 모두 상속
	
	public Gold() {
		super(); //<-- 자동으로 들어감
	}
	
	public Gold(String name, String rank, int point) {
		//super()는 첫줄에서만 호출 가능. 위에 다른 코드가 있으면 에러가 생김.
		super(name, rank, point);
	}

	//오버라이딩
	@Override
	public double getBonus() {
		double bonus = getPoint() * 0.05;
		return bonus;
	}
}
