package kh.java.func;

public class Exam {

	public char changeChar(char ch) {
		char ch2 = (char) (ch^32);
		return ch2;
	}
	
	public void testFunction(int num) {
		num = 100;
	}
	
	public void testFunction2(int[] arr) {
		arr[2] = 100;
	}
}
