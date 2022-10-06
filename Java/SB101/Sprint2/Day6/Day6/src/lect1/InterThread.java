package lect1;

public class InterThread {
	
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();
		
		synchronized (mt) {
			
			try {
				mt.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println(mt.total);
		
		 
		
	}

}


class MyThread extends Thread{
	
	
	int total = 0;
	@Override
	public void run() {
		
	synchronized (this) { 
		
			for(int a = 0;a<10;a++) {
			total = total + a;
			}
			
			this.notify();
	}
}
}