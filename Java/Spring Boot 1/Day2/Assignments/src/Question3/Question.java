package Question3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Question {
	
	
	public static void main(String[] args) {
		
		Map<String, String> map = new  LinkedHashMap<>();
	
		map.put("Arunachal Pradesh","Itanagar");		
		map.put("Assam", "Dispur");
		map.put("Bihar", "Patna");
		map.put("Chhattisgarh", "Raipur");
		map.put("Maharashtra", "Mumbai");
		
		
		
		Set<Map.Entry <String, String>> entries = map.entrySet();   
		
		entries.forEach(item -> System.out.println(item));

		
	}
	
	
	

}
