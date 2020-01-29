package kh.java.function;

import java.util.Scanner;

public class Example {
	
	Scanner sc = new Scanner(System.in);

	public void exam1() {
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("========== 결과 ==========");
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 : " + (num1 / num2));
		System.out.println("나누기 나머지 : " + (num1 % num2));
		System.out.println();
	}
	
	public void exam2() {
		
		System.out.print("가로 길이 입력 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 길이 입력 : ");
		double height = sc.nextDouble();
		
		System.out.println("========== 결과 ==========");
		
		System.out.println("면적 : " + (width * height));
		System.out.println("둘레 : " + (2 * (width + height)));
		System.out.println();
	}
	
	public void exam3() {

		sc.nextLine();
		System.out.print("영어단어 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("첫번째 문자 : " + str.charAt(0));
		System.out.println("두번째 문자 : " + str.charAt(1));
		System.out.println("세번째 문자 : " + str.charAt(2));
	}
}
