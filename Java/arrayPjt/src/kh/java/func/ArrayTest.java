package kh.java.func;

import java.util.Scanner;

public class ArrayTest {

	Scanner sc = new Scanner(System.in);

	public void arrayTest1() {

		// 정수형 변수 10개를 만들어야 한다면?
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
		// 배열로 선언한다면
		int num[] = new int[10];

		for (int i = 0; i < num.length; i++) {
			System.out.println("Num" + i + " : " + num[i]);
			num[i] = i + 1;
			System.out.println("->Num" + i + " : " + num[i]);
			num[i] = (int) (Math.random() * 100);
			System.out.println("--> Num" + i + " : " + num[i]);
		}

		String arr[] = new String[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			arr[i] = sc.next();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arr[" + i + "] : " + arr[i]);
		}
	}

	public void arrayTest2() {
		int arr1[] = { 1, 2, 3, 4, 5 };
		// 얕은 복사
		int arr2[] = arr1;

		// 각 배열의 주소값 출력
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());

		// arr1 배열 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println();

		// arr2 배열 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		arr1[2] = 100;
		arr2[1] = 300;

		System.out.println();

		// arr1 배열 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println();

		// arr2 배열 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println();

		System.out.println("----------------------");
	}

	public void arrayTest3() {
		int arr1[] = { 1, 2, 3, 4, 5 };
		
//		//1. for문을 이용한 깊은 복사
//		int arr2[] = new int[arr1.length];
//
//		for (int i = 0; i < arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
		
//		//2. arraycopy를 이용한 깊은 복사
//		int arr2[] = new int[arr1.length];
//		//System.arraycopy(복사할 배열 이름, 복사할 배열의 시작 번호, 복사될 배열의 이름, 복사될 배열의 시작 번호, 복사할 크기) 
//		System.arraycopy(arr1, 0, arr2, 1, 4);
		
		//3. clone을 이용한 깊은 복사
		int arr2[] = new int[arr1.length];
		arr2 = arr1.clone();

		// 각 배열의 주소값 출력
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());

		// arr1 배열 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println();

		// arr2 배열 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		arr1[2] = 100;
		arr2[1] = 300;

		System.out.println();

		// arr1 배열 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println();

		// arr2 배열 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println();

		System.out.println("----------------------");
	}
	
	public void arrayTest4() {
		int arr[][] = new int[3][5];

		int k = 1;
		
		//순서대로 값 대입
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k;
				k++;
			}
		}
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
	}
}
