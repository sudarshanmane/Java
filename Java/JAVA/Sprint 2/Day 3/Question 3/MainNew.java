import java.util.Arrays;

public class MainNew {
    public static int[] findAndReturnPrimeNumbers(int[] inputArray){
            int k = 0;
            int[] req = new int[inputArray.length];

            for(int a = 0; a < inputArray.length; a++) {
                int n = inputArray[a];
                int count = 0;
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        count++;
                    }
                }
                if(count == 2) {
                    req[k] =inputArray[a];
                    k++;
                }

            }

            return req;
    }



        public static void main(String[] args){
            int[] input = {10,12,50,14,15};

         int[] print =  findAndReturnPrimeNumbers(input);

//         String array  = String.valueOf(print);
            if(print.length!=0){
                for(int a= 0;a<print.length;a++){
                    if(print[a] != 0){
                        System.out.println(print[a]);
                    }
                    else{
                        break;
                    }

                }
            }
            if(print[0] == 0){
                System.out.println("Prime number not found in the supplied Array");
            }








        }



}

