
public class TemporaryEmployee extends Employee{
	
	private int hoursWorked;
	private int hourlyWages;
	

	public TemporaryEmployee(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}
	
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	@Override
	void calculateSalary() {
		
	double salary = hoursWorked * hourlyWages;
	setSalary(salary);
	
	System.out.println(getSalary());
				
	}
	
	
	
}
