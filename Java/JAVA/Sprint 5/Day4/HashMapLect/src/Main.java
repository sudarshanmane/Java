import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
//		HashMap<Integer, String> hm  = new HashMap<>();
//		hm.put(1,"one");
//		hm.put(2,"two");
//		hm.put(3,"three");
//		System.out.println(hm);

//		Set<Integer> s = hm.keySet();
//		System.out.println(s);
//		
//		Collection<String> col = hm.values();
		
//		for(String st : col) {
//			System.out.println(st );
//		}
//		
//		Set<Map.Entry<Integer,String>> set = hm.entrySet();
//		
//		for(Map.Entry<Integer, String> me : set) {
//			System.out.println(me.getKey() + "-----" + me.getValue());
//		}.
		
//		HashMap<Integer, String> hm = new HashMap<>();
//		hm.put(1, "one");
//		hm.put(2, "two");
//		hm.put(3, "three");
//		hm.put(4, "four");
//		
//		System.out.println(hm);
//		
//		Set<Integer> set = hm.keySet();
//		System.out.println(set);
//		
//		
////		Set<Entry<Integer, String>> st = hm.entrySet();
//		
//		for(Map.Entry<Integer, String> me : hm.entrySet()) {
//			System.out.println(me.getValue() + "----" + me.getKey());
//		}
		
		
		HashMap<String,Student> hm = new  HashMap<>();
		hm.put("mumbai", new Student(1, "a", 1000));
		hm.put("Pune", new Student(2, "b", 1000));
		
		
		Set<Map.Entry<String, Student>> set = hm.entrySet();
		
		for(Map.Entry<String, Student> me : set) {
			System.out.println( "City"+ me.getKey() );
		
			Student student = me.getValue();
			
			
			System.out.println("roll : "+ student.getRoll());
			System.out.println("name : "+ student.getName());
			System.out.println("Marks : "+ student.getMarks());
			System.out.println("-------------");

		}


		
		

		
		
		
		


	}

}
