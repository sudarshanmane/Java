package Question2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	

	public static void main(String[] args) {
		
		Map<Student, String> map = new TreeMap<>();
		
		map.put(new Student(1, "Ram", 8), "Maharashtra");
		map.put(new Student(2, "Ganesh", 9), "Krnataka");
		map.put(new Student(3, ",Mahesh", 7), "TamilNadu");
		map.put(new Student(4, "Raj", 10), "UP");
		
		Set<Map.Entry<Student, String>> entries = map.entrySet();
	   
		for(Map.Entry<Student, String> entry : entries) {
			System.out.println(entry);
		}


	}
	
	


}
