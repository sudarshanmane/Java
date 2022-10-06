package CreatngThread;

public class CThread {
	
	public static void main(String[] args) {
		
		MyThreadFirstWay firstWay = new MyThreadFirstWay();	
		firstWay.start();
		
		
//		2nd runnable
		Thread mySecondThread = new Thread(new myRunnable());
		mySecondThread.start();
		
//		3d lambda
		
		Thread lambdaWay = new Thread(() -> System.out.println("lambda way to create the thread"));
		lambdaWay.start();
		
		
//		4nd way
		
		
		
	}

	
	
}

//1st Way
//extending threadClass


class MyThreadFirstWay extends Thread{
	
	@Override
	public void run() {
		System.out.println("MyThreadFirstWay");
	}
	
	
}
//	2nd way
	
	class myRunnable implements Runnable{

	@Override
	public void run() {
		
		System.out.println("second way implimenting runnable");
	}
		
		
	
	
}