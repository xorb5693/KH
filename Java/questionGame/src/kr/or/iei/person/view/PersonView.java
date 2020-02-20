package kr.or.iei.person.view;

import java.util.Scanner;

public class PersonView {
	Scanner sc = new Scanner(System.in);

	public int mainMenu() {
		System.out.println("===== 인물 퀴즈 =====");
		System.out.println("1.Game Start");
		System.out.println("0.뒤로가기");
		System.out.print("선택 > ");
		int sel = sc.nextInt();

		return sel;
	}
	
	public int answer() {
		int score=0;
		System.out.println("정답입니다!!!");
		score +=100;
		return score;
	}
	
	public void print1() {
		System.out.println("<< 사랑의 불시착 Quiz >>");
		System.out.println("<그만 풀고싶다면 0번을 입력해주세요>");
	}
	
	public void print2(String print2, int num) {
		
		
		System.out.print((num) + "번 문제 :\n");
		System.out.println(print2);
		System.out.print("정답은? ");
		
	}
	
	public void print3(String print3) {
		System.out.println("정답은 : " + print3 + "입니다.");
		System.out.println("오답입니다!");
	}
	
	public void printScore(int score) {
		System.out.println("점수 : " + score);
	}
}
