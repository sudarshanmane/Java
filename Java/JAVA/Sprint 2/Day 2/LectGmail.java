import java.util.Scanner;

public class LectGmail {

    String email ;
    String password;

    public static void main(String[] args) {
        LectGmail obj = new LectGmail();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Email");
        obj.email  = input.nextLine();


        System.out.println("Enter your Password");
        obj.password  = input.nextLine();

        System.out.println("Email : "+ obj.email);
        System.out.println("Password : "+obj.password);

        if(obj.email.equals("@123") && obj.password.equals("123")){
            System.out.println("Welcome to Home Page");

        }
        else{
            System.out.println("Wrong");
        }


    }
}
