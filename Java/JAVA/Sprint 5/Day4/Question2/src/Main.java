import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {		
		
		
		ArrayList<Employee> pr = new ArrayList<>();
			
		Scanner sc  = new Scanner(System.in);
		
		for(int a = 0;a<4;a++) {
			
			System.out.println("Enter empId (int) ");
			int  empId = sc.nextInt();
			
			System.out.println("Enter empring (String)");
			String  empring = sc.next();
			
			System.out.println("Enter salary (double)");
			double salary = sc.nextDouble();
			
			pr.add(new Employee( empId,  empring, salary));
			 
		}
		
		

			TreeSet<Employee> pr1 = new TreeSet<>(new EmployeeSalary());	
			
			for(Employee prs : pr) {
				pr1.add(prs);
			}

			for(Employee em : pr1) {
			
				System.out.println("Employee {  empId " + em.getEmpId() +" : "+ " empring " + em.getEmpring() +" : "+ " salary "+ em.getSalary() + " }");
				
				
			}
			
			
		
	}
	

}
