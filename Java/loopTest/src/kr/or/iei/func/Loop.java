package kr.or.iei.func;

public class Loop {

	public void forTest() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 출력");
		}
		
		System.out.println();
	}
	
	public void whileTest() {
		int i = 1;
		while (i <= 5) {
			System.out.println(i + "번째 반복해서 수행 중");
			i++;
		}
		
		System.out.println();
	}
}
