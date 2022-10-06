import java.util.Scanner;

public class Demo {
	


	void showDetails(Month m){
		
		if(m == Month.JAN) {
			System.out.println("This is the 1st Month of the Year January");
		}else if(m==Month.FEB) {
			System.out.println("This is the 2nd Month of the Year February");
		}else if(m==Month.MAR) {
			System.out.println("This is the 3rd Month of the Year March");
		}else if(m==Month.APR) {
			System.out.println("This is the 4th Month of the Year April");
		}else if(m==Month.MAY) {
			System.out.println("This is the 5st Month of the Year May"
					+ "");
		}else if(m==Month.JUN) {
			System.out.println("This is the 6th Month of the Year JUNE");
		}else if(m==Month.JUL) {
			System.out.println("This is the 7th Month of the Year July");
		}else if(m==Month.SEP) {
			System.out.println("This is the 8th Month of the Year September");
		}else if(m==Month.AUG) {
			System.out.println("This is the 9th Month of the Year August");
		}else if(m==Month.OCT) {
			System.out.println("This is the 10tH Month of the Year Octomber");
		}else if(m==Month.NOV) {
			System.out.println("This is the 11th Month of the Year November");
		}else if(m==Month.DEC
				) {
			System.out.println("JAN then print “This is the 12th Month of the Year December");
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
