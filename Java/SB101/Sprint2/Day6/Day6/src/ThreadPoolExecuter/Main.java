package ThreadPoolExecuter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	
	public static void main(String[] args) {
		
		PrintJob[] jobs = {
			new PrintJob("marks"),
			new PrintJob("Syllabus"),
			new PrintJob("Placed data"),
			new PrintJob("Mac"),
			new PrintJob("Admissions")
				
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		
		
		for(PrintJob job : jobs) {
			executorService.submit(job);
		}
		
		executorService.shutdown();
		
		
		
		
		
	}
}



class PrintJob implements Runnable {
	String name ;

	public PrintJob(String name) {
		this.name =name;
	} 
	
	@Override
	public void run() {
		
		
		try {
			Thread.sleep(5000);
			System.out.println("One");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(name + " Job is comleted by thread " + Thread.currentThread().getName());

		
		
		
	}
	
}
