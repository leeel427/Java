package kr.co.ezenac.interfacee07;

public class MyBookshelfTest {

	public static void main(String[] args) {
		Queue bQueue = new MyBookshelf();
		bQueue.enQueue("베포 자동차와 지속적 인도");
		bQueue.enQueue("소프트웨어 아키텍처 이론과 실제");
		bQueue.enQueue("CERT C 프로그래밍");
		
		
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
	}

}
