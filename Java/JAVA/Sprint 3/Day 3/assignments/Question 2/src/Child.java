import java.util.Scanner;

public class Child extends Parent{


    public Child(int number) {
        super(number);
    }

    @Override
    void method1() {
        super.method1();

    }

    void method4(){
        System.out.println("This is  method4  belongs to Child class");

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number>=1 && number<=10){

            Parent parent = new Child(number);
            Child child1 = (Child) parent ;
            child1.method1();
            child1.method2();
            child1.method3();
            child1.method4();

        }else{
            System.out.println("Invalid number");

        }






    }

}
