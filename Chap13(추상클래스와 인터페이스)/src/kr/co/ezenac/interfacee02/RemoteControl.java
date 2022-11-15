package kr.co.ezenac.interfacee02;

public interface RemoteControl {
	
	//상수 (static final)
	int Max_VOLUMN = 10;
	int Min_VOLUMN = 0;
	
	//추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	

	
}
