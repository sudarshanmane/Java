package MapAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OneHash {
	

	
	public static void main(String[] args) {
		Map<String, String> hmp = new HashMap<>();
		
		hmp.put("Maharashtra", "Mumbai");
		hmp.put("Manipur", "Imphal");
		hmp.put("Meghalaya", "Shillong");
		hmp.put("Mizoram", "Aizawl");
		hmp.put("Nagaland", "Kohima");
		
		System.out.println(hmp);
		
		Set<Map.Entry<String, String>> entries = hmp.entrySet(); 
		
		entries.forEach(item -> System.out.println(item.getKey() + item.getValue()));
		
	}
	
	
}
