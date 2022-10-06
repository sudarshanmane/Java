package dom;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Test test = new Test();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int primeOf = input.nextInt();
		
		int[] arr = test.display(primeOf);
		
		String result = "";
		

		
		for(int a = 0;a<arr.length;a++) {
			
			if(arr[a] == 0) {
			   break;
		   }else {
			   result = result + arr[a] + " " ;
		   }	
		}
		
		System.out.println(result);
		

	}

}
