
public class Employee {
	private int empId;
	private String empring;
	private double salary ;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpring() {
		return empring;
	}
	public void setEmpring(String empring) {
		this.empring = empring;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public Employee(int empId, String empring, double salary) {
		super();
		this.empId = empId;
		this.empring = empring;
		this.salary = salary;
	}
	
	


}
