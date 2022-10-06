import java.util.Scanner;

public class Main extends Ticket{


    public static void main(String[] args) {

        Ticket ticket = new Ticket();

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter no of bookings: ");
        input.nextLine();

        System.out.println("Enter the available tickets: ");
        availableTickets = input.nextInt();


        input.nextLine();
        System.out.println(" Enter the ticketid: ");
        ticket.ticketId = input.nextInt();
        input.nextLine();

        System.out.println("Enter the price : " );
        ticket.price = input.nextInt();

        input.nextLine();

        System.out.println("Enter  the no of tickets : ");
        int noofTicket = input.nextInt();

        System.out.println("Available tickets : " + availableTickets);
        System.out.println("Total Amount : " + ticket.calculateTicketCost(noofTicket));
        System.out.println("Available ticket after booking : " + availableTickets);



//        Available tickets: 25
//        Total amount:500
//        Available ticket after booking:20



    }
}
