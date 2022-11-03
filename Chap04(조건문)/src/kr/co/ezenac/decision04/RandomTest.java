package kr.co.ezenac.decision04;

import java.util.Arrays;

public class RandomTest {

	public static void main(String[] args) {
		
		//Math.random() 값은 0.0000000 ~ 0.999999999 사이의 임의의 값을 발생시킴
		System.out.println(Math.random());
		
		// 주사위 숫자
	    int num = (int)(Math.random()*6);			//0~5
	    num = (int)(Math.random()*6) + 1;				// 1~6
	    System.out.println(num);
	    
	    // 로또 번호 뽑기
	    int num2 = (int)(Math.random()*45) + 1; 
	    System.out.println(num2);

	    if(num == 1) {
	    	System.out.println("1이 나왔네요");
	    }
	    else if(num == 2) {
	    	System.out.println("2가 나왔네요");
	    }
	    else if(num == 3) {
	    	System.out.println("3이 나왔네요");
	    }
	    else if(num == 4) {
	    	System.out.println("4가 나왔네요");
	    }
	    else if(num == 5) {
	    	System.out.println("5가 나왔네요");
	    }
	    else {
	    	System.out.println("6이 나왔네요");
	    }
	    
	    // if 문을 switch 문으로 바꿔보세요
	    
	    switch(num) {
		case 1:	
			System.out.println("1이 나왔네요");
			break;
		case 2:
			System.out.println("2가 나왔네요");
			break;
		case 3:	
			System.out.println("3이 나왔네요");
			break;
		case 4:
			System.out.println("4가 나왔네요");
			break;
		case 5:
			System.out.println("5가 나왔네요");
			break;
		case 6:
			System.out.println("6이 나왔네요");
			break;
		default:
			System.out.println("");
	}
	  
	    
	    // 로또 번호 중복은 어찌?
		int[] arr1 = new int[6];
		
		for (int i=0; i<arr1.length; i++) {
			// 범위가 1~45 까지의 난수를 대입
			arr1[i] = (int)(Math.random()*45) + 1;
		}
		
		for (int i=0; i<arr1.length; i++) {
			if(i !=5) {
				System.out.print(arr1[i] +", ");
			}
			else {
				System.out.println(arr1[i]);
			}
		}
		Arrays.sort(arr1);
		for (int n : arr1)
			System.out.print(n + "\t");
	    
	    
	    
	    
	    
	}

}
