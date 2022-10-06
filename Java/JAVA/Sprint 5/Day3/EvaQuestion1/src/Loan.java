
public class Loan {

	
	public double calculateLoanAmount(Employee employeeObj) {
	
		
		double loan =0;
		
		if(employeeObj instanceof PermanentEmployee) {
			
		PermanentEmployee	pr  =  (PermanentEmployee) employeeObj; 
		pr.calculateSalary();
		
			System.out.println("get salary : " + pr.getSalary());
			
			loan =  pr.getSalary()*15/100;			
			
		}
		else {
			loan = employeeObj.getSalary()*10/100;	
		}
	
		System.out.println(loan);
		return loan;
	}
	
	
	
	
}
