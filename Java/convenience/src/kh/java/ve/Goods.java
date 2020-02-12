package kh.java.ve;

public class Goods {

	//가격, 재고, 상품이름, 성인인증 필요 유뮤
	private int price;
	private int stock;
	private String name;
	private boolean adult;
	
	//기본생성자, 매개변수생성자, getter, setter
	public Goods() {
		
	}
	
	public Goods(int price, int stock, String name, boolean adult) {
		this.price = price;
		this.stock = stock;
		this.name = name;
		this.adult = adult;
	}
	
	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public String getName() {
		return name;
	}

	public boolean getAdult() {
		return adult;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
	@Override
	public String toString() {
		//제품명\t가격\t재고\t성인여부
		String str = name + "\t" + price + "\t" + stock + "\t" + (getAdult() ? "O" : "X");
		return str;
	}
	
}
