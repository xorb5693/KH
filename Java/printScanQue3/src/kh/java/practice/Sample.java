package kh.java.practice;

import java.util.Scanner;

public class Sample {
	
	Scanner sc = new Scanner(System.in);

	public void sample1() {
		
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.printf("%c의 유니코드 값 : %d\n", ch, (int)ch);
		System.out.println();
	}
	
	public void sample2() {
		
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		
		System.out.print("수어 점수 입력 : ");
		int math = sc.nextInt();

		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();

		System.out.println("========== 결과 ==========");
		int sum = kor + math + eng;
		int avg = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
