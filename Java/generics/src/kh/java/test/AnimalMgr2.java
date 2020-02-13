package kh.java.test;

//제네릭을 사용하긴 하지만 T는 Animal 클래스이거나 Animal을 상속한 경우에만 사용 가능
public class AnimalMgr2<T extends Animal> {

	private T data;
	
	public AnimalMgr2() {
		
	}
	
	public AnimalMgr2(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
