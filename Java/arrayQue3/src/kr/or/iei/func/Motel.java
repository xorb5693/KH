package kr.or.iei.func;

import java.util.Scanner;

public class Motel {
	
	Scanner sc = new Scanner(System.in);
	boolean in[] = new boolean[10];

	public Motel() {
		
		int select;
		boolean out = false;
		
		while(true) {
			
			System.out.println("1. 입실\t2. 퇴실\t3. 방보기\t4.종료");
			
			select = sc.nextInt();
			
			switch(select) {
			case 1 :
				entering();
				break;
			case 2 : 
				leaving();
				break;
			case 3 : 
				seeing();
				break;
			case 4 :
				out = true;
				break;
			default : System.out.println("잘못 선택하셨습니다."); 
			}
			
			if (out) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			try {
				Thread.sleep(2000);
			} catch(InterruptedException ie) {
				
			}
			System.out.println("모텔 관리 프로그램 v1.0");
		}
	}
	
	private void entering() {
		
		System.out.println("몇번 방에 입실하시겠습니까?");
		int select = sc.nextInt() - 1;
		
		if (in[select]) {
			System.out.println((select + 1) + "번 방은 현재 손님이 있습니다.");
		} else {
			System.out.println((select + 1) + "번 방에 입실하셨습니다.");
			in[select] = true;
		}
	}
	
	private void leaving() {
		System.out.println("몇번방에서 퇴실하시겠습니까?");
		int select = sc.nextInt() - 1;
		
		if (in[select]) {
			System.out.println((select + 1) + "번 방에서 퇴실하셨습니다.");
			in[select] = false;
		} else {
			System.out.println((select + 1) + "번 방은 현재 빈 방입니다.");
		}
	}
	
	private void seeing() {
		for (int i = 0; i < in.length; i++) {
			if (in[i]) {
				System.out.println((i + 1) + "번 방에는 현재 손님이 있습니다.");
			} else {
				System.out.println((i + 1) + "번 방이 현재 비어있습니다.");
			}
		}
	}
	
}
