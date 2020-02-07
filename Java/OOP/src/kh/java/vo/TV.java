package kh.java.vo;

public class TV {
	
	//크기, 전원, 채널, 볼륨 변수
	//전원, 채널, 볼륨 기능
	private int inch;
	private boolean power;
	private int channel;
	private int volume;
	
	//생성자의 오버로딩
	public TV() {
		//기본 생성자
	}
	
	public TV(int inch, boolean power, int channel, int volume) {
		//매개변수 생성자
		this.inch = inch;
		this.power = power;
		this.channel = channel;
		this.volume = volume;
	}
	
	public boolean power() {
		System.out.println("전원기능");
		power = !power;
		return power;
	}
	
	public boolean getPower() {
		return power;
	}
	
	public int getInch() {
		return inch;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
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
