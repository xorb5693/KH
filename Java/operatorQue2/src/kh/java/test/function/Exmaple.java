package kh.java.test.function;

import java.util.Scanner;

public class Exmaple {
	
	Scanner sc = new Scanner(System.in);

	public void exam1() {
		int kor, eng, math;
		
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);
		
		boolean result = ((kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60));
		String str = result ? "합격" : "불합격";
		System.out.println(str);

		System.out.println("=========================");
	}
	
	public void exam2() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String str = num % 2 == 0 ? "짝수!" : "홀수!";
		
		System.out.println(str);
	}
}
