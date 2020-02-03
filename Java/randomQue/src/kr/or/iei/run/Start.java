package kr.or.iei.run;

import kr.or.iei.func.*;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		Game game = new Game();
		int select;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				
				System.out.println("--------------난수 실습문제 실행파일--------------");
				System.out.println("1. 실습문제 4번(UpAndDown)");
				System.out.println("2. 실습문제 5번(BaskinRobbins)");
				System.out.println("3. 실습문제 6번(Dice)");
				System.out.println("0. 프로그램 종료");
				System.out.print("선택 > ");
				select = Integer.parseInt(sc.next());
				
				if (select == 0) {
					break;
				} else if (select == 1) {
					game.game1();
				} else if (select == 2) {
					game.game2();
				} else if (select == 3) {
					game.game3();
				} else {
					System.out.println("다시 입력해주세요.");
				}
								
			} catch (NumberFormatException ne) {
				System.err.println("잘못 입력했습니다. 메인으로 돌아갑니다.");
			}
		}
	}

}
