import java.util.Scanner;

public class Demo {

	static void printDetails(Items items) {

		int check = 0;
		
		Items[]  items2 = Items.values();
		
		for(Items items3 : items2) {
			
			if(items3 == items) {
				check =1;
			}
		}
		
			if( check == 1 ) {
				items.message(items);
			}
			else {
				System.out.println("Please  provide the right Details");
			}
			
		
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		for(int a = 0;a<5;a++) {
			
			System.out.println("EnterItem Name");
			String item = input.next().toUpperCase();
			
			
			
		if(item.equals("FACEPACK") ||item.equals("SUGAR") 
				|| item.equals("PEN") || item.equals("SOAP") || 
				item.equals("MILK")) {
			
			Items items = Items.valueOf(item);
			items.message(items);
		}
		else {
			System.out.println("Item not available");
		}
		
	}

	}
}
