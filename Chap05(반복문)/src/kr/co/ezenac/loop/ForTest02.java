package kr.co.ezenac.loop;

// 누적 합계가 2000이상 일때 i 값을 출력하시오

public class ForTest02 {

	public static void main(String[] args) {
		
		int sum = 0;
		int temp = 0;	//
		 
		for(int i=1; i<=100; i++) {
			
	//		int temp = 0;	//
			
			sum += i;
	//		temp = i;	//
			
			if (sum >= 2000) {
				temp = i;	//
	//			System.out.println("sum 2000 이상일때 i : " + temp);	//
				break;					//감싸고 있는 제어문의 블록을 빠져나오는 기능.
			} 
			System.out.println("sum : " + sum);
		}
		System.out.println("sum 2000 이상일때 i : " + temp);		//
		System.out.println("sum 2000 이상일때 sum : " + sum);

	}

}
