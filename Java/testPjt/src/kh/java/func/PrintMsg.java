package kh.java.func;

public class PrintMsg {

	public PrintMsg() {
		System.out.println("Make Class!");
	}
	
	public void printHello() {
		System.out.println("Hello Class!");
	}
	
	public void printHi() {
		System.out.println("Hi Class!");
	}
	
	public void test() {
//		System.out.println(1+1);	//2
//		System.out.println(1.1+1.1);//2.2
//		System.out.println('1'+'1');//11(X), 98(O) - ASCII 코드 때문 
//		System.out.println("1"+"1");//11

		System.out.println(1+1.1);	//정수 + 실수로 실수로 계산
		System.out.println(1+'1');//문자 -> ASCII 코드 변환 후 정수 + 정수로 정수로 계산
		System.out.println(1.1+'1');//문자 -> ASCII 코드 변환 후 실수 + 정수로 실수로 계산
		System.out.println("Hi"+1);//문자열의 우선순위가 높아 무조건 문자열로 계산
	}
}
