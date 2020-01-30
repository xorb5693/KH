package kr.or.iei.func;

import java.util.Scanner;

public class Example {

	Scanner sc = new Scanner(System.in);

	public void test1() {
		System.out.print("1~3사이의 수 입력 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("1을 입력");
			break;
		case 2:
			System.out.println("2를 입력");
			break;
		case 3:
			System.out.println("3을 입력");
			break;
		default:
			System.out.println("잘못 입력");
		}
	}
}
