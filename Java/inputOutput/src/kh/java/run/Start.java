package kh.java.run;

import kh.java.test.ByteStreamTest;
import kh.java.test.CharStreamTest;
import kh.java.test.FileTest;
import kh.java.test.ImageStream;
import kh.java.test.ImageStream2;

public class Start {

	public static void main(String[] args) {

//		new ByteStreamTest().primaryStream();
//		new ByteStreamTest().subStream();
//		new CharStreamTest().primaryStream();
//		new CharStreamTest().subStream();
//		new CharStreamTest().reader();
//		new ImageStream().test();
//		new FileTest().fileTest();
		new ImageStream2().imageTest();
	}
}
