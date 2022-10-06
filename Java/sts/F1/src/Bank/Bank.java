package Bank;

public class Bank {
	
	private Bank(){
		System.out. println("Inside private constructor of Bank");
		}
	
	public static Bank returnBankObj() {
		return new Bank();
	}

}
