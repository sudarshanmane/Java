package Assignments;

public class Demo {

   Demo(){
       System.out.println("I am first Demo");
   }
   Demo(String s){
       System.out.println("I am Second Demo");
   }
   Demo(int s){
       System.out.println("I am third Demo");
   }
   Demo(float f){
       System.out.println("I am fourth Demo");
   }


   public static void main(String[] args) {

       Demo object= new Demo();
       object.Demo("String");
       object .Demo(10);
       object = new Demo(10.10f);

   }




}
