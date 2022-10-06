package Question1;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		TicketCounter object = new TicketCounter();
		
		TicketBooking thread1 = new TicketBooking(object,"Pawan",2);
		TicketBooking thread2 = new TicketBooking(object,"Gansh",5);
     	TicketBooking thread3 = new TicketBooking(object,"Ramesh",4);
     	
		thread1.start();
		thread1.join();

		thread2.start();
		thread2.join();
		
		thread3.start();
		
	}

}
