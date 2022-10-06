import java.util.Scanner;

public class AllStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Details  of Science Students  ");
		
		System.out.println("Please Enter The name of ScienceStudent ");
		String name = input.next();
		
		input.nextLine();
		

		System.out.println("Please Enter The address of ScienceStudent ");
		String address = input.nextLine();

		
		Student student = new ScienceStudent(name, address);
		ScienceStudent scienceStudent = (ScienceStudent) student;

		System.out.println("Pease Enter the phisicsMarks");
		
		scienceStudent.phisicsMarks = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Pease Enter the chemistryMarks");
		scienceStudent.chemistryMarks = input.nextInt();
		
		input.nextLine();

		System.out.println("Pease Enter the mathsMarks");
		scienceStudent.mathsMarks = input.nextInt();
		
		scienceStudent.displayDetails();
		
		

		System.out.println("=======================");
	
		
		
		System.out.println("Details of students of History ");
	
			System.out.println("Please Enter The name of History Students ");
			String nameNew = input.next();
			
			input.nextLine();
			

			System.out.println("Please Enter The address of ScienceStudent ");
			String addressNew = input.nextLine();

			
			Student studentNew = new HistoryStudent(nameNew, addressNew);
			 HistoryStudent historyStudent = ( HistoryStudent) studentNew;

			System.out.println("Pease Enter the civicsMarks");
			
			historyStudent.civicsMarks = input.nextInt();
			
			input.nextLine();
			
			System.out.println("Pease Enter the historyMarks");
			historyStudent.historyMarks = input.nextInt();
			
			input.nextLine();
			
			historyStudent.displayDetails();
			
	}

}
