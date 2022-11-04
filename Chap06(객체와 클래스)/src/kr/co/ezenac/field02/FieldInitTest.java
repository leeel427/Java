package kr.co.ezenac.field02;

public class FieldInitTest {

	public static void main(String[] args) {
		
		/*
		 * new 연산자 
		 * 	- 클래스에 있는 맴버들의 바이트 크기만큼
		 * 	  heap(메모리)에다가 메모리 할당을 하며 동시에 초기화를 시켜주는 역할을 함.
		 */
		FieldInit fieldInit = new FieldInit();
		
		System.out.println(fieldInit.byteField);
		System.out.println(fieldInit.shortField);
		System.out.println(fieldInit.intField);
		System.out.println(fieldInit.longField);
		System.out.println(fieldInit.booleanField);
		System.out.println(fieldInit.charField);
		System.out.println(fieldInit.floatField);
		System.out.println(fieldInit.doubleField);
		
		System.out.println("==================");
		
		System.out.println(fieldInit);
		
	}

}
