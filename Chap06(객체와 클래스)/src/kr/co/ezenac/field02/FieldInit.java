package kr.co.ezenac.field02;

public class FieldInit /* extends Object */ {
	
	byte byteField;				// 1 바이트
	short shortField;			// 2 바이트
	int intField;				// 4 바이트
	long longField;				// 8 바이트
	
	boolean booleanField;		// 1 바이트
	char charField;				// 2 바이트
	
	float floatField;			// 4 바이트
	double doubleField;			// 8 바이트

	//참조형 변수					참조형 변수는 4바이트
	int[] arrField;				// 4 바이트
	String strField;			// 4 바이트
	
	
	/*
	 *  클래스의 맴버변수(필드)의 값들을 수시로 확인하고자 할때나,
	 *  원하는 포맷으로 맴버변수들을 출력하고자 할때 많이 사용함.
	 */
	
	@Override
	public String toString() {
		
		String str = "byteField : " + byteField +
					 ", shortField : " + shortField +
					 ", intField : " + intField +
					 ", longField : " + longField +
					 ", booleanField : " + booleanField +
					 ", charField : " + charField +
					 ", floatField : " + floatField +
					 ", doubleField : " + doubleField +
					 ", arrField : " + arrField +
					 ", strField : " + strField;
		
		return str;
	}
	
	
}
