package kh.java.run;

import kh.java.test.Test1;

public class Start {

	public static void main(String[] args) {

		//toString()
		Test1 t1 = new Test1();
		System.out.println(t1);
		System.out.println(t1.toString());
		
		//clone()
		Test1 t2 = (Test1)t1.clone();	
		//기존의 clone() 메소드는 protected이기 때문에 바로 사용 불가, Test1에서 clone() 메소드의 Override가 필요함.
		//리턴 타입이 Object인 clone() 메소드는 Test1에서 Object를 받을 수 없기에 명시적 형변환이 필요함.
		
		//equals()
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		//str1과 str2의 주소를 비교하기 때문에 참조형인 문자열의 경우 비교가 불가능함.
		if (str1 == str2) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		//두 내용물을 비교하여 boolean을 리턴.
		if (str1.equals(str2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		//new를 이용한 경우와 ""를 이용해 넣은 경우는 다르게 작동을 한다.
		str1 = "Hello";
		str2 = "Hello";
		
		//다른 클래스는 문제 없지만 String만은 특이한 경우이기에 같다고 출력이 된다.
		if (str1 == str2) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		//두 내용물을 비교하여 boolean을 리턴.
		if (str1.equals(str2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
	}

}
