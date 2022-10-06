package Question3;

public class SleepingThread {

	public static void main(String[] args) {
		
		Thread thread = new Thread(() -> {
			
			for(int  a = 1;a<=5;a++) {
				System.out.println(a);
			}
			
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			for(int a  = 6;a<=10;a++) {
				System.out.println(a);
			}
			
		});
		
		thread.start();
		

	}

}
