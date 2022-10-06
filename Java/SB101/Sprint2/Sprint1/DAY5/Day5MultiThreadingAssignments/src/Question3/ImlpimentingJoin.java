package Question3;

public class ImlpimentingJoin {
	
	public static void main(String[] args) {
		
		Thread EvenThread = new Thread(new Even());
		Thread OddThread = new Thread(new Odd());
		
		EvenThread.start();
		
		try {
			EvenThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		OddThread.start();
	}
	
	
	
	

	
	

}

class Even implements Runnable {

	@Override
	public void run() {
		
		for(int a = 1;a<=20;a++) {
			if(a%2==0)
			System.out.println(a);
		}
		
	}
	
}



class Odd implements Runnable {

	@Override
	public void run() {
		
		for(int a = 1;a<=20;a++) {
			if(a%2==1)
			System.out.println(a);
		}
		
	}
	
}
