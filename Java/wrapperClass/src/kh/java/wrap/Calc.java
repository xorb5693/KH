package kh.java.wrap;

public interface Calc {

	//숫자 2개와 연산자를 입력받아서 연산하는 기능
	public void start();
	public int add(String num1, String num2);
	public int sub(String num1, String num2);
	public int multi(String num1, String num2);
	public double div(String num1, String num2);
	
}
