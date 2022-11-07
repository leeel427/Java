package kr.co.ezenac.member02;

public class Time {

	private int hour;
	private int minute; 
	private int second;
	
	// getter() 값을 읽는다
	public int getHour() {
		return this.hour;
	}
	// setter()  
	public void setHour(int hour) {
		//예외 처리 코드를 작성해준다
		if (hour < 0 || hour > 23) {
			System.out.println("시간을 잘못 입력하셨습니다.");
			return;
		} 
		this.hour = hour;
	}
	
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			System.out.println("분을 잘못 입력하셨습니다.");
			return;
		} 
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			System.out.println("초를 잘못 입력하셨습니다.");
			return;
		} 
		this.second = second;
	}
	@Override
	public String toString() {
	
		return this.getHour() + "시 "
				 			+ this.getMinute() + "분 "
							+ this.getSecond() + "초 입니다.";
	}
}
