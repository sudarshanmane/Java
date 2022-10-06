import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalcualator {
	
	public static int getAge(String dob)throws InvalidDateFormatException {
		int age = 0;
		
		try {	
			LocalDate ld = LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
		}catch(Exception e) {
			InvalidDateFormatException idf = new InvalidDateFormatException("Please pass the date in the correct format");
			throw idf;
		}
		
		LocalDate ld = LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate lt = LocalDate.now();	
		
        if(ChronoUnit.DAYS.between(ld, lt) < 0 ){   
        	System.out.println("“Date should not be in Future”.");

        }else {
        	age = (int) ChronoUnit.YEARS.between(ld,lt);
        	}
		return age;
		
		
        
	}
	
	
	
	
	





	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your birth date ");
		
		String dob = sc.next();
		
		try {
			
			System.out.println("Your age is : " + getAge(dob) + " years");
			
		}catch(InvalidDateFormatException ide) {		
			System.out.println(ide.getMessage());
		}
		

		
	}

}
