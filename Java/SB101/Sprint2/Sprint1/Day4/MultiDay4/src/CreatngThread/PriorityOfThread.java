package CreatngThread;

public class PriorityOfThread {

	public static void main(String[] args) {
Thread thread2 = new Thread(() ->{
			
			Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
			Thread.currentThread().setName("thread2");
			
			for(int a = 0;a<10;a++) {
				System.out.println("SecondThread Running");
			}
			
		}); 
		
		
		 Thread thread3 = new Thread(() ->{
				
				Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
				Thread.currentThread().setName("thread2");
				
				for(int a = 0;a<10;a++) {
					System.out.println("Third Thread Running");
				}			}); 
		 
		 thread2.start();
		 thread3.start();
	}
}
