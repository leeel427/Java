package kr.ac.ezenac.thread01;

/*
 *  여러 개의 스레드 동시 실행
 * 	 - 20 미만 짝수 출력
 *   - 10 미만 수 출력
 * 
 */
public class MultiThreadTest {

	public static void main(String[] args) {
		
//		Runnable task1 = () -> {
//			
//			System.out.print("task1 : ");
//			for(int i =1; i<20; i++) {
//				if (i %2 == 0) {
//					System.out.print(i + " ");
//				}
//			}
//			System.out.println();
//							
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		};
//		Thread thread1 = new Thread(task1);
//		thread1.start();
//		
//		Runnable task2 = () -> {
//			
//			System.out.print("task2 : ");
//			for (int j=1; j<10; j++)
//				System.out.print(j + " ");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		};
//		Thread thread2 = new Thread(task2);
//		thread2.start();
// 내가 한거
		
		Runnable task1 = () -> {
			for(int i =0; i<20; i=i+2) {			// 20미만 짝수 출력
				System.out.print(i + " ");
				try {
					Thread.sleep(1000);				// 1000밀리세컨드(1초) 쉼
				} catch (InterruptedException e) {/* e.printStackTrace(); */}
			}
		};
		
		Runnable task2 = () -> {
			for(int j =9; j>0; j--) {				// 10미만 수 출력
				System.out.print("(" + j + ") ");
				try {
					Thread.sleep(500);				// 500밀리세컨드(0.5초) 쉼
				} catch (InterruptedException e) {/* e.printStackTrace(); */}
			}
		};
		Thread thread1 = new Thread(task1);
		thread1.start();
		Thread thread2 = new Thread(task2);
		thread2.start();
		
	}

}
