import java.util.Scanner;

public class OperationArray {

	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Size of array");
		int n = input.nextInt();
		
		
		System.out.println("Enter the elements of array");
		
		int[] arr = new int[n];
		
		for(int a = 0;a<n;a++) {		
			
			int k = input.nextInt();
			arr[a]=k;
		
		}
		
		try {
			
		System.out.println("Enter the index number you want");
		String req = input.next();
		
		int i = Integer.parseInt(req);
		System.out.println( "the index you want is :"+ arr[i]);
		System.out.println("The array element successfully accessed");
		
		
		}catch( Exception e ) {
			
			if(e instanceof ArrayIndexOutOfBoundsException)
			    System.out.println("java.lang.ArrayIndexOutOfBoundsException");
			
			else
				System.out.println("java.lang.NumberFormatException");
			
			
			
			
		}
		
		
		
		
		

		
	}
}
