package kh.java.ve;

public class Snack extends Goods {

	private int kcal;
	private int weight;
	
	public Snack() {
		
	}
	
	public Snack(int price, int stock, String name, boolean adult, int kcal, int weight) {
		super(price, stock, name, adult);
		this.kcal = kcal;
		this.weight = weight;
	}
	
	public int getKcal() {
		return kcal;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		//제품명\t가격\t재고\t성인여부\t칼로리\t무게
		String str = getName() + "\t" + getPrice() + "\t" + getStock() + "\t" + (getAdult() ? "O" : "X") + "\t" + kcal + "\t" + weight;
		return str;
	}
}
