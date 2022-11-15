package kr.co.ezenac.interfacee04;

public interface Myinterface {
	
	int MAX_NUM = 100;
	public void method();
	
	default void dMethod() {
		System.out.println("디폴트 메소드 호출");
	}
	
	static void sMethod() {
		System.out.println("정적 메소드 호출");
	}
	
	private void pMethod() {
		System.out.println("private 메서드 호출");
	}
	
	private static void psMethod() {
		System.out.println("private static 메소드 호출");
	}
	
	


}
