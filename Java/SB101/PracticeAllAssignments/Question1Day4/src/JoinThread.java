
public class JoinThread {
	
	public static void main(String[] args) throws InterruptedException {
		Sum sumObj = new Sum();
		
		Thread thread = new Thread(sumObj);
		thread.start();
		thread.join();
		
		System.out.println(sumObj.sum);
	}

}


class Sum implements Runnable{

	int sum = 0;
	@Override
	public void run() {
		
		for(int a = 1;a<=10;a++) {
			sum = sum + a;
		}
		
	}
	
}
