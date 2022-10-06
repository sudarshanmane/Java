import java.util.Scanner;

public class Demo {
	
	public boolean validate(String name, String mobileNum, String aadharCard) {
		  
		   boolean nameC  = name.matches("[a-zA-Z]{3,8}");
		    
		   boolean aadharCardC = aadharCard.matches("[0-9]{12}");
			
		   boolean mobileNumC = mobileNum.matches("[6789]{1}[0-9]{9}");
		   
		   boolean result = nameC && aadharCardC && mobileNumC;
		   
		   if(result) {
			   return result;
		   }else {
			   return false;
		   }
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter name");
		String name = input.nextLine();
		
		System.out.println("Enter aadharNumber");
		String aadharNumber = input.nextLine();
		
		
		System.out.println("Enter mobileNumber");
		String mobileNumber = input.nextLine();
		
		
		
		
		Demo d = new Demo();
		
		boolean res = d.validate(name,mobileNumber, aadharNumber);
		
		if(res) {
			Citizen citizen = new Citizen();
			
			citizen.setName(name);	
			citizen.setAadharNumber(aadharNumber);	
			citizen.setMobileNumber(mobileNumber);	
			
			citizen.displayDetails(citizen);
		}else {
			
			System.out.println("provided Wrong Details");
			
		}
		
		
	}

	
	

}
