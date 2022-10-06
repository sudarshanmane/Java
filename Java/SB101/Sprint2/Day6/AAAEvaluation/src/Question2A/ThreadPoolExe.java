package Question2A;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//    Explanation of Thread Pool Executor
//       Basically thread pool as name it self indicate that it is like a container of
//       the Threads. 
//       in this if we have few tasks to do and we want give the contract of this work 
//       to some industry. that is how we create a pool of the threads and submit it to 
//       an ExecutorService. it will have thread executers and then he will assign the 
//       different thread task to his workers/ thread Executers will complete the job;

public class ThreadPoolExe {
	
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
	



