package Question4;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		
		Map<Student, String> st = new TreeMap<>(new StudentMarks());
		
		Scanner sc = new Scanner(System.in);
		
	
		
//		for(int a = 0;a<3;a++) {
//			
//			
//			System.out.println("Enter the name ");
//			String name = sc.next();
//			
//			System.out.println("Enter roll");
//			int roll = sc.nextInt();
//			
//			System.out.println("Enter marks");
//			int marks = sc.nextInt();
//			
//			System.out.println("enter State name ");
//			String state = sc.next();
//			
//			Student student = new Student(roll, name, marks);
//			
//			st.put(student, state);
//			
//		}
//		
//		Set<Map.Entry<Student, String>> set = st.entrySet();
//		
//		set.forEach(printDetails -> System.out.println(printDetails.getKey() + " ---- " + printDetails.getValue()));

	}

}
