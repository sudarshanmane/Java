
public class Print1tpo10 {
	
	public static void main(String[] args) {
//
//		Thread thread = new Thread(new  Runnable1());
//		thread.start();
//		
		Thread thread2 = new Thread(() ->
		{
			for(int a = 1;a<=5;a++) {
				System.out.println(a);
			}
			
			Thread.currentThread().setName("one");
			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			for(int a = 6;a<=10;a++) {
				System.out.println(a);
			}
		});
		
		thread2.start();
	
	}

}

class Runnable1 implements  Runnable {

	@Override
	public void run() {
		
	    for(int a = 1; a<=5;a++) {
	    	System.out.println(a);
	    }
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    for(int a = 6;a<=10;a++){
	    	System.out.println(a);
	    }
		
	}
	
	
}
