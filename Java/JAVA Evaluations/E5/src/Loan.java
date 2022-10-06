
public class Loan {
	
	
	public double calculateLoanAmount(Employee employeeObj){
		
		if(employeeObj instanceof PermanentEmployee) {
			System.out.println(employeeObj.getSalary());
			
			return employeeObj.getSalary()*15/100;
			
		}else {
			
			return employeeObj.getSalary()*10/100;
			
		}
		
	
		
	}
	
}
