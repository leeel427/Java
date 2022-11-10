package kr.co.ezenac.array;

// 문자 배열을 만들어 A~Z까지 배열에 저장하고 이를 출력하시오


public class CharArrayTest {

	public static void main(String[] args) {
		char[] az = new char[26];
		char ch = 'A';
		
		for(int i=0;i<az.length;i++) {
			az[i] =ch++;
		}
//		for(char i=0,num=65; i<az.length; i++,num++) {
//			az[i] = num;
//		}
//		for(char i=0;i<az.length;i++) {
//			System.out.print(az[i]+ " ");
//
//		}
		for(int i=0;i<az.length;i++) {
			System.out.println(az[i] +", "+ (int)az[i]);
		}
		
		System.out.println();
		
		//향상된 for문 사용
		for (char alpha : az) {
			System.out.println(alpha + ", " +(int)alpha);
		}
		
		
		
	}

}
