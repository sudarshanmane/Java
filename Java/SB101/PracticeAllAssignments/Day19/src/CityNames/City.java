package CityNames;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class City {
	
	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		map.put("one", "two");
		map.put("two", "Three");
		
		Set<Map.Entry<String, String>> set = map.entrySet();
		
		
		set.forEach(item -> System.out.println(item.getKey() + "====="+ item.getValue()));

	}

}
