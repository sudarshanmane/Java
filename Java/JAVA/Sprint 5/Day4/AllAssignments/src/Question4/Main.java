package Question4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		Map<Student , String> st = new TreeMap<>(new StudentMarks());
		
		st.put(new Student(101, "sdfg", 635), "Pune");
		st.put(new Student(102, "kjh", 425), "Mumbai");
		
		Set<Map.Entry<Student,String>> data = st.entrySet();
		
		for(Map.Entry<Student, String> sts : data) {
			System.out.println(sts.getValue() + "----" + sts.getKey());
		}
		
		Set<Map.Entry<Student, String>> s = st.entrySet();
		
		for(Map.Entry<Student, String> sts : s )
		{
			}
		}

}
