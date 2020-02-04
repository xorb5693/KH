package kr.or.iei.func;

import java.util.Scanner;

public class Example {
	
	Scanner sc = new Scanner(System.in);

	public void exam1() {
		
		String str[] = {"딸기", "복숭아", "키위", "사과", "바나나"};
		
		System.out.println(str[4]);
		
		System.out.println();
		
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		System.out.println(str[4]);
		
		System.out.println();
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	public void exam2() {
		
		int num[] = new int[100];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
			if ((i + 1) % 10 == 0 && i != 0) {
				System.out.println();
			}
		}

		System.out.println("---------------------------------------------------------------------------------");
	}
	
	public void exam3() {

		int num[] = new int[4];
		String str[] = {"국어점수", "영어점수", "수학점수", "합계"};
				
		try {
						
			for (int i = 0; i < num.length - 1; i++) {
				System.out.print(str[i] + " : ");
				num[i] = Integer.parseInt(sc.next());
				num[num.length - 1] += num[i]; 
			}
			
			for (int i = 0; i < num.length; i++) {
				System.out.println(str[i] + " : " + num[i]);
			}
			
			System.out.printf("평균 : %.2f\n", ((double)num[num.length - 1] / (num.length - 1)));
			
		} catch(NumberFormatException ne) {
			System.err.println("숫자를 입력해 주세요.");
		}
		
		System.out.println("---------------------------------------------------------------------------------");
	}
}
