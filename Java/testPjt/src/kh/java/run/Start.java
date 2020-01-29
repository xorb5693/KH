package kh.java.run;

import kh.java.func.PrintMsg;

public class Start {

	public static void main(String[] args) {

		PrintMsg pm = new PrintMsg(); //객체 생성
		
		System.out.println("Hello Main!");
		
		pm.printHello(); //메소드 호출
		pm.printHi();
	}

}
