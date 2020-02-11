package kh.java.test;

import java.util.Scanner;

public class CalcMgr {
	Scanner sc = new Scanner(System.in);

	public void main() {
		
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		Calc c = new Calc();
		int sum = c.sum(num1, num2);
		
		System.out.println(sum);
	}
}
