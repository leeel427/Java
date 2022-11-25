package kr.ac.ezenac.thread02;

class sumThread extends Thread {
	
	@Override
	public void run() {
		int sum = 0;
				
		Thread thread = Thread.currentThread();
		System.out.println(thread + " start");
		for (int i=0; i<= 50; i++) {
			sum += i;
			System.out.println(thread.getPriority() + " end");
		}
		
	}
	
}


public class ThreadSumTest {

	public static void main(String[] args) {
		
		int i;
		int j;
		
		for (i=1; i<=50; i++) {
			PriorityThread pt = new PriorityThread();
			pt.setPriority(i);
			pt.start();
		}
		for (j=51; j<=50; j++) {
			PriorityThread pt = new PriorityThread();
			pt.setPriority(j);
			pt.start();
		}
		int sum= i+ j;
		
		System.out.println(sum);
		

	}

}
