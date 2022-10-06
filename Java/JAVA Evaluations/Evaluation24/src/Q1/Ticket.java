package Q1;

public class Ticket {
	
	int ticketid;
	int price;
	static int availableTickets;
	
	
	
	public Ticket(int ticketid, int price) {
		super();
		this.ticketid = ticketid;
		this.price = price;
	}



	public int calculateTicketCost(int nooftickets) {
		
		int total = nooftickets*price;
		
		if(availableTickets - nooftickets >=0) {
			availableTickets = availableTickets - nooftickets;
			return total;
			
		}
		else 
			return -1;
		
		
	}
	
	
	
	

}
