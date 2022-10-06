import java.util.Scanner;

public class IPL {

	void homeTeamStadium(Stadium stadium){
		
	
		if(stadium == Stadium.EDEN_GARDENS_STADIUM){
			System.out.println("EDEN_GARDENS_STADIUM then print “This is the home ground of KKR");
		}else if(stadium == Stadium.WANKHEDE_STADIUM){
			System.out.println("This is the home ground of Mumbai Indians");
		}else if(stadium == Stadium.CHIDAMBARAM_STADIUM){
			System.out.println(""
					+ "This is the home ground of CSK");
		}else if(stadium == Stadium.M_CHINNASWAMY_STADIUM){
			System.out.println("This is the home ground of RCB");
		}
	}
	
	public static void main(String[] args) {
		
		IPL ipl = new IPL();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Stadium name");
		String givenInput = input.next().toUpperCase();
		
		if(givenInput.equals("EDEN_GARDENS_STADIUM") || givenInput.equals("WANKHEDE_STADIUM")
				||givenInput.equals("CHIDAMBARAM_STADIUM")|| givenInput.equals("M_CHINNASWAMY_STADIUM") ) {
			
			Stadium stadium = Stadium.valueOf(givenInput);
			ipl.homeTeamStadium(stadium);
			
		}
		else {
			System.out.println("Enter valid Stadium name");	
		}
	}
}
