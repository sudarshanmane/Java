public class WholeNumbers {

    void printNumber(int num){
         if(num>=0 && num%2 == 1){
             System.out.println("output : " + num);
         }
         else if(num>=0 && num%2 == 0){
             for(int a = 0;a<10;a++){
                 if(( num + a) % 10 == 0){
                     System.out.println( "Output :"+( num+a));
                     break;
                 }
             }
         }
         else{
             System.out.println("Error : " + num);
         }
    }

    public static void main(String[] args) {
        WholeNumbers object = new WholeNumbers();
        object.printNumber(17);

    }


}
