package Question11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new  Scanner(System.in);
		
		System.out.println("Enter the no of passengers ");
		int noOfPassengers = input.nextInt();
		
		System.out.println("Enter the no of Kilometers");
		int noOfKilometers = input.nextInt();
		
		OLA ola = new OLA();
		
		int totalFare = ola.calculateBill(ola.bookCar(noOfPassengers, noOfKilometers));
		System.out.println("Your total fare = " +  totalFare);

	}

}
