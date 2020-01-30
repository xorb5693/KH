package kr.or.iei.func;

import java.util.Scanner;

public class Example {
	Scanner sc = new Scanner(System.in);

	public void exam1() {
		
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("========== 결과 ===========");
		System.out.println("두 수를 더한 수 : " + (num1 + num2));
		System.out.println("두 수를 뺀 수 : " + (num1 - num2));
		System.out.println("두 수를 곱한 수 : " + (num1 * num2));
		System.out.printf("두 수를 나눈 수 : %.2f\n", ((double)num1 / num2));
		
		System.out.println("=========================");
	}
	
	public void exam2() {
		int a = 40, b = 20;
		
		a += b;	//a = a + b = 40 + 20 = 60
		//a = 60, b = 20
		System.out.printf("a의 값 : %d, b의 값 : %d\n", a, b);
		
		a -= b;	//a = a - b = 60 - 20 = 40
		//a = 40, b = 20
		System.out.printf("a의 값 : %d, b의 값 : %d\n", a, b);
		
		b *= a; //b = b * a = 20 * 40 = 800
		//a = 40, b = 800 
		System.out.printf("a의 값 : %d, b의 값 : %d\n", a, b);
		
		b /= a;	//b = b / a = 800 / 40 = 20
		//a = 40, b = 20
		System.out.printf("a의 값 : %d, b의 값 : %d\n", a, b);

		System.out.println("=========================");
	}
	
	public void exam3() {
		int a = 10, b = 20, c = 30, d = 40;
		boolean result1, result2;
		
		result1 = ((a < 20 && b > 10) && (c == 20 || d == 40));
		/*result1 = ((10 < 20) && (20 > 10)) && ((30 == 20) || (40 == 40))
		= (true && true) && (false || true) = true && true = true*/
		
		result2 = ((a == 10 && b != 2 * 10) || (c == 30 && d != 40));
		/*result2 = ((10 == 10) && (20 != 20)) || ((30 == 30) && (40 != 40))
		 * = (true && false) || (true && false) = false || false = false*/
		
		System.out.printf("첫번째 결과값 : %b\n", result1);
		System.out.printf("두번째 결과값 : %b\n", result2);
		System.out.println("=========================");
	}
	
	public void exam4() {
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		String str = age > 19 ? "성인입니다. 어서오세요" : "미성년자는 입장불가입니다.";
		System.out.println(str);
		System.out.println("=========================");
		
	}
}
