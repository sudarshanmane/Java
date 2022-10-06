
public class Ticket  {

    int ticketId;
    int price;
    static int availableTickets  ;


    public int calculateTicketCost(int nooftickets){
// check Availability;
        int totalAmomut= -1;
  if(availableTickets - nooftickets>0){
      availableTickets = availableTickets - nooftickets;

      totalAmomut = price *nooftickets;
  }

        return totalAmomut;

    }



}
