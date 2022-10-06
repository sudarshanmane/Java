import java.util.Scanner;

public class UserRegistration {
	
	
	public void registerUser(String username,String userCountry) throws InvalidCountryException{
		
		if(userCountry.equals("India")){
			
			System.out.println("User registration done successfully");
			
		}else {
			
			InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
			
		}
		
	}

	public static void main(String[] args) {

		UserRegistration ur = new UserRegistration();
		Scanner input = new Scanner(System.in);


		try {
		
			
			System.out.println("Enter userName");
			String useName = input.nextLine();

			System.out.println("Enter userCountry");
			String userCountry = input.nextLine();
			
			ur.registerUser(useName,userCountry);	
			
		}catch(InvalidCountryException ice) {
			
			System.out.println(ice.getMessage());

		}
		
		
		
		
		
		

	}

}
