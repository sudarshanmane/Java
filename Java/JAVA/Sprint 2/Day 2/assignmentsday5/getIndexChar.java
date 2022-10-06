package assignmentsday5;

import java.util.Scanner;

public class getIndexChar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String");
        String printChar = input.nextLine();

        System.out.println("Enter the character position you want to access:");

        int num = input.nextInt();
        System.out.println("Character at position " + num +" is : " + printChar.charAt(num));









    }
}
