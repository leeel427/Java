package kr.co.ezenac.lambda05;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Ezen!";
		
		StringConcat concat = new StringConcatImpl();
		concat.makeString(s1, s2);
		

	}

}
