package Question1;

public class Mian {
	
//	Explanation
//	race condition is the condition when two threads try to run at a time then that
//	condition is called as race condition.
//	
//	as shown in the below example the two threads will try to run at the same time 
//	and it will result in a wrong output. ie data inconsistency
//	but with the help of synchronized way we can overcome this race condition.
//	
//	when a thread enters inside a synchronized method then another thread cannot enter
//	the same thread. another thread can only enter in that thread after completing the
//	job of previous thread. 
//	
//	so with the help of synchronized way  we can overcome this data inconsistency 
//	problem . 
//	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Common   common = new Common();
		
		CThread cThread = new CThread(common, "one");
		CThread cThread1 = new CThread(common, "Two");
		
		
		cThread.start();
		
		
		
		cThread1.start();


		
		
	}
	


}


class Common {
	
	public synchronized void fun1(String name) {
		System.out.println("Welcome ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name);
	}
	
	
}


class CThread extends Thread{
	Common c ;
	String name;
	
	
	public CThread(Common c, String name) {
		this.c = c;
		this.name = name;
	}
	

	
	
	
	@Override 
	public void run() {
		c.fun1(name);
	}
	
	
}



class CThread1 extends Thread{
	Common c ;
	String name;
	
	public CThread1(Common c, String name) {
		this.c = c;
		this.name = name;
	}

	
	@Override 
	public void run() {
		c.fun1(name);
	}
	
	
}

