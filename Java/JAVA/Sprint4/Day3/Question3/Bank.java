
public class Bank {
	
	private Bank(){
		System.out. println("Inside private constructor of Bank");
		
		}

	
	public static  Bank getObjOfBank(){
		
		return new Bank();
	}
	
}
