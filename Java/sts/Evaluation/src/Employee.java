import java.util.Scanner;

public class Employee {

	public int calculateAverage(int[] age){
		
		int aveAge = 0;
		
		for(var a = 0;a<age.length;a++) { 
			aveAge = aveAge + age[a]; 
		}
				
		return aveAge/age.length;
		
		
	}
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		Scanner input  = new Scanner(System.in); 
		
		System.out.println("Enter total no.of employees : ");
		int totalNoOfEmployees = input.nextInt();
		
		int[] age = new int[totalNoOfEmployees];
		
		System.out.println("Enter the age for " +  totalNoOfEmployees +" employees: " );
		for(int a = 0;a<totalNoOfEmployees;a++) {
			int ages = input.nextInt();
			
			age[a] = ages;
			
			
		}
		
		System.out.println((employee.calculateAverage(age))); 


		
		

	}

}
