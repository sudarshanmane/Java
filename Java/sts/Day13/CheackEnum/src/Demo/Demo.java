package Demo;

import java.util.Scanner;

public class Demo {
	
	
static	void printSh(City city) {
		
		city.message(city);
		
	}
	
	public static void main(String[] args) {
		
//		City city = City.PUNE;
		
		Scanner input = new Scanner(System.in);
		for(int a = 0;a<5;a++) {
			
			System.out.println("ENTER CITY");
		String cityName  = input.next();
		
		City city = City.valueOf(cityName.toUpperCase());
		
		printSh(city);
	}
		
		
		
		
		
		
		
	}

}
