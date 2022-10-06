import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lect1 {
	
	public static void main(String[] args) {
//		
//		Pattern p = Pattern.compile("ab");
//		
//		Matcher m = p.matcher("abbbabbab");
//		
//		int count = 0 ;
//		while(m.find()) {
//			count++;
//			System.out.println(m.start() + "======" + m.end() + "======" + m.group());
//		}
//		
//		System.out.println("no of occurences : " + count );
//		
//		
//		
//		Pattern p = Pattern.compile("[avbv]");
//		 
//		Matcher m = p.matcher("jlkdjosdjfi odsbjABC 22462424 6DEF!@#$%^&*  aaamn aaanknmaaaaaa"
//				+ "");
//		int count = 0;
//		
//		
//		while(m.find()) {
//			count++;
//			System.out.println(m.start() + "------- " + m.group());
//			
		
//		}
		
//		
		
//		System.out.println("number of occurrences of ab strings are : " + count );
//		
//		
		
//		System.out.println(Pattern.matches( "[789]{1}[0-9]{9}","8513214568"));
//		
//		String message = "Welcome Ramesh,How are you Ramesh";
		
//		String result = message.replaceAll("[W][a-z]{6}","Hellow");
//		System.out.println(result);
		
//		Scanner input  = new Scanner(System.in);
//		String mob = input.next();
//		
//		boolean b = mob.matches("[789]{1}\\d{9}");
//		
//		if(b) {
//			System.out.println(valid);
//		}else {
//			System.out.println("Invalid");
//		}.
		
		String mess = "HOW ARE YOU";
		
		String[] newMess = mess.split("A"
				+ "");
		
		for(int a =0;a<newMess.length;a++) {
			System.out.println(newMess[a]);
		}
		
		
		
		
	}
//	
	

}
