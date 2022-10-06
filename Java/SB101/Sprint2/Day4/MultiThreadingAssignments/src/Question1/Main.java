package Question1;

public class Main {
	public static void main(String[] args) {
		Sum sumObj = new  Sum();
		
		Thread thread = new Thread(sumObj);
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(sumObj.sum);
		
		
		
		
		
	}

}

class Sum implements Runnable{
	
	int sum  ;
	@Override
	public void run() {
		
		for(int a = 1 ;a<=10 ; a++) {
			sum = sum + a;
		}

		
	}
	
}
