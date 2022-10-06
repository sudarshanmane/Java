package Question3;

public class CashPayment implements Payment{
	
	private int amount;
	
	

	public CashPayment(int amount) {
		super();
		this.amount = amount;
	}

	//initialize amount using parameterized constructor
	//override doPayment() method and inside this print "Payment done using Cash "+amount;

	

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public void doPayment() {
		
		System.out.println("Payment done using Cash " + amount);
		
	}

	
	

}
