package Questi;

public class Question3 {
	
	public static void main(String[] args) {
		
		Thread1  a = new Thread1(new  Common(), "One");
		Thread2  b = new Thread2(new Common (), "Two");
		a.start();
		try {
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.start();
	
		
	}

}


class Common {
	
	public static void fun1(String name) {
		System.out.println("Inside syn " + name);


			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("out of syn" + name);
		
		
	}
}

class Thread1 extends Thread{
	String name;
	Common c;
	
	public Thread1(Common c, String name) {
		this.name = name;
		this.c = c;
	}
	
	
	@Override
	public void run() {
		
		Common.fun1(this.name);
	}	
	
}


class Thread2 extends Thread{
	
	String name ;
	Common c;
	
	public Thread2(Common common,String s) {
		this.c = common;
		this.name = s;
		
	}
	
	@Override
	public void run() {
		Common.fun1(this.name);
	}
	
	
}