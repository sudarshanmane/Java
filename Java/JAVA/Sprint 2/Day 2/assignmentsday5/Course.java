package assignmentsday5;


public class Course {

    int courseId;
    int  courseFee;
    String courseName;


        void displayCourseDetails(){

        System.out.println("courseId : "+ courseId);
        System.out.println("courseFee : " + courseFee);
        System.out.println("courseName : " + courseName);
    }


   static void authenticate(String username ,String password){

        if(username == "Admin" && password == "1234"){

            Course object = new Course();

            Scanner input = new Scanner(System.in);

            System.out.println("Enter course id");
             object.courseId = input.nextInt();

            System.out.println("Enter course Fee");
            object.courseFee = input.nextInt();

            System.out.println("Enter course name");
            object.courseName = input.next();

            System.out.println("------------>");
            System.out.println("Course Details");

            object.displayCourseDetails();
            System.out.println("-------------->");
        }

        else{
            System.out.println("Invalid Username or password");
        }

    }





    public static void main(String[] args) {

        Course obj = new Course();
        authenticate("Admin","1234");

        authenticate("Admin","123");
    }
}
