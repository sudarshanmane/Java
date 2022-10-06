public class EvenSum {

  void arrayMethod(int[][] numbers){
      for(int a = 0;a<numbers.length;a++){
          int sum = 0;

          for(int i = 0;i<numbers.length;i++){
              if(numbers[a][i]%2 ==0){
                  sum = sum +  numbers[a][i];
              }
          }
          System.out.println(sum);
      }



 }
    public static void main(String[] args) {
     EvenSum obj = new EvenSum();
     int[][] array = {
             {1,2,3},
             {4,5,6},
             {7,8,9}
     };
        obj.arrayMethod(array);


    }
}
