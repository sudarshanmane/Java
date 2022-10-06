package Question1;

public class TicketCounter {
	
	 int availableSeats = 10;
	
	void bookSeat(String name, int numberOfSeats) throws NoSeatAvailableException {
		
		if(availableSeats - numberOfSeats >=0) {
			availableSeats = availableSeats - numberOfSeats;
			System.out.println("No of seats booked are : " + numberOfSeats);
			
			
		}else {
			
			NoSeatAvailableException n =  new NoSeatAvailableException("Seats are not available");
             throw n;	
		}
		
	}
		

}
