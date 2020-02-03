package kh.java.fun;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	public void random1() {
		System.out.println(rand.nextInt());
		//0~9 범위 안에서 랜덤 숫자를 가져옴
		System.out.println(rand.nextInt(10));
		//0~31까지 중의 랜덤 숫자 추출
		System.out.println(rand.nextInt(32));
		
		//0~9까지의 랜덤 수
		System.out.println("0 ~ 9까지의 랜덤 수 : " + rand.nextInt(10));
		//1~10까지의 랜덤 수
		System.out.println("1 ~ 10까지의 랜덤 수 : " + (rand.nextInt(10) + 1));
		//20~35까지의 랜덤 수
		System.out.println("20 ~ 35까지의 랜덤 수 : " + (rand.nextInt(16) + 20));
		//0 또는 1
		System.out.println("0 또는 1 : " + rand.nextInt(2));
	}
	
	public void random2() {
		
		//1또는 2의 랜덤 수를 추출한 뒤 사용자가 입력한 값과 비교		
		int insert, coin;
		
		while (true) {
			System.out.println("=== 동전 앞 뒤 맞추기 ===");
			System.out.print("숫자를 입력해 주세요 (1. 앞면 / 2. 뒷면) : ");
			
			insert = sc.nextInt();
			coin = rand.nextInt(2) + 1;
			System.out.println();
			
			if (insert == coin) {
				System.out.println("맞췄습니다^^");
				System.out.println();
				System.out.println("---------------------------------->restart");
			} else {
				System.out.println("땡! 틀렸습니다!");
				System.out.println();
				break;
			}
			
		}
	}
	
	public void random3() {
		
		//가위바위보 게임
		int user, com;
		
		System.out.println("=== 가위 바위 보 게임 ===");
		
		System.out.print("숫자를 선택하세요(1. 가위/ 2. 바위/ 3. 보) : ");
		user = sc.nextInt();
		com = rand.nextInt(3) + 1;
		
		System.out.println("======== 결과 ========");

		if (user == 1) {
			System.out.println("당신은 가위를 냈습니다.");
		} else if (user == 2) {
			System.out.println("당신은 바위를 냈습니다.");
		} else if (user == 3) {
			System.out.println("당신은 보를 냈습니다.");
		}
		
		if (com == 1) {
			System.out.println("컴퓨터는 가위를 냈습니다.");
		} else if (com == 2) {
			System.out.println("컴퓨터는 바위를 냈습니다.");
		} else if (com == 3) {
			System.out.println("컴퓨터는 보를 냈습니다.");
		}
		
		System.out.println("====================");
		
		if (user == com) {
			System.out.println("비겼습니다.");
		} else if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com ==2)) {
			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
		} else {
			System.out.println("컴퓨터가 이겼습니다. ^^");
		}
	}
}
