package Question2;

public class Question1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadA a = new  ThreadA();

		Thread thread = new Thread(a);
		thread.start();
		
		synchronized  (thread) {
			thread.wait();
		}

		
		System.out.println(a.prouct);
	}
	

}

class ThreadA implements Runnable {
   
	int prouct = 1;

		
		@Override
		public void run() {
			
			synchronized (this) {
				for(int a = 1 ; a<=10 ;a++) {
					prouct = prouct*a;
				}				
				this.notify();
			}
	}
	
	
}
