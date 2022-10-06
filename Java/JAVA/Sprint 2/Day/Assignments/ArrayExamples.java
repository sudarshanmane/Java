package Assignments;
public class ArrayExamples {

    public static void main(String[] args) {
        int[] array = {1,2,3};

        int all = 0;
        for(int a  = array.length-1;a>=0;a--){
            all = all +array[a];
      }

       System.out.println(all);
    }
}
