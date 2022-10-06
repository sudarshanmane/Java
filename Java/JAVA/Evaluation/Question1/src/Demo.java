import java.util.Scanner;

public class Demo {


	public static Bank getBank(String bank) {
		
		if(bank.equals("axis")) {
			Bank bank1 = new AxisBank();
			bank1.branchName = "Pune";
			bank1.ifscCode = "AXIS0005943";
			
			AxisBank axisBank = (AxisBank) bank1;
			axisBank.rateOfInterest = 11.25;
			
			return bank1;
		}
		else if(bank.equals("icici")) {
			Bank bank2 = new ICICIBank();
			bank2.branchName = "Mumbai";
			bank2.ifscCode = "ICICIN0005943";
			ICICIBank iciciBank =(ICICIBank) bank2;
			iciciBank.rateOfInterest = 10.00;
			
			return bank2;

		}
		else {
			Bank bank3 = null;
			return bank3;
		}
		
	}

	
	public static void main(String[] args) {
		
		Scanner input= new  Scanner(System.in);
		
		System.out.println("Enter your bank name");
		String bank = input.next().toLowerCase();
		
		Bank bankName = getBank(bank);
		if(bankName instanceof AxisBank) {
			bankName.displayDetails();
			
			AxisBank axisBank = (AxisBank) bankName;
			axisBank.getCreditCard();
		}else if(bankName instanceof ICICIBank) {
			bankName.displayDetails();	
		}else {
			System.out.println("This bank dosent Exists");
		}
		
		
		
		
		
		
		

	}

}
