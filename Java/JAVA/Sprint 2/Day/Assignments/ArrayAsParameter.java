package Assignments;

public class ArrayAsParameter {
    String name ;
    String address ;

    void printSumOfArray(int[] numbers){
    int sum  = 0;

    for(int a =0;a< numbers.length;a++){
        sum += numbers[a];
    }
//        System.out.println(sum);
    }
    
      int getArray(int[] numbers){
          int sum  = 0;
          for(int a =0;a< numbers.length;a++){
              sum += numbers[a];
          };

            return sum;

    }


    public static void main(String[] args) {
        ArrayAsParameter obj = new ArrayAsParameter();
        int[] array = {1,2,3,4,5,6,7,8,9};

        System.out.println((obj.getArray(array)));
    }

}
