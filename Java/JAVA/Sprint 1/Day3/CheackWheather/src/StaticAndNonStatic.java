public class StaticAndNonStatic {

    static int balance ;
    int newBalance ;
    public static void main(String[] args) {
        balance = 1000;
//        newBalance = 1001;
        System.out.println(balance);
//        System.out.println(newBalance);

////        explanation
//        1) static can be access without object and with same class;
//         2) non-static can not be access without object ;
//        3)Static variable initializes with
//        default values at the time of class
//        loading.
//       4) Non-static variable initializes with
//        default values at the time of object
//        creation

        StaticAndNonStatic print = new StaticAndNonStatic();
        System.out.println(print.newBalance = 1001);





    }
}