public class B extends A{

    B(){
//        super("Hello");
        System.out.println("I am B's Constructor");
    }

    @Override
    void fun1(){
        System.out.println("I am b's fun");
        super.fun1();


    }



}
