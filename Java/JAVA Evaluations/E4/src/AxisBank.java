
public class AxisBank extends Bank{
	
	double rateOfInterest;

	
	@Override
	void displayDetails() {
		System.out.println("Axis bank " + rateOfInterest);
		super.displayDetails();
	}
	
	void getCreditCard(){
		System.out.println("“Get the Credit Card from the Axis bank");
		
	}

}
