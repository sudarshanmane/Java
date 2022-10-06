package CreatngThread;

import java.text.Normalizer;

public class ThreadStateLifeCycle {

	public static void main(String[] args) {
		
		Thread thread = new Thread(() -> {
			System.out.println("thread Running");
			Thread.currentThread().setName("thread");
			System.out.println(Thread.currentThread().getName());
			
			Thread.currentThread().setPriority(Thread.NORM_PRIORITY); 
			System.out.println("Thread1 Priority " +Thread.currentThread().getPriority());

			System.out.println("sleeping");

			
			try {
				Thread.sleep(3000);
				System.out.println("woke");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
//		thread.start();
		
		
		Thread thread1 = new Thread(() ->
		{
			System.out.println("Thread1 running");			
			
			Thread.currentThread().setName("thread1");
			System.out.println(Thread.currentThread().getName());
			
			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
			System.out.println(Thread.currentThread().getPriority());
		
			try {
				Thread.sleep(2000);
				System.out.println("thread1 Woke up");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
//		thread1.start();
		
		
 	}
	
}


