import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		
		
		
		try {
			
			System.out.println("Enter an integer");
			String number = input.next();
			
			int num = Integer.parseInt(number);
			
			System.out.println("The square value is : " + num*num);
			System.out.println("The work has been done successfully");


		}catch (Exception e) {		
			
			System.out.println("Entered input is not a valid format for an integer");
		}
		
		

	}

}
