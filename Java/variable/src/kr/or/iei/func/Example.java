package kr.or.iei.func;

public class Example {
	
	public void exam1() {
		int num1;
		num1 = 100;
		char ch1 = '1';
		long num2 = 10000L;
		float fNum = 3.14f;
		final double PI = 3.14;
		
		System.out.println("정수 출력 : " + (num1 + num1));
		num1 = 300;
		System.out.println("정수 출력 : " + (num1 + num1));
		System.out.println("문자 출력 : " + (ch1 + ch1));
	}
	
	public void exam2() {
		//변수 4개 생성
		
		String name = "박태규";	//이름을 저장할 변수 -> String
		int age = 27;	//나이를 저장할 변수 -> int
		String address = "서울시 구로구 궁동 190-146 중앙하이츠빌 A동 302호";	//주소를 저장할 변수 -> String
		char sex = '남';	//성별(남/녀) -> char

		//각 변수 선언 후 본인 정보 입력 후 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("성별 : " + sex);
	}
	
	public void exam3() {
		int num = 2147483647;
		int result = num + 1;	//오버플로 발생
		System.out.println(result);
	}
	
	public void exam4() {
		int num1 = 10;
		int num2 = 20;
		double fNum = 12.548923154875231;
		
//		System.out.println("정수형 변수 num안에 들어있는 값은 " + num1 + "입니다.");
//		System.out.printf("정수형 변수 num안에 들어있는 값은 %d입니다.\n", num1);
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) + "입니다.");
		System.out.printf("%d + %d = %d입니다.\n", num1, num2, num1 + num2);
		System.out.println("실수형 변수 fNum안에 들어있는 값은 " + fNum + "입니다.");
		System.out.printf("실수형 변수 fNum안에 들어있는 값은 %.5f입니다.\n", fNum);
	}
}
