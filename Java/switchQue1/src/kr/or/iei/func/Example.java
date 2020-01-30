package kr.or.iei.func;

import java.util.Scanner;

public class Example {

	Scanner sc = new Scanner(System.in);

	public void exam1() {

		System.out.print("일수를 알고싶은 달을 입력하세요 : ");
		int month = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("12월달은 31일까지 있습니다.");
			break;
		case 2:
			System.out.println("2월달은 28일까지 있습니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("11월달은 30일까지 있습니다.");
			break;
		}

		System.out.println();
	}

	public void exam2() {
		System.out.println("작학금 지불 시스템입니다");
		System.out.print("학점을 입력하세요(A, B, C, D, F) : ");
		char ch = sc.next().charAt(0);

		switch (ch) {
		case 'A':
			System.out.println("수고하셨습니다. 장학금을 100% 지급해드리겠습니다.");
			break;
		case 'B':
			System.out.println("수고하셨습니다. 장학금을 50% 지급해드리겠습니다.");
			break;
		case 'C':
			System.out.println("장학금을 바라시면 좀 더 열심히 해주세요.");
			break;
		case 'D':
			System.out.println("크흠.......");
			break;
		case 'F':
			System.out.println("학사경고입니다!!!!");
			break;
		}

		System.out.println();
	}

	public void exam3() {
		System.out.println("========= 계산기 프로그램 =========");

		System.out.print("연산자를 입력하세요(+, -, *, /) : ");
		char oper = sc.next().charAt(0);

		System.out.print("첫번째 정수를 입력 하세요 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수를 입력 하세요 : ");
		int num2 = sc.nextInt();

		switch (oper) {
		case '+':
			System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
			break;
		case '-':
			System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
			break;
		case '*':
			System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
			break;
		case '/':
			System.out.printf("%d / %d = %f\n", num1, num2, ((double) num1 / num2));
			break;
		}

		System.out.println();
	}

	public void exam4() {

		System.out.print("점수입력 : ");
		int score = sc.nextInt();

		if (score < 0 || score > 100) {
			System.out.println("잘못된 입력(0~100 사이 입력)");
		} else {
			int grade = score / 10;
			switch (grade) {
			case 10:
			case 9:
				System.out.println(score + "점 ==> A 등급");
				break;
			case 8:
				System.out.println(score + "점 ==> B 등급");
				break;
			case 7:
				System.out.println(score + "점 ==> C 등급");
				break;
			case 6:
				System.out.println(score + "점 ==> D 등급");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println(score + "점 ==> F 등급");
				break;
			}
		}
		System.out.println();

	}
}
