package kh.java.func;

import java.util.Scanner;

public class MethodTest {
	
	Scanner sc = new Scanner(System.in);

	public void main() {
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		
//		int sum = num1 + num2;	//100줄인 경우
//		System.out.println("두 수의 합은 : " + sum);
//		//소스코드 추가 작성
//		//위의 100줄짜리 동일한 행위를 하는 경우 줄 수 가 너무 길어짐
		
		int sum = sum(num1, num2);
		System.out.println("두 수의 합은 : " + sum);
		
		int sub = sub(num1, num2);
		System.out.println("두 수의 차는 : " + sub);
		
		int mult = multifly(num1, num2);
		System.out.println("두 수의 곱은 : " + mult);
		
		double divide = divide(num1, num2);
		System.out.printf("두 수의 나눗셈은 : %.2f\n", divide);
		
		System.out.print("연산자를 입력하세요[+, -, *, /] : ");
		char oper = sc.next().charAt(0);
		
		if (oper == '+') {
			sum = sum(num1, num2);
			System.out.println("두 수의 합은 : " + sum);
		} else if (oper == '-') {
			sub = sub(num1, num2);
			System.out.println("두 수의 차는 : " + sub);
		} else if (oper == '*') {
			mult = multifly(num1, num2);
			System.out.println("두 수의 곱은 : " + mult);
		} else if (oper == '/') {
			divide = divide(num1, num2);
			System.out.printf("두 수의 나눗셈은 : %.2f", divide);
		}
	}
	
	public int sum(int su1, int su2) {
		System.out.println("정수 2개를 더하는 메소드입니다.");
		int result = su1 + su2;
		return result;
	}
	
	//메소드 오버로딩
	public int sum(int su1, int su2, int su3) {
		System.out.println("정수 3개를 더하는 메소드입니다.");
		int result = su1 + su2 + su3;
		return result;
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multifly(int num1, int num2) {
		return num1 * num2;
	}
	
	public double divide(int num1, int num2) {
		return (double)num1 / num2;
	}
}
