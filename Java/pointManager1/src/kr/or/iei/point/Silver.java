package kr.or.iei.point;

public class Silver {

	private String name;
	private String rank;
	private int point;
	
	public Silver() {
		
	}
	
	public Silver(String name, String rank, int point) {
		this.rank = rank;
		this.name = name;
		this.point = point;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getName() {
		return name;
	}
	
	public String getRank() {
		return rank;
	}

	public int getPoint() {
		return point;
	}
	
	public int bonusPoint() {
		int bonus = (int) (point * 0.02);
		return bonus;
	}
}
