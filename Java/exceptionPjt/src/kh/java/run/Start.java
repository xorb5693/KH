package kh.java.run;

import java.io.FileNotFoundException;

import kh.java.test.TestClass;

public class Start {

	public static void main(String[] args) {

//		new TestClass().test1();
//		new TestClass().start();
//		try {
//			new TestClass().test3();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	//test3() 메소드에서 FileNotFoundException을 throws하기 때문에 예외 처리를 해야 함.
		
		new TestClass().div(19, 0);
	}

}
