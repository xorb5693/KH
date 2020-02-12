package kh.java.test;

//clone() 메소드를 다른 패키지에서 사용하기 위해서는 Cloneable 인터페이스를 구현을 먼저 해야 함.
public class Test1 extends Object implements Cloneable {

	private int data;
	
	public Test1() {
		
	}
	
	public Test1(int data) {
		
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
