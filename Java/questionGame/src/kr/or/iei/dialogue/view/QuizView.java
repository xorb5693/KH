package kr.or.iei.dialogue.view;

import java.util.Scanner;

public class QuizView {
	Scanner sc = new Scanner(System.in);
	public int mainView() {
		System.out.println("===== 명대사 퀴즈 =====");
		System.out.println("1. 게임시작");
		System.out.println("2. 게임시작  (문제랜덤으로)");
		System.out.println("3. 되돌아가기");
		System.out.print("선택 > ");
		int select = sc.nextInt();
		return select;
	}

	public void printScore(int score) {
		System.out.println("점수 : " + score);
	}
}
