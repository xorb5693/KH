package kh.java.test;

//제네릭 사용
public class GenericEx<T> {

	private T data;
	
	public GenericEx() {
		
	}
	
	public GenericEx(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
