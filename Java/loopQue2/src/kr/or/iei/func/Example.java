package kr.or.iei.func;

import java.util.Scanner;

public class Example {

	Scanner sc = new Scanner(System.in);
	
	public void exam1() {
		
		int i = 0;
		
		while(i < 5) {
			System.out.println("안녕하세요");
			i++;
		}
		
		System.out.println();
	}
	
	public void exam2() {
		
		System.out.print("몇번 출력하시겠습니까? ");
		int count = sc.nextInt();
		
		int i = 0;
		
		while(i < count) {
			System.out.println("안녕하세요");
			i++;
		}
		
		System.out.println();
	}
	
	public void exam3() {
		
		System.out.println("2단 입니다.");
		
		int i = 1;
		
		while(i <= 9) {
			System.out.println("2 * " + i + " = " + (2 * i));
			i++;
		}
		
		System.out.println();
	}
	
	public void exam4() {
		
		System.out.print("몇단을 출력하시겠습니까? ");
		int goo = sc.nextInt();
		
		System.out.println(goo + "단 입니다.");
		int i = 1;
		
		while(i <= 9) {
			System.out.println(goo + " * " + i + " = " + (goo * i));
			i++;
		}
		
		System.out.println();
	}
	
	public void exam5() {
		int sum = 0;
		int i = 0;
		
		while (i < 5) {
			System.out.print("정수 값을 입력하시오 : ");
			sum += sc.nextInt();
			i++;
		}
		
		System.out.println("입력한 5개 정수의 함 : " + sum);
		
		System.out.println();
	}
	
	public void exam6() {
		
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		int i;
		
		if (num1 > num2) {
			i = num2;
			while (i <= num1) {
				sum += i;
				i++;
			}
			System.out.println(num2 + " ~ " + num1 + "의 정수의 합 : " + sum);
		} else {
			i = num1;
			while (i <= num2) {
				sum += i;
				i++;
			}
			System.out.println(num1 + " ~ " + num2 + "의 정수의 합 : " + sum);
		}
		
		System.out.println();
	}
	
	public void exam7() {
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		
		while(i <= num) {
			if (i % 2 == 0)
				sum += i;
			i++;
		}
		
		System.out.print("짝수들의 합은 : " + sum);
		System.out.println();
	}
}
