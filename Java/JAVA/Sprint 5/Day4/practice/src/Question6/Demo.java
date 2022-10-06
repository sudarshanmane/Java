package Question6;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Pune");
		list.add("Mumbai");
		list.add("Sambhaji Nagar");
		list.add("Latur");
		
		
		PrintList printList = (city) -> {
			
		for(String s : city) {
			System.out.println(s);
		}

			
			
		};
		printList.display(list);

		
		
		

	}

}
