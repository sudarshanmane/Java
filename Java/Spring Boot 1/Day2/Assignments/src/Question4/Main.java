package Question4;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import Question2.Student;

public class Main {
	
	public static Map<String, Student> sortMap(Map<String, Student> hashMap2){
		
		
		List<Map.Entry<String, Student>> list = new LinkedList<>(hashMap2.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Student> >() {
            public int compare(Map.Entry<String, Student> o1,
                               Map.Entry<String, Student> o2)
            {
                if (o1.getValue().getMarks()>o2.getValue().getMarks()){
                    return +1;
                }else {
                	return -1;
                }
                
            }
        });
		
//		Map<Student , String> map2 = new TreeMap<Student, String>();
//		
//		Set<Map.Entry<String, Student>> entries  = hashMap2.entrySet();
//		
//		for(Map.Entry<String, Student> entry : entries) {
//			map2.put(entry.getValue(), entry.getKey());
//			
//		}
//		
//		LinkedHashMap<String,Student> hashMap = new LinkedHashMap<>();
//		
//		Set<Map.Entry<Student, String>> entries2 = map2.entrySet();
//		
//		for(Map.Entry<Student, String> entry : entries2) {
//			
//			hashMap.put(entry.getValue(), entry.getKey());
//			
//		}
		 Map<String, Student> temp = new LinkedHashMap<String, Student>();
		 
		 
	        for (Entry<String, Student> aa : list) {
	            temp.put(aa.getKey(), aa.getValue());
	        }
	        return temp;
		
	
	}
	
	
	public static void main(String[] args) {
		
		Map<String, Student> hashMap = new HashMap<>();
		
		hashMap.put("Maharashtra", new Student(1, "Ram", 8));
		hashMap.put("Krnataka" , new Student(2, "Ganesh", 9));
		hashMap.put("TamilNadu", new Student(3, ",Mahesh", 7));
		hashMap.put("UP", new Student(4, "Raj", 10));
		
		
		Map<String, Student> hashMap2 = sortMap(hashMap);
		
		Set<Map.Entry<String, Student>> entries = hashMap2.entrySet();
		
		for(Map.Entry<String, Student> entry : entries) {
			System.out.println(entry.getKey() + " ------ > " + entry.getValue());
		}

	}
	
	
	

}
