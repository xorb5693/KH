package kh.java.func;

import java.util.Scanner;

public class ArrayTest {
	
	Scanner sc = new Scanner(System.in);

	public void arrayTest1() {
		
		//정수형 변수 10개를 만들어야 한다면?
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
		//배열로 선언한다면
		int num[] = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("Num" + i + " : " + num[i]);
			num[i] = i + 1;
			System.out.println("->Num" + i + " : " + num[i]);
			num[i] = (int)(Math.random() * 100);
			System.out.println("--> Num" + i + " : " + num[i]);
		}
		
		String arr[] = new String[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			arr[i] = sc.next();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arr[" + i + "] : " + arr[i]);
		}
	}
}
