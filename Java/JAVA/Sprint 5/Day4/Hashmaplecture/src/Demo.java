import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		
		Map<String, Integer> nameToRating = new HashMap<>();
		
		nameToRating.put("TopGun", 10);
		nameToRating.put("TopGun", 10);
		nameToRating.put("TopGun", 9);
		nameToRating.put("TopGun", 9);
		
//		nameToRating.remove("TopGun");
		
		nameToRating.put("RRR",10);
//		nameToRating.clear();
		
		
//		System.out.println(nameToRating.get("RRR"));
//		System.out.println(nameToRating);
//		System.out.println(nameToRating.containsKey("RRR"));
//		System.out.println(nameToRating.containsValue(9));
//		
//		System.out.println(nameToRating.keySet());
//		System.out.println(nameToRating.values());
		
//		Set<String> keySet  = nameToRating.keySet();
		
//		for(String key : keySet) {
//			System.out.println( key + "----" + nameToRating.get(key));
//		}

		
//		Set<Map.Entry<String, Integer>> entrySet = nameToRating.entrySet();
		
		
//		for(Map.Entry<String, Integer> entr : entrySet) {
//			System.out.println(entr.getKey() + "----" + entr.getValue());
//		}
//		
//		entrySet.forEach(entry -> System.out.println(entry.getKey()+ " ------> " + entry.getValue()));
		
		
//		Map<String, Integer> mp = new TreeMap<>();
//		mp.put("ZopGun" , 7);
//		mp.put("RRR", 10);
//		mp.put("AA", 8);
//		
////		System.out.println(mp);
//		
//		Set<String> mp1 = mp.keySet();
//		System.out.println(mp1);
//		
//		for(String mps : mp1) {
//			System.out.println(mps + "----" + mp.get(mps));
//		}
		
//		Set<Map.Entry<String, Integer>> one = mp.entrySet();
//		
//		for(Map.Entry<String, Integer> me : one) {
//			System.out.println(me.getKey() + "-----"+ me.getValue());
//			
//		}
//	
//		
//		Set<Map.Entry<String,Integer>> smp = mp.entrySet();
//		
//		smp.forEach(emps -> System.out.println(emps.getKey() + " --- " + emps.getValue())  );
//		
//		
		
		Map<Student,Integer> st = new TreeMap<>(new StdentComparator());
		
		Student s1 = new Student(101, "B");
		Student s2 = new Student(102, "A");
		
		st.put(s1,6);
		st.put(s2,3);
		
		System.out.println(st);


		
		
		
		
		
		
		
	
		
	}

}

class Student {
	
	int marks;
	String name;
	
	
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}


}


class StdentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {

        if( o1.marks > o2.marks)
     	   return +1;
        else
     	   return -1;
	
	

	
	
}
	
}
