package Question2;

import java.awt.image.CropImageFilter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
	
	public static int returnAge(String birthDate) {
		int age = 0;
		
		try {
			
			LocalDate date = LocalDate.parse(birthDate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
		LocalDate date2	= LocalDate.now();
		
		age = (int) ChronoUnit.YEARS.between(date, date2);
		
	
		} catch (Exception e) {
			
			System.out.println("“Please enter the date in correct format");

		}
		
		return age;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter the birth date in dd/MM/yyyy format");
		try {
			String birthDate = sc.next();
			
			LocalDate date = LocalDate.parse(birthDate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			LocalDate date2 = LocalDate.now();
			
			int days = (int) ChronoUnit.DAYS.between(date, date2);
			
			if(days <=0) {
				System.out.println("Date should not"
						+ "be in Future");
			}else {
				System.out.println(returnAge(birthDate));
			}
			
			
		} catch (Exception e) {
			
			System.out.println("Please enter the date in correct format");

			
		}
		
	
		
		
		
		
	}
	

}
