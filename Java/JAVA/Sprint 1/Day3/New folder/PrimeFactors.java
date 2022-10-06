import com.sun.org.apache.xpath.internal.objects.XObject;

public class PrimeFactors {

   static void add(int a){

         if (a >= 2 && a <= 100) {
             String X = "";
             for (int i = 1; i <= a; i++) {
                 if (a % i == 0) {
                     X = X + i + " ";
                 }
             }
             System.out.println(X);
         } else {
             System.out.println("Invalid Number");
         }
     };


    public static void main(String[] args) {
         add(100);
    };

};
