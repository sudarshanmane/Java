package Question4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IndianStates {
	
	public static void main(String[] args) {
		
		Map<String, List<String>> map = new TreeMap<>();
		
		
		map.put("Assam", Arrays.asList("Guwahati", "Silchar", "Dibrugarh","Nagaon"));
		map.put("JharKhand", Arrays.asList("Dhanbad", "Ranchi", "Jamshedpur", "Bokaro Steel"));
		map.put("Bihar", Arrays.asList(	"Patna", "Gaya", "Bhagalpur", "Muzaffarpur"));
		map.put("Gujrat", Arrays.asList( "Surat", "Vadodara", "Rajkot", "Bhavnaga"));

		
		Set<Map.Entry<String,List<String>>> entries = map.entrySet();
		
		entries.forEach(item -> System.out.println(item));
		

		
		
		
		
	}

}
