package kh.java.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestClass {

	Scanner sc = new Scanner(System.in);

	public void test1() {

		System.out.println("나눗셈 프로그램");
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();

		try {
			int result = num1 / num2;

			System.out.println("결과 : " + result);

		} catch (ArithmeticException ae) {
			System.err.println("0으로는 나눌 수 없습니다.");
		}
	}

	public void div(int num1, int num2) {
		if (num1 == 0 || num2 == 0) {

			throw new ExceptionTest2("0으로 나눌 수 없습니다.");
			// try {
			// throw new ExceptionTest1("0으로 나눌 수 없습니다.");
			// } catch (ExceptionTest1 e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
		}

		System.out.println(num1 / num2);
	}

	public void start() {
		int choice = 0;

		menuPrint();

		try {
			choice = sc.nextInt();
			test2(choice);
		} catch (InputMismatchException ie) {
			System.err.println("숫자를 입력하세요.");
			delay();
		} finally {
			System.out.println("프로그램이 종료됩니다.");
		}

	}

	public void menuPrint() {

		System.out.println("골라봐");
		System.out.println("1. 정지엽 지각");
		System.out.println("2. 언제오는 거죠?");
		System.out.println("3. 안와도... 크흠");
		System.out.print("입력 : ");

	}

	public void test2(int choice) {
		switch (choice) {
		case 1:
			System.out.println("정지엽 지각");
			break;
		case 2:
			System.out.println("언제오는 거죠?");
			break;
		case 3:
			System.out.println("안와도... 크흠");
			break;
		default:
			System.out.println("1~3에서 선택하세요");
			break;
		}
	}

	public void test3() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("test.txt");
	}

	public void test4() throws FileNotFoundException {
		test3();
	}

	public void test5() {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("test.txt");

			// 파일을 읽어오는 로직
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void test6() {
		try (FileInputStream fis = new FileInputStream("test.txt")) {

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delay() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
