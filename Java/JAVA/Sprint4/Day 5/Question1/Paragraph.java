import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paragraph {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Para");
		 String para = input.nextLine();
		 
		 Pattern p = Pattern.compile("Java");
		 Matcher m =  p.matcher(para);
		 int count = 0 ;
		 
		 while(m.find()) {
			 
			 count++;
			 System.out.println(m.start() + "----" + m.end() + "----" + m.group());
		 }
		
		 System.out.println("The no of occurrences: "+ count);
		
		
	}

}
