package kr.co.ezenac.lambda05;

import java.util.function.BiFunction;

public class TestStringConcatLambda {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Ezen!";
	
		BiFunction<String, String, String> addstr = (x, y) -> x + ", " + y;
		String result = addstr.apply(s1, s2);
		
		System.out.println(result);	
															// 내가 한거
		System.out.println();						
		
		StringConcat concat2 = (s, v) -> System.out.println(s + ", "+ v); 
		concat2.makeString(s1, s2);
															// 강사님 1
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
			
		};
													// 강사님 2
			System.out.println();
			concat3.makeString(s1, s2);
			
		
	}
	
}
