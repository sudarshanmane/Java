import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import javax.print.attribute.standard.Chromaticity;

//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.Month;
//import java.time.format.DateTimeFormatter;
//
public class Demo {
//
	public static void main(String[] args) {
//
////		
////		LocalDate ld = LocalDate.now();
////		System.out.println(ld);
////		
////		LocalDateTime ldt = LocalDateTime.now();
////		System.out.println(ldt);
//////		
////		LocalDate ldo = LocalDate.of(2021,Month.APRIL,20);
////		System.out.println(ldo);
//		
////		LocalDate date = LocalDate.now();
////		
////		LocalDate yest = date.minusDays(1);
////		
////		LocalDate tomm = yest.plusDays(2);
////		System.out.println(yest);
////		System.out.println(tomm);
////		
//		
////		DateTimeFormatter forObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
////		
////		LocalDateTime  current = LocalDateTime.now();
////		System.out.println(current);
////
////		
////		String ufd = current.format(forObj);
////		System.out.println(ufd);
////	}
//		
//		DateTimeFormatter formaObj = DateTimeFormatter.ofPattern("dd/mm/yyyy");
//		LocalDate current = LocalDate.now();
//		
//		String udf = current.format(formaObj);
//
//		System.out.println(current);
////		
//		
//		String dob= "05/02/1999";
//		
//		DateTimeFormatter  dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		
//		LocalDate ld = LocalDate.parse(dob,dtf);
//		
//		
////		System.out.println(ld);
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter dd/mm/yy");
//		
//		String dob = sc.next();
////		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		
//		
//		try {
//		
//			
//			LocalDate ld=  LocalDate.parse(dob,dtf);  
//		
//			String result = ld.format(DateTimeFormatter.ofPattern("EEEE"));
//
//			System.out.println(result);
//			
//	
//		}catch(Exception e) {
//			System.out.println("one");
//		
//		}
//		
//		
		
		
//		
		Scanner sc = new Scanner(System.in);
//		String st = sc.next();
//		
//		try {
//		
//			LocalDate ld = LocalDate.parse(st,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//			
//			LocalDate LD = LocalDate.now();
//			
//			Period p = Period.between(ld, LD);
//			System.out.println(p.getYears());
//			
//			if(p.getYears()>=18) {
//				System.out.println("Eligible");
//			}else {
//				System.out.println("no");
//			}
//			
//			if(p>=18) {
//			System.out.println("Yes");
//			}else {
//				System.out.println("No");
//			}
			
//		}catch(Exception e) {
//			System.out.println("NO");
//		}
//	
//		
		
//		
//		LocalDateTime ldt = LocalDateTime.of(1999,10,21,10,10,10);
//		LocalDateTime ldt1 = LocalDateTime.of(2000,1,22,11,11,11);
//		
//		System.out.println(ldt);
//		System.out.println(ldt1);
//		
//		System.out.println(ChronoUnit.YEARS.between(ldt, ldt1));
//		System.out.println(ChronoUnit.MONTHS.between(ldt, ldt1));
//		System.out.println(ChronoUnit.DAYS.between(ldt, ldt1));
//		System.out.println(ChronoUnit.HOURS.between(ldt, ldt1));
//		System.out.println(ChronoUnit.MINUTES.between(ldt, ldt1));
//		System.out.println(ChronoUnit.MICROS.between(ldt, ldt1));
//		System.out.println(ChronoUnit.NANOS.between(ldt, ldt1));
//
//
//		
		
//		LocalDate LD = LocalDate.now();
//		LocalDate L = LD.plus(3,ChronoUnit.MONTHS);
//		System.out.println(LD);
//		System.out.println(L);
		
		
//		You Problem
		
		
		System.out.println("Enter Start Date in dd-MM-yy");
		String st = sc.next();
		
//		System.out.println("Enter end Date in dd-MM-yyyy");
//		String ed = sc.next();
		
		
		
	try {

		LocalDate s = LocalDate.parse(st,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//		LocalDate e = LocalDate.parse(ed,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//
		
//		int dayDiff = (int) ChronoUnit.DAYS.between(s, e);
//
//		
//       if(dayDiff>0) {
//    	  System.out.println("total wages : " + dayDiff*1200);
//       }
//       else {
//    	   System.out.println("Start date should be smaller than end date");
//       }
//		
//		LocalDate s = LocalDate.parse(st,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//		LocalDate e = LocalDate.parse(ed,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//		
//		System.out.println(ChronoUnit.DAYS.between(s, e));
		
		LocalDate ldt = s.plus(3,ChronoUnit.MONTHS);
		System.out.println(ldt);

		
		
////		
	}catch(Exception e) {
		System.out.println("Please enter in dd-MM-yyyy format");
	}
	

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
