
public class Main {
	
	public static void main(String[] args) {
		
		Loan  loan = new Loan();
		
		PermanentEmployee employee = new PermanentEmployee(1 , "One", 1000);
		employee.calculateSalary();
		
		double pLoan = loan.calculateLoanAmount(employee);
		
//		double tLoan = loan.calculateLoanAmount(new PermanentEmployee(2 , "Two", 2000));
		
		
		System.out.println(pLoan);
//		System.out.println(tLoan);

		
		
		
		
		
		
	}

}
