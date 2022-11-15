package kr.co.ezenac.interfacee02;

public class Audio implements RemoteControl{
	
	private int volume;
	
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}

	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}

	public void setVolume(int volume) {
		
		//볼륨이 0~10사이에서 움직일 것으로 프로그래밍함
		if (volume > RemoteControl.Max_VOLUMN) {
			System.out.println("Audio 볼륨의 최대치 값은 10 입니다.");
			this.volume = RemoteControl.Max_VOLUMN;
		}
		else if (volume < RemoteControl.Min_VOLUMN) {
			System.out.println("Audio 볼륨의 최소치 값은 0 입니다.");
			this.volume = RemoteControl.Min_VOLUMN;
		}
		else {
			this.volume = volume;
		}
		
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}

}
