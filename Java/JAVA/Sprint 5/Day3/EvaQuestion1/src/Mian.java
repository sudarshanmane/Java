
public class Mian {

	public static void main(String[] args) {

		Loan loan = new Loan();
		PermanentEmployee pe = new PermanentEmployee(1,"one",1000);
		double l = loan.calculateLoanAmount(pe);
//		System.out.println(l)\
//		
//		double l = loan.calculateLoanAmount(pe);
//		System.out.println(l);
		
	}

}
