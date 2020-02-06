package kh.java.func;

import java.util.Scanner;
import java.util.Random;

public class BR {

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	public void main() {
		
		while(true) {
			System.out.println("==== 베스킨 라빈스 ====");
			System.out.println("1. GAME START");
			System.out.println("2. GAME SCORE");
			System.out.println("3. END GAME");
			System.out.print("선택 > ");
			
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1:
				startGame();
				break;
			case 2:
				score();
				break;
			case 3:
				return;
			}
		}
	}
	
	public void startGame() {
		int printNum = 0;
		
		System.out.println("<<< GAME START >>>");
		
		while (true) {
			System.out.println("<<< Your Turn >>>");
			System.out.print("InputNumber : ");
			int userNum = sc.nextInt();
			printCount(userNum, printNum);
			printNum += userNum;
			if (printNum >= 31) {
				System.out.println("패배!");
				break;
			}
						
			System.out.println("<<< Com Turn >>>");
			int comNum = rand.nextInt(3) + 1;
			printCount(comNum, printNum);
			printNum += comNum;
			if (printNum >= 31) {
				System.out.println("승리!");
				break;
			}
		}
	}
	
	public void printCount(int count, int printNumber) {
		for (int i = 0; i < count; i++) {
			System.out.println(++printNumber + "!");
			if (printNumber == 31) {
				 return;
			}
		}
	}
	
	public void score() {
		
	}
}
