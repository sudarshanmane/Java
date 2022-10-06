
public class Employee implements Comparable<Employee>{
	
	private int empId;
	private String name;
	private String address;
	
	public int getEmpId() {
		return empId;			
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
	
	
	
	
	
	
	

}
