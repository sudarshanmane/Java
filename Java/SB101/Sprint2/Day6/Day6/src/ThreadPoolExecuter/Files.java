package ThreadPoolExecuter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Files {
	
	public static void main(String[] args) {
		ThreadPool[] one = {
				new ThreadPool("One"),
				new ThreadPool("Two"),
				new ThreadPool("Three"),
				new ThreadPool("four"),
				new ThreadPool("five"),
				new ThreadPool("six"),
		};
		
		
		ExecutorService  executorService  = Executors.newFixedThreadPool(2) ;
		
		for(ThreadPool pool : one) {
			executorService.submit(pool);
		}
		
		executorService.shutdown();


	}
}


class ThreadPool extends Thread {
	
	String name;
	
	public ThreadPool(String name) {
		this.name = name;
	}

	
	@Override
	public void run() {
		System.out.println("Inside the run Function " + name);

		synchronized (this) {
			
]			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Outside o the Trun Function "+ name );
		
		
		
		
	}
	
}
