import java.util.Scanner;

public class Demo {
	
	
	public static void printResult(Items items){
		System.out.println(items);
		
		items.message(items);
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the required Item");
		String givenData = input.next().toUpperCase();
		
		if( givenData.equals("SOAP") || givenData.equals("BOTTLE") || givenData.equals("FACEPACK") ||
				givenData.equals("PEN") || givenData.equals("BEARDO") ) {
			
			Items items = Items.valueOf(givenData);
			printResult(items);
			
		}
		else {
			System.out.println("Item is not available");
		}
		
	}

}
