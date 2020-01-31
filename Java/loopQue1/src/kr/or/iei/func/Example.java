package kr.or.iei.func;

import java.util.Scanner;

public class Example {
	
	Scanner sc = new Scanner(System.in);

	public void exam1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
		
		System.out.println();
	}
	
	public void exam2() {
		System.out.print("몇번 출력하시겠습니까? ");
		int count = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.println("안녕하세요");
		}
		
		System.out.println();
	}
	
	public void exam3() {
		System.out.println("2단 입니다.");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + (2 * i));
		}
		
		System.out.println();
	}
	
	public void exam4() {
		System.out.print("몇단을 출력하시겠습니까? ");
		
		int goo = sc.nextInt();
		System.out.println(goo + "단 입니다.");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(goo + " * " + i + " = " + (goo * i));
		}
		
		System.out.println();
	}
	
	public void exam5() {
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("정수 값을 입력하시요 : ");
			sum += sc.nextInt();
		}
		System.out.println("입력한 5개 정수의 합 : " + sum);
		
		System.out.println();
	}
	
	public void exam6() {
		int sum = 0;
		
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				sum += i;
			}
			
			System.out.println(num2 + " ~ " + num1 + "의 정수의 합 : " + sum);
		} else {
			for (int i = num1; i <= num2; i++) {
				sum += i;
			}
			
			System.out.println(num1 + " ~ " + num2 + "의 정수의 합 : " + sum);	
		}
		
		
		System.out.println();
	}
	
	public void exam7() {
		int sum = 0;
		
		System.out.print("숫자  입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) 
				sum += i;
		}
		
		System.out.println("짝수들의 합은 : " + sum);
		
		System.out.println();
	}
}
