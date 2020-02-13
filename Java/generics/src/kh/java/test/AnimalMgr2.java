package kh.java.test;

public class AnimalMgr2<T> {

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
