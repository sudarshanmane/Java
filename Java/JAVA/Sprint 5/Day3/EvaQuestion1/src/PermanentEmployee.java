
public class PermanentEmployee extends Employee{
	
	
	private double basicPay;

	

	
	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}

	@Override
	void calculateSalary() {
		
		int PFamount = (int) (this.basicPay*0.12);
		int salay = (int)this.basicPay * (PFamount); 
		setSalary(salay);
		System.out.println(getSalary());
		
	
		
	}
	
	



}
