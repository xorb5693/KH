package kr.or.iei.func;

public class Example {
	
	public void exam1() {
		int num1;
		num1 = 100;
		char ch1 = '1';
		long num2 = 10000L;
		float fNum = 3.14f;
		final double PI = 3.14;
		
		System.out.println("정수 출력 : " + (num1 + num1));
		num1 = 200;
		System.out.println("정수 출력 : " + (num1 + num1));
		System.out.println("문자 출력 : " + (ch1 + ch1));
	}
}
