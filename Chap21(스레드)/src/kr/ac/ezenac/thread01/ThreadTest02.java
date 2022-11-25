package kr.ac.ezenac.thread01;

class Mythread2 implements Runnable {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread() + "start!!");
		
		int i;
		for ( i = 0; i < 200; i++)
			System.out.print(i + "\t");
		
		System.out.println(Thread.currentThread() + "end!!");		
	}
}


public class ThreadTest02 {
	
		public static void main(String[] args) {
		
			
		System.out.println(Thread.currentThread() + "start");	
		
		Mythread2 runnable = new Mythread2();
		Thread thread1 = new Thread(runnable);
		thread1.start();
		
		Thread thread2 = new Thread(new Mythread2());
		thread2.start();
			
		
		Runnable anonymousThread = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("anonymous running");
				
			}
		};
		
		anonymousThread.run();
		
		
		System.out.println(Thread.currentThread() + "end");	
		
			
		}
		
	}


