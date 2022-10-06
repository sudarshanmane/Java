import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NumberOfDays {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter start date in dd-MM-yyyy pattern");
		String startDate = sc.next();
		
		System.out.println("Enter end date in dd-MM-yyyy pattern");
		String endDate = sc.next();
		
		
		try {
			
			LocalDate ld1 = LocalDate.parse(startDate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate ld2 = LocalDate.parse(endDate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
			if(ChronoUnit.DAYS.between(ld1, ld2)<0) {
				System.out.println("Start date should be smaller than End date");
				
			}else {
				System.out.println("wages for " +ChronoUnit.DAYS.between(ld1, ld2)  + " day is " + ChronoUnit.DAYS.between(ld1, ld2)*1200 );
			}
			
		}catch(Exception e) {		
			System.out.println("Please enter date in dd-MM-yyyy format");
		}
		
	}


}
