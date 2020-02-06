package kh.java.run;

import kh.java.func.MethodTest;
import kh.java.func.Exam;
import kh.java.func.BR;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Exam e = new Exam();
		
		System.out.print("영문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println("==== 변환 ====");
		char ch2 = e.changeChar(ch);
		System.out.println(ch + "-->" + ch2);
		
		int arr[] = {1,2,3,4,5};
		System.out.println(arr[2]);
		
		//arr[2] 내부의 값을 복사해서 전달
		e.testFunction(arr[2]);
		System.out.println(arr[2]);
		
		//arr 배열의 주소를 전달
		e.testFunction2(arr);
		System.out.println(arr[2]);
		
		MethodTest mTest = new MethodTest();
		mTest.main();
		System.out.println(mTest.sum(21, 7));
		System.out.println(mTest.sum(1, 2, 3));
		
		BR br = new BR();
		br.main();
	}

}
