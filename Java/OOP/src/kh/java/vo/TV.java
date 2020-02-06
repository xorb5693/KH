package kh.java.vo;

public class TV {
	
	//크기, 전원, 채널, 볼륨 변수
	//전원, 채널, 볼륨 기능
	public int inch = 120;
	public boolean power = false;
	public int channel = 1;
	public int volume = 0;
	
	public boolean power() {
		System.out.println("전원기능");
		power = !power;
		return power;
	}
	
	public void channelUp() {
		System.out.println("채널번호 증가");
		channel++;
	}
	
	public void channelDown() {
		System.out.println("채널번호 감소");
		channel--;
	}
	
	public void channelChange(int chNum) {
		System.out.println("채널번호 변경");
		channel = chNum;
	}
	
	public void volumeUp() {
		System.out.println("볼륨 증가");
		volume++;
	}
	
	public void volumeDown() {
		System.out.println("볼륨 감소");
		volume--;
	}
	
	public void getTVInfo() {
		
		System.out.println("이 TV는 " + inch + "인치 입니다.");

		if (power) {
			System.out.println("현재 TV는 켜져있습니다.");
		} else {
			System.out.println("현재 TV는 꺼져있습니다.");
		}
		
		System.out.println("현재 채널은 " + channel + "번 입니다.");
		System.out.println("현재 볼륨 크기는 " + volume + "입니다.");
	}
}
