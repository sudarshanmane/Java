import java.util.Scanner;

public class Main {
	

	static Scanner input = new Scanner(System.in);
	
	public static Employee getEmployeeDetails() {
		
		
		System.out.println("Enter the employee id");
		int id  = input.nextInt();

		input.nextLine();
		
		System.out.println("Enter the Name");
		String  name = input.nextLine();

		
		System.out.println("Enter the employee Salary");
		double  salary = input.nextInt();
		
		Employee employee1 = new Employee( name,  id , salary);
		
	
		return employee1 ;
		
	}
	
	public static int getPFPercentage() {
		
		
		System.out.println("Enter the employee pfPercentage");
		int pfPercentage  = input.nextInt();
				
		return pfPercentage;
		
		

				
		
	}

	public static void main(String[] args) {
		
		Employee employee = getEmployeeDetails();
		int pf = getPFPercentage();
		
		System.out.println("==========================================");
		
		System.out.println("id :"  + employee.getEmployeeId());
		System.out.println("Name:"  + employee.getEmployeeName());
        employee.calculateNetSalary(pf);
	}

}
