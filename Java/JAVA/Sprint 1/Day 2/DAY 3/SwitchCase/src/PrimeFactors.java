public class PrimeFactors {

    public static void findPrimeFactors(int a) {


        if (a <= 100 && a >= 2) {
            for ( int i = 1; i <= a; i++) {

                if (a % i == 0)
                    System.out.println(i);
            }
        } else {
            System.out.println("Invalid number");
        }
    };

    ;


    public static void main(String[] args) {

        findPrimeFactors(99);



    };
};
