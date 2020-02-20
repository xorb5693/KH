package kr.or.iei.vo;

public class UserPoint implements Comparable {

	private String id;
	private int point;
	
	public UserPoint() {
		super();
	}

	public UserPoint(String id, int point) {
		super();
		this.id = id;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public int compareTo(Object o) {
		return this.point - ((UserPoint)o).point;
	}

	@Override
	public String toString() {
		return id + "\t\t" + point;
	}
}
