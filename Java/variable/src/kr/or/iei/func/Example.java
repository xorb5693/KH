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
		//각 변수 선언 후 본인 정보 입력 후 출력
		
		String name = "박태규";	//이름을 저장할 변수 -> String
		int age = 27;	//나이를 저장할 변수 -> int
		String address = "서울시 구로구 궁동 190-146 중앙하이츠빌 A동 302호";	//주소를 저장할 변수 -> String
		char sex = '남';	//성별(남/녀) -> char
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("성별 : " + sex);
	}
}
