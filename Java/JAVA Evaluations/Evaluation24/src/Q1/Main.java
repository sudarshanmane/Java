package Q1;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of bookings");
		int n = sc.nextInt();
		
		
		System.out.println("Enter the available tickets");
		int av = sc.nextInt();
		
		
		
		Ticket.availableTickets =  av;
		
		
		for(int a = 0;a<n;a++) {
			
			System.out.println("Enter the ticketid");
			int id = sc.nextInt();
			
			System.out.println("Enter the price");
			int price = sc.nextInt();
			
			System.out.println("no of tickets");
			int num = sc.nextInt();
			
			Ticket ticket = new Ticket( id , price);
           
			System.out.println(ticket.calculateTicketCost(num));
			
			System.out.println("Available ticket after booking " + Ticket.availableTickets);
						
		}
		
		
		
		
		
	}

}
