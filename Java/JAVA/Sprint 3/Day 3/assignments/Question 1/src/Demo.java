import java.util.Scanner;

public class Demo extends Student {



    public static void main(String[] args) {
    	
    	 Scanner input = new Scanner(System.in);
    
         System.out.println("Please enter the roll");
         int roll = input.nextInt();
         input.nextLine();

         System.out.println("Please enter the name");
         String name = input.nextLine();

         System.out.println("please enter the marks");
         int marks = input.nextInt();


        Student student = new Demo();
        student.displayDetails(roll,name,marks);
        
        System.out.println("=============");
    	 
        

        System.out.println("Please enter the roll");
        int roll1 = input.nextInt();
        input.nextLine();

        System.out.println("Please enter the name");
        String name1 = input.nextLine();

        System.out.println("please enter the marks");
        int marks1 = input.nextInt();


        Student student1 = new Demo();
        student1.displayDetails(roll1,name1,marks1);

    }

}
