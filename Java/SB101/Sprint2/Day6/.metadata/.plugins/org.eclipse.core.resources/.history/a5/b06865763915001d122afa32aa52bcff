package Queation1;

public class Main {
	
	public static void main(String[] args) {
		
		Common c= new Common();
		
		ThreadA  a = new ThreadA(c,"Pawan"); 
		ThreadA  b = new ThreadA(c,"Ganesh"); 
		ThreadA  e = new ThreadA(c,"Ramesh"); 
		b.start();
		e.start();
		a.start();
		
		ThreadB  y = new ThreadB(c,"Mahesh"); 
		ThreadB  x = new ThreadB(c,"Ganu"); 
		x.start();
		y.start();
		
		
	}

}

class Common {
	
	static int threadNumber = 1;
	
	public void fun1(String name) throws InterruptedException {
		
		System.out.println("Entered Thread" + name );
		threadNumber++;
		
		synchronized (Common.class) {
			Thread.sleep(3000);
		}
		
		System.out.println("Out of the Synchronisation" + name);
		
	}
}


class ThreadA extends Thread {
	String name;
	Common common;
	
	public ThreadA(Common c ,String name){
		this.name = name;
		this.common= c;
		
	};
	
	@Override
	public void run() {
		
		try {
			common.fun1(name);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	}
	
	
	
}



class ThreadB extends Thread {
	String name;
	Common common;
	
	public ThreadB(Common c ,String name){
		this.name = name;
		this.common= c;
		
	};
	
	@Override
	public void run() {
		
		try {
			common.fun1(name);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	}
	
	
	
}



