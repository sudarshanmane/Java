package Q3;

import java.util.Scanner;

public class Demo {
	
	void showDetails(Month m){
		
		if(m == Month.MARCH) {
			System.out.println("March");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Month");
		String month = input.nextLine().toUpperCase();
		try {
			
			Month month1 = Month.valueOf(month);
			Demo d = new Demo();
			d.showDetails(month1);

		}catch(IllegalArgumentException i) {
			System.out.println("Invalid Month Name");
			
		}
		
		
		
		
	}


}
