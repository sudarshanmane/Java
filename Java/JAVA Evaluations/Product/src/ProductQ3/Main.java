package ProductQ3;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		Map<Student,Integer> arg = new  TreeMap<>();
		
		arg.put(new Student(1, "b", 1) , 100);
		arg.put(new Student(2, "a", 2) , 120);
		arg.put(new Student(1, "c", 1) , 130);
		
		
		Set<Map.Entry<Student, Integer>> entries = arg.entrySet();
		
		entries.forEach(item -> System.out.println(item.getKey()));
		
		
		
		
		
		
		
	}
}
