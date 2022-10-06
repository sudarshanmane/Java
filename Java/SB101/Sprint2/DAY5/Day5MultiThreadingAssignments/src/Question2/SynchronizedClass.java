package Question2;

public class SynchronizedClass {
	
	public static void main(String[] args) {
		
		ThreadA a = new ThreadA("Ram");
		ThreadB b = new ThreadB("Ram");
		a.start();
		b.start();
	}
	


}




class Shared {
	
	public static synchronized void fun(String name) {
		
		System.out.println("welcome");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name);
		
	}
	
	
		
	
	
}

class ThreadA extends Thread{
	
	String name;
	
	public ThreadA(String name) {
		
		this.name =name;
		
	}
	
	
	
	@Override
	public void run() {
		
		Shared.fun(name);
		
	}
	
}


class ThreadB extends Thread{
	
	String name;
	
	public ThreadB(String name) {
		
		this.name =name;
		
	}
	
	
	
	@Override
	public void run() {
		Shared.fun(name);
		
	}
	
}

