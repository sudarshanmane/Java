package MainThread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		Sum sum = new Sum();
		Thread thread = new Thread(sum);
		thread.start();
		thread.join();
		
		System.out.println(sum.sum);
	}

}

class Sum implements Runnable{
	int sum ;
	@Override
	public void run() {
		for(int a=1;a<=10;a++) {
			sum = sum + a;
		}
		
	}
	
}
