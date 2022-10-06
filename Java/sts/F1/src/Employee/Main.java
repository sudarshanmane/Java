package Employee;

import java.util.Scanner;

public class Main {
	
	public static Employee getEmployeeDetails(int id, String name, double salary) {
		
		Employee employee = new Employee();
		
		employee.setEmployeeName(name);
		employee.setEmployeeId(id);
		employee.setSalary(salary);
		
		return employee;
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Id :");
		int id = input.nextInt();
		
		System.out.println("Enter Name :");
		String name = input.next();
		
		input.nextLine();
		
		
		System.out.println("Enter salary : ");
		double salary = input.nextDouble();
		
		
		System.out.println("Enter PF percentage :");
		int pfPercentage = input.nextInt();
		
		Employee emplyee = getEmployeeDetails(id,name,salary);
		
		System.out.println("id : " + emplyee.getEmployeeId());
		System.out.println("Name : " + emplyee.getEmployeeName());
		emplyee.calculateNetSalary(pfPercentage);
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
