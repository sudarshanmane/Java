import java.util.Scanner;

public class Main {
	
	 
		   
		   public static void main(String[] args) {
			   
			   try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("No of students");
				
				   int num = scanner.nextInt();
				   
				   for(int a = 0;a<num;a++) {
					   
					   System.out.println("roll");
					   int r = scanner.nextInt();
					   
					   
					   System.out.println("name");
					   String name = scanner.next();
					   
					   
					   System.out.println("marks");
					   int m = scanner.nextInt();
					   
					   Student student =  new Student(r, name, m);
					   System.out.println(student.rollNumber + " rollNumber");
					   System.out.println(student.studentName + " name");
					   System.out.println(student.marks + " marks");

					   
				   }
			}
			   
			   
			   
			}
		   
	  

}
