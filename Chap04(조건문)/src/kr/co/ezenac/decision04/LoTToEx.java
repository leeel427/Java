package kr.co.ezenac.decision04;

import java.util.Arrays;

public class LoTToEx {

	public static void main(String[] args) {
		
		  
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
