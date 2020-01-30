package kr.or.iei.run;

public class Run {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println("------");
		
		System.out.println(b);
		System.out.println(++b);
		System.out.println(b);

		System.out.println("------");
		
		a = 10;
		b = (a--) + 2;	//a--가 후위 연산이므로 a-1은 모든 연산이 끝난 후에 이뤄진다.
		
		System.out.println(a);
		System.out.println(b);

		System.out.println("------");
		
		a = 10;
		b = (--a) + 2;
		
		System.out.println(a);
		System.out.println(b);

		System.out.println("------");
		
		a = 10;
		b = 10;
		int c = (a++) + (++b) + a;	//Java 기준 (a++) + (++b)를 먼저 계산하여 21이 나오고, a값은 11로 바뀐 상태에서 마지막 a와 계산이 됨.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
