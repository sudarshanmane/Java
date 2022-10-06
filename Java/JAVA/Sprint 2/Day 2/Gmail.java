import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Gmail {

     ArrayList<Javabean> account = new ArrayList<Javabean>();


     public static void main(String[] args) {
          Gmail myGmail = new Gmail();

          Scanner input = new Scanner(System.in);

          System.out.println("Enter 1 to Register or Enter  2 to SignIn");
          int choice = input.nextInt();

          if(choice == 1) {
//               show register page ;
               Javabean user = new Javabean();

               System.out.println("Enter user Name");
               user.setName(input.nextLine());

              System.out.println("Enter Your address");
               user.setAddress(input.nextLine());

               System.out.println("Enter Your email");
               user.setAddress(input.nextLine());

               System.out.println("Enter Your password");
               user.setAddress(input.nextLine());

               myGmail.account.add(user);

          }else{
//               show login page;
               Scanner input2 = new Scanner(System.in);

               System.out.println("Enter Email");
               String email = input2.nextLine();

               System.out.println("Enter Password");
               String password = input2.nextLine();

               if(myGmail.account.size()>0){
                   for (int i = 0; i < myGmail.account.size(); i++) {
                       if(myGmail.account.get(i).getEmail().equals(email) &&
                               myGmail.account.get(i).getEmail().equals(password )){
                           System.out.println("Welcome " + myGmail.account.get(i).getName());
                       }
                   }
               }
               else {
                   System.out.println("please register");
               }



          }



     }

}
