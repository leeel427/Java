package kr.co.ezenac.interfacee04;

public class MyClassTest {

	public static void main(String[] args) {
		Myinterface myInterface = new MyClass();
		
		myInterface.dMethod();
		myInterface.method();

		Myinterface.sMethod();
	}

}
