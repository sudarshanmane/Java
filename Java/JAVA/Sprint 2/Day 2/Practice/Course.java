import java.util.Scanner;

public class Course {
    int courseId;
    String courseName;
    int courseFee;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }

    void displayCourseDetails(){
        System.out.println("Course ID : " + getCourseId());
        System.out.println("Course Name : " + getCourseName());
        System.out.println("Course Fee : " + getCourseFee());
    }
   static void authenticate(String username,String password){
        if(username == "Admin" && password == "1234"){
            Course object = new Course();

            Scanner input = new Scanner(System.in);

            System.out.println("Enter Course Id");
            object.setCourseId(input.nextInt());

            input.nextLine();

            System.out.println("Enter Course Name");
            object.setCourseName(input.nextLine());

            System.out.println("Enter Course Fee");
            object.setCourseFee(input.nextInt());

            object.displayCourseDetails();



        }
        else {
            System.out.println("Invalid Username or password");
        }


   }

    public static void main(String[] args) {
        authenticate("Admin","1234");
        System.out.println("-------------------->");
        authenticate("Admin","123");
    }

}
