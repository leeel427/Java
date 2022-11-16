package kr.co.ezenac.string;

public class StringTest {
	
	public static void main(String[] args) {
		String str1 = new String("ezen");
		String str2 = new String("ezen");
		
		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str2));
		
		String str3 = "ezen!";
		String str4 = "ezen!";
		
		System.out.println(str3 == str4);
													// 힙 메모리에 저장되어 문자열이 같은 주소 값을 가짐.
	}

}
