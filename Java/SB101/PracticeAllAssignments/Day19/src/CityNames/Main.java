package CityNames;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		Map<Student, String> map = new TreeMap<>( );
		
		map.put(new Student(1, "one", 101), "m");
		map.put(new Student(2, "two", 88), "T");
		
		Set<Map.Entry<Student, String>> entries = map.entrySet();
		
		entries.forEach(i -> System.out.println(i.getValue()));
		
		

	}

}
