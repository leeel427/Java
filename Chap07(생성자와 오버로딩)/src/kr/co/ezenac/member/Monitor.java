package kr.co.ezenac.member;

public class Monitor {

	//맴버 변수 (필드 field)
	String color;				// 모니터의 색상
	int channel;				// 채널
	int volume;					// 볼륨
	boolean power;				// 전원(on/off)
	
	// 맴버 메서드 
	// Monitor를 켜거나 끄는 기능
	public void power() {
		if (!power) {
			System.out.println("모니터가 켜졌습니다.");
			this.power = !power;
		}
		else {
			System.out.println("모니터가 꺼졌습니다.");
			this.power = !power;
		}
	}
			
	public void channelUp() {
		this.channel++;
		System.out.println("현재 채널 : " + this.channel);
	}
	public void channelDown() {
//		this.channel--;
		System.out.println("현재 채널 : " + (--this.channel));
	}
		

}
