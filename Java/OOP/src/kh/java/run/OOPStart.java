package kh.java.run;

import kh.java.vo.*;
import java.util.Scanner;

public class OOPStart {

	public static void main(String[] args) {

		TV tv = new TV();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===== TV 시청 가이드 =====");
			System.out.println("1. 전원 on/off");
			System.out.println("2. 현재 채널 및 볼륨 확인");
			System.out.println("3. 채널 +1");
			System.out.println("4. 채널 -1");
			System.out.println("5. 볼륨 +1");
			System.out.println("6. 볼륨 -1");
			System.out.println("7. 채널 입력");
			System.out.print("선택 > ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1 :
				if (tv.power()) {
					System.out.println("전원이 켜졌습니다.");
				} else {
					System.out.println("전원이 꺼졌습니다.");
				}
				break;
			case 2 :
				if (tv.power) {
					System.out.println("채널 : " + tv.channel);
					System.out.println("볼륨 : " + tv.volume);
				} else {
					System.out.println("전원을 켜주세요.");
				}
				break;
			case 3 :
				if (tv.power) {
					tv.channelUp();
					System.out.println("현재 채널 : " + tv.channel);
				} else {
					System.out.println("전원을 켜주세요.");
				}
				break;
			case 4 :
				if (tv.power) {
					tv.channelDown();
					System.out.println("현재 채널 : " + tv.channel);
				} else {
					System.out.println("전원을 켜주세요.");
				}
				break;
			case 5 :
				if (tv.power) {
					tv.volumeUp();
					System.out.println("현재 볼륨 : " + tv.volume);
				} else {
					System.out.println("전원을 켜주세요.");
				}
				break;
			case 6 :
				if (tv.power) {
					tv.volumeDown();
					System.out.println("현재 볼륨 : " + tv.volume);
				} else {
					System.out.println("전원을 켜주세요.");
				}
				break;
			case 7 :
				if (tv.power) {
					System.out.print("채널을 입력하세요 : ");
					int chNum = sc.nextInt();
					tv.channelChange(chNum);
					System.out.println("현재 채널 : " + tv.channel);
				} else {
					System.out.println("전원을 켜주세요.");
				}
				break;
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.err.println(ie);
			}
		}
	}

}
