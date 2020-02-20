package kr.or.iei.capital.view;

import java.util.Scanner;

public class View {
	Scanner sc = new Scanner(System.in);
	
	public void errorMsg(String msg) {
		System.out.println(msg);
	}
	public void goodMsg(String msg) {
		System.out.println(msg);
	}
	public void outputMsg(String msg) {
		System.out.println(msg);
	}
	
	public int mainView() {
		System.out.println("===== 수도이름 맞추기 =====");
		System.out.println("1. 게임하기");
		System.out.println("0. 되돌아가기");
		System.out.print("선택 > ");
		int select = sc.nextInt();
		return select;
	}
	public void gameStart() {
		System.out.println("===== Game Start =====");
	}
	
	public void printScore(int score) {
		System.out.println("점수 : " + score);
	}
}
