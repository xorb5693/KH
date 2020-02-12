package kh.java.ve;

public class Drink extends Goods {

	private int amount;
	private int kcal;
	
	public Drink() {
		
	}
	
	public Drink(int price, int stock, String name, boolean adult, int amount, int kcal) {
		super(price, stock, name, adult);
		
		this.amount = amount;
		this.kcal = kcal;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public int getKcal() {
		return kcal;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	@Override
	public String toString() {
		//제품명\t가격\t재고\t성인여부\t용량\t칼로리
		String str = getName() + "\t" + getPrice() + "\t" + getStock() + "\t" + (getAdult() ? "O" : "X") + "\t" + amount + "\t" + kcal;
		return str;
	}
}
