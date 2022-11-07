package kr.co.ezenac.overloading;

public class AdderTest {

	public static void main(String[] args) {
		Adder adder = new Adder();
		int iResult = adder.add(10, 50);
		System.out.println("iResult : " + iResult);
		
		long lResurt = adder.add(100, 7500L);
		System.out.println("lResult : " + lResurt);
		
		double dResurt = adder.add(107.88, 11.55);
		System.out.println("dResurt : "+ dResurt);
	}
	
	
}
