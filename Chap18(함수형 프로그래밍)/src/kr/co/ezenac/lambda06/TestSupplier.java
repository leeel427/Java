
package kr.co.ezenac.lambda06;

import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		
		Supplier<String> mySupplier = () -> "Hello EzenIt!";   
		System.out.println(mySupplier.get());
		
		System.out.println();
		
		Supplier<Double> dSupplier = () -> Math.random();
		System.out.println(dSupplier.get());
		
		System.out.println();	
		
		printRandomDoubles(dSupplier, 7);
		
		
	}
	
	public static void printRandomDoubles(Supplier<Double> supplier, int count) {
		for (int i=0; i<count; i++)
			System.out.println(supplier.get());
	}

}
