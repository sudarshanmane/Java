import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Students you want to enter");
        int noOfStudents = input.nextInt();

        System.out.println("Enter the Roll Number :");
        String rollNumber = input.nextLine();

        input.nextLine();
        System.out.println("Enter the Name :");
        String studentName = input.nextLine();

        System.out.println("Enter the marks :");
        int marks = input.nextInt();

        Student student1 = new Student(rollNumber,studentName,marks);
        System.out.println("Student Details 1");
        System.out.println(" Student Roll Number: " + student1.rollNumber);
        System.out.println("  Student Name : " + student1.studentName);
        System.out.println("   Student Mark : " + student1.marks);

        System.out.println("====================================>");
        System.out.println("Enter the Details OF Student 2");

        System.out.println("Enter the Roll Number :");
        String rollNumber1 = input.nextLine();

   input.nextLine();
        System.out.println("Enter the Name :");
        String studentName1 = input.nextLine();

        System.out.println("Enter the marks :");
        int marks1 = input.nextInt();

        Student student2= new Student(rollNumber1,studentName1,marks1);
        System.out.println("Student Details 2");
        System.out.println("Student Roll Number: " + student2.rollNumber);
        System.out.println("Student Name : " + student2.studentName);
        System.out.println("Student Mark : " + student2.marks);





    }
}
