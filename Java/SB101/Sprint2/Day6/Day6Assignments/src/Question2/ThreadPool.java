package Question2;

public class ThreadPool {
	
    public static void main(String[] args) {
    	
    	ThreadA th  = new ThreadA(new Common() ,"Pawan");
    	th.start();
    	
    	ThreadA th1  = new ThreadA(new Common() ,"Mangesh");
    	th1.start();
		
		
    	
	}

}

class Common {
	
	String name;

	
	
	public  synchronized  void fun1(String name) throws InterruptedException {
		Thread.sleep(3000);
		this.name = name;
		System.out.println(name);
		
	}
	
	
}


class ThreadA extends Thread{
	
	Common common;
	String name;

	public ThreadA(Common common , String name) {
		this.common =  common;
		this.name =name;
	}
	

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