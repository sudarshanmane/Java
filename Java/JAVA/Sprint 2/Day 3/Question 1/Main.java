import java.util.Scanner;
class Main{
    public static String reversString(String input){
        String  result ="";
        for(int a = input.length()-1;a>=0;a--){
          result = result + input.charAt(a);
        }
        return result;

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String to reverse");
        String originalString = sc.next();

        String result = reversString(originalString);

        System.out.println("Original String is :"+ originalString);
        System.out.println("Reversed String is :"+ result);
    }
}