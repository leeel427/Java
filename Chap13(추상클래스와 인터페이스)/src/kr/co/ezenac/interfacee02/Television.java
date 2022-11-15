package kr.co.ezenac.interfacee02;

public class Television implements RemoteControl {
	
	private int volume;

	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	public void setVolume(int volume) {
		
		if (volume > RemoteControl.Max_VOLUMN) {
			System.out.println("TV 볼륨의 최대치 값은 10 입니다.");
			this.volume = RemoteControl.Max_VOLUMN;
		}
		else if (volume < RemoteControl.Min_VOLUMN) {
			System.out.println("TV 볼륨의 최소치 값은 0 입니다.");
			this.volume = RemoteControl.Min_VOLUMN;
		}
		else {
			this.volume = volume;
		}
		
		System.out.println("현재 TV 볼륨 : " + this.volume);
		
	}

}
