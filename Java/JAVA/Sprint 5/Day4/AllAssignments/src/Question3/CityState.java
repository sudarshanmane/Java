package Question3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CityState {
	
	public static void main(String[] args) {
		
		HashMap<String, String> cityState = new HashMap<>();
		
		cityState.put("asd", "dkjf");
		cityState.put("kndj", "jnms");
		cityState.put("oeijr", "okfv");
		cityState.put("jirgij", "oikj");
		
		Set<Map.Entry<String, String>>  out = cityState.entrySet();	
		
//		for(Map.Entry<String, String>  str : out) {
//			System.out.println(str.getKey() + "---" + str.getValue());
//		}
		
		out.forEach(items -> System.out.println(items.getKey() + "---" + items.getValue()));
		

		
	}
	

}
