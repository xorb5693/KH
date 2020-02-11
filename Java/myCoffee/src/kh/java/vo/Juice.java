package kh.java.vo;

public class Juice extends Goods {
	private boolean size;
	
	public Juice() {
	}

	public Juice(String name, int price, int stock, boolean size) {
		super(name, price, stock);
		this.size = size;
	}

	public boolean getSize() {
		return size;
	}

	public void setSize(boolean size) {
		this.size = size;
	}
	
}
