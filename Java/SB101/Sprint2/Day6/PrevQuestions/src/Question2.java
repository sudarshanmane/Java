
public class Question2 {
	
	public static void main(String[] args) {
		
		Common common = new Common();
		
		ThrA a = new ThrA(common, "Suhas");
		
		ThrB b = new ThrB(common , "Ganesh");
		a.start();
		b.start();
			
	}
	
	

}


class Common {
	
	
	
	public    void fun1(String name) {
		
		
		ThrA out = new ThrA( );
		System.out.println("Welcome");
		
		System.out.println("Thr1 Entrered");
		System.out.println("Thr2 Entrered");
		
		synchronized (ThrA.class) {
			
		try {
			
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name);
		
		}
		
		
	}
	
	
}



class ThrA  extends Thread{
	
	Common common;
	String name;
	
	public ThrA(Common c,String name) {

		this.common = c;
		this.name = name;
		
	}
	
	public ThrA() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		common.fun1(name);
	}
	
}



class ThrB  extends Thread{
	Common common;
	String name;
	
	public ThrB(Common c,String name) {
		
		this.common = c;
		this.name = name;
		
	}
	
	@Override
	public void run() {
		common.fun1(name);
	}
	
	
}