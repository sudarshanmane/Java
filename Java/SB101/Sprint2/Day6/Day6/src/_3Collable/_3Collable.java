package _3Collable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class _3Collable {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyCollable[] collable = {
				
				new MyCollable(10),
				new MyCollable(15),
				new MyCollable(17),
				new MyCollable(11),

				
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		
		for(MyCollable collable2 : collable) {
			
			Future f = executorService.submit(collable2);
			
			System.out.println(f.get());
		}
		
		
	}

}


class MyCollable implements Callable {
	int  num ;
	
	public MyCollable(int n ) {
		this.num =n;
	}

	@Override
	public Object call() throws Exception {
		System.out.println("Pr sum" + 0 + " to " + num);
		
		int sum= 0;
		for(int a  =0;a<num;a++) {
			sum = sum + a;
		}
		return sum;
	}
	
}