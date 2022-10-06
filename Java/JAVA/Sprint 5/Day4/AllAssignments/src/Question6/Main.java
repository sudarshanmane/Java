package Question6;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		PrintList list = city -> {
			
			for(String c : city) {
				System.out.println(c);
			}
			
		};
		
		List<String> cityNew = new ArrayList<>();
		cityNew.add("one");
		cityNew.add("two");
		list.display(cityNew);
	
	}

}

interface PrintList {
	
abstract void display(List<String> city);

}
