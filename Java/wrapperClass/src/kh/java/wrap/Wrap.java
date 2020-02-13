package kh.java.wrap;

public class Wrap {

	public void wrapTest() {
		
		//기본자료형
		//boolean, char, byte, short, int, long, float, double
		Boolean bool = new Boolean(true);
		Character ch = new Character('A');
		Byte bNum = new Byte((byte)1);
		Short sNum = new Short((short)2);
		Integer num = new Integer(4);
		Long lNum = new Long(8);
		Float fNum = new Float(3.14f);
		Double dNum = new Double(3.14);
		
		//정수 10을 Integer 클래스로 박싱
		Integer iNum = new Integer(10);
		int n = iNum.intValue();
		System.out.println(n);
		
		Double dd = new Double(3.14);
		double d = dd.doubleValue();
		System.out.println(d);
		
		//오토 박싱, 언박싱
		Integer num1 = 100;
		int n1 = num1;
		
		//문자열 -> 기본 자료형
		String data = "9991";
		int num2 = Integer.parseInt(data);
		
		String data1 = "3.14";
		double num3 = Double.parseDouble(data1);
		
		String data3 = "ABCD";
		char ch1 = data3.charAt(0);
		
		//기본 자료형 -> 문자열
		int num4 = 999;
		String data4 = String.valueOf(num4);
		String data5 = Integer.valueOf(num4).toString();
		
		double num6 = 3.14;
		String data6 = Double.valueOf(num6).toString();
		String data7 = String.valueOf(num6);
		
		char ch2 = 'a';
		String data8 = Character.valueOf(ch2).toString();
		String data9 = String.valueOf(ch2);
	}
}
