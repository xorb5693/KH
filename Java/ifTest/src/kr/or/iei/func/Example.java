package kr.or.iei.func;

import java.util.Scanner;

public class Example {

	Scanner sc = new Scanner(System.in);
	
	public void exam1() {
		
		System.out.println("========= 계산기 프로그램 =========");

		System.out.print("연산자를 입력하세요(+, -, *, /) : ");
		char oper = sc.next().charAt(0);
		
		System.out.print("첫번째 정수를 입력 하세요. : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력 하세요. : ");
		int num2 = sc.nextInt();
		
		if (oper =='+') {
			System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
		}
		if (oper =='-') {
			System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
		}
		if (oper =='*') {
			System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
		}
		if (oper =='/') {
			System.out.printf("%d / %d = %f\n", num1, num2, ((double)num1 / num2));
		}
	}
	
	public void exam2() {
		
		System.out.println("======== 숫자 구별 프로그램 ========");
		
		System.out.print("임의의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.printf("당신이 입력한 수 %d은(는) 양수입니다.\n", num);
		}
		if (num == 0) {
			System.out.printf("당신이 입력한 수 %d은(는) 0입니다.\n", num);
		}
		if (num < 0) {
			System.out.printf("당신이 입력한 수 %d은(는) 음수입니다.\n", num);
		}
	}
	
	public void exam3() {
		
		System.out.println("========= 두수 비교 프로그램 ========");
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.printf("%d > %d\n", num1, num2);
			System.out.println("첫번째 수가 더 큽니다");
		}
		if (num1 == num2) {
			System.out.printf("%d = %d\n", num1, num2);
			System.out.println("두 수가 같습니다");
		}
		if (num1 < num2) {
			System.out.printf("%d < %d\n", num1, num2);
			System.out.println("두번째 수가 더 큽니다");
		}
	}
}
