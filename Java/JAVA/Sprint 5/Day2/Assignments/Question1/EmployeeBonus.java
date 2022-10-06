import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EmployeeBonus {
	
	public  static double getBonus(String joningDate)throws InvalidAgeException {
		
 	   double bonus  = 0 ;
 	   
 	   try {
 	
 			  LocalDate joining = LocalDate.parse(joningDate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
 	  			
 	   }catch(Exception e) {
  		  InvalidAgeException iae = new InvalidAgeException("Please pass the date in the correct format");
 		  throw iae;   
  	   }
 	   
 	   
 	      LocalDate joining = LocalDate.parse(joningDate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			LocalDate ld = LocalDate.now();
  			
           if(ChronoUnit.DAYS.between(joining, ld) < 0 ){
  				
  				InvalidAgeException fututeException = new InvalidAgeException("Age should not be in the future");
  				throw fututeException;

               }else  if(ChronoUnit.YEARS.between(joining, ld) <1 && ChronoUnit.YEARS.between(joining, ld) >=0 ) {
  				bonus = 5000;
  			}else if(ChronoUnit.YEARS.between(joining, ld) ==1 || ChronoUnit.YEARS.between(joining, ld) < 2){
  				bonus = 8000;	
  			}else if(ChronoUnit.YEARS.between(joining, ld) >2){
  				bonus = 10000;
  			}
           
		return bonus;

	}
}
