package kr.co.ezenac.object;

/*
 *  날짜를 구현한 클래스 MyDate가 있습니다.
 *  날짜가 같으면 equals() 메서드 결과가 true가 되도록 구현하시오.
 *  
 *  hashCode() 메서드도 구현해 보시오
 * 
 */

class MyDate {
	private int day;
	private int month;
	private int year;

	
	public MyDate(int day, int month, int year) {
	//	super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {		// Object 로 업캐스팅 된것
		if (obj instanceof MyDate) {		// 내 타입으로 다운 캐스팅
			MyDate date = (MyDate)obj;
			
//			if(this.day == date.day && this.month == date.month && this.year == date.year)
//				return true;
//			return false;											//선생님 기록
			
			if (this.day != date.day) { 
				System.out.println("일이 다릅니다.");
				return false;
			}
			else if(this.month != date.month) {
				System.out.println("월이 다릅니다.");
				return false;
			}
			else if(this.year == date.year) {
				System.out.println("같은 날짜 입니다.");
				return true;
			}
			else 
				System.out.println("년이 다릅니다.");
				return false;
		}
		return false;
		
	}
		
	@Override
	public int hashCode() {
//		return day*10 + month*101 + year* 1001;					//선생님 기록
		return day + month*100 + year*10000;
		}


}

public class MyDateTest {
	
	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(5, 9, 2022);
		MyDate date2 = new MyDate(5, 9, 2022);
		
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}
		

}
