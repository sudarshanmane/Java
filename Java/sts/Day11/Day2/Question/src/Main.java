import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Intr intr  = new Test();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Number");
		
		int providedNumber = input.nextInt() ;
		
		int[] arr = intr.display(providedNumber);
		
		String output = "";
		
		for(int a = 0;a<providedNumber;a++) {

			if(arr[a] == 0) {
				break;
			}else {
				output = output + arr[a] + " ";	
			}
		}
		
		System.out.println(output);
		
		
	
		
		
		
		
	}
}
