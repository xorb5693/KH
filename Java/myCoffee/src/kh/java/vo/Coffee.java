package kh.java.vo;

public class Coffee extends Goods {
	private boolean size;
	private boolean temp;
	
	public Coffee() {}
	
	public Coffee(String name, int price, int stock, boolean size, boolean temp) {
		super(name, price, stock);
		this.size = size;
		this.temp = temp;
	}

	public boolean getSize() {
		return size;
	}

	public void setSize(boolean size) {
		this.size = size;
	}

	public boolean getTemp() {
		return temp;
	}

	public void setTemp(boolean temp) {
		this.temp = temp;
	}
	
}
