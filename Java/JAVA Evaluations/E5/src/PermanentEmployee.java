
public class PermanentEmployee extends Employee{
	
	double basicPay;

	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		
		super(employeeId , employeeName);
		this.basicPay = basicPay;

	}
	
	

	@Override
	void calculateSalary() {
	    double pf = basicPay * 0.12;
		double salary =  basicPay - pf;
		
		setSalary(salary);
		
		System.out.println(getSalary());
	}
	
	
	
	
	
	
	

}
