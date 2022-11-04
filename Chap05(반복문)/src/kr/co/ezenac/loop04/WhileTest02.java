package kr.co.ezenac.loop04;

public class WhileTest02 {

	public static void main(String[] args) {
		// 1~ 100 사이의 5와 7의 배수를 출력하고 해당 개수도 출력하시오. 
		// (5와 7의 공배수)
		
		int i = 0;
		int count = 0;
		
		while ((i++ ) <= 100) {
			
//			if (((i % 5) != 0) || ((i % 7) != 0)) 
//				continue;		// 5와 7의 배수가 아니면 위로 이동

			if ((i % 5) != 0)	continue;
			if ((i % 7) != 0)	continue;
			
			count++;			// 5와 7의 배수이면 실행
			System.out.println(i);
		}
		System.out.println("count : " + count);

	}

}
