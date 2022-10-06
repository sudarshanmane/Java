package Day19;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		PrintList list = (city) ->  {
			System.out.println(city);
		};
		
		ArrayList<String> name = new ArrayList<>();
		name.add("0ne");
		name.add("Two");
		name.add("three");
		
		list.display(name);
		
				
				
		
		

	}

}


interface PrintList {
	
abstract void display(List<String> city);

}