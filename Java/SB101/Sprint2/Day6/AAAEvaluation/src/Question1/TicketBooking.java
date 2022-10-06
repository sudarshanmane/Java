package Question1;

public class TicketBooking extends Thread {
	
	 TicketCounter ticketCounter;
	 String passengerName ;
	  int noOfSeatsToBook ;
	  
	  public TicketBooking(TicketCounter object , String name , int noOfSeatsToBook){
		  this.ticketCounter = object;
		  this.passengerName = name;
		  this.noOfSeatsToBook = noOfSeatsToBook;
		
	}
	  
	  @Override
	public void run() {
		  
		  try {
			ticketCounter.bookSeat(passengerName, noOfSeatsToBook);
		} catch (NoSeatAvailableException e) {
			e.printStackTrace();
		}
		  
		
	}
	  
	  

}
