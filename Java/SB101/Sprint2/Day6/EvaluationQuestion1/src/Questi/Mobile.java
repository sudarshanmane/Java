package Questi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mobile {
	
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	Set<Map.Entry<String, ArrayList<String>>> entry = mobiles.entrySet();
	
	
	public String addMobile(String company, String model) {
		
		int count = 0;
		
		for(Map.Entry<String, ArrayList<String>> entry1  : entry) {
			
		if(entry1.getKey().equals(company)) {
		    entry1.getValue().add(model);
			count++;
		}
		
	}
		
		   if(count == 0) {
			   
			List<String> list = new ArrayList<>();
			list.add(model);
			mobiles.put(company, (ArrayList<String>) list);
			
		}
		
	
	return  "Mobile added successfully" ;
		
		
	}
	
	public List<String> getModels(String company)throws InvalidMobileException{

		int num = 0;
		
		for(Map.Entry<String, ArrayList<String>> entry1  : entry) {
//			System.out.println(entry1.getKey());

			if(entry1.getKey().equals(company)) {
                num++;
				return entry1.getValue();
				
			}
			
		}
		
		
		if(0 == num) {

			InvalidMobileException exception = new InvalidMobileException("No alue matches");
			throw exception;
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		
		Mobile mobile  = new Mobile();
		
		mobile.addMobile("one", "Two");
		mobile.addMobile("one" , "three");
		mobile.addMobile("One", "Two");
		mobile.addMobile("One", "four");
		
		try {
			System.out.println((mobile.getModels("One")));
		} catch (InvalidMobileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
}


class InvalidMobileException extends Exception {
	
	InvalidMobileException(String message){
		super(message);
	}
	
};