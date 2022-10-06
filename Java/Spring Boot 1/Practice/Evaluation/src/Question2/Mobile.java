package Question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mobile {

	
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile(String company, String model) {
		
		int count =0;
		
		Set<Map.Entry<String, ArrayList<String>>>  entries = mobiles.entrySet();
		
		for(Map.Entry<String, ArrayList<String>> entry : entries) {
			
			if(entry.getKey().equals(company)) {
				count++;
				entry.getValue().add(model);
				
			}
		}
		
		if(count == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add(model);
			mobiles.put(company,list );
			
		}
		return "Mobile added successfully";
			
	}
	
	
	public List<String> getModels(String company){
		
		
		
		Set<Map.Entry<String, ArrayList<String>>>  entries = mobiles.entrySet();
		
		for(Map.Entry<String, ArrayList<String>> entry : entries) {
			
			if(entry.getKey().equals(company)) {
				return entry.getValue();
			}
		}
		
		List<String> list = new ArrayList<>();
		return list;

		
		
		
	}

	
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		
		
		System.out.println(mobile.addMobile("one", "A"));
		System.out.println(		mobile.addMobile("two", "B"));
		System.out.println(		mobile.addMobile("two", "C"));
		System.out.println(		mobile.addMobile("one", "D"));
		
		 System.out.println(mobile.getModels("one"));
		 System.out.println(mobile.getModels("two"));

		 

		
		
		
	}

}
