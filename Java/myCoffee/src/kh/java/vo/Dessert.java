package kh.java.vo;

public class Dessert extends Goods {

	private boolean size;
	private String expired;

	public Dessert() {
	}

	public Dessert(String name, int price, int stock, boolean size, String expired) {
		super(name, price, stock);
		this.size = size;
		this.expired = expired;
	}

	public boolean getSize() {
		return size;
	}

	public void setSize(boolean size) {
		this.size = size;
	}

	public String getExpired() {
		return expired;
	}

	public void setExpired(String expired) {
		this.expired = expired;
	}

}
