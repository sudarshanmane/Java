package Question3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
	
	
	
	public static void main(String[] args) {
		
		Map<String,String> m = new HashMap<>();
		
		m.put("one", "one");		
		m.put("ONE", "ONE");
		m.put("Two", "Two");
		m.put("tHRE", "Three");
		
		Set<Map.Entry<String, String>> map = m.entrySet();
		
		for( Map.Entry<String, String> val : map ) {
			System.out.println(val.getKey() + " -- " + val.getValue());
		}
	
//		map.forEach(print -> System.out.println(print.getKey() + "-----" + print.getValue()));

		
	}

	
	

}
