package Q;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Student{
	
	 private int roll;
	 private String name;
	 private int marks;
	 
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	
	
	public static void sortMap(Map<String, Student> map) {
		
		List<Map.Entry<String, Student>> list = new LinkedList<>(map.entrySet());
		
		Collections.sort(list , new Comparator<Map.Entry<String, Student>> () {

			@Override
			public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
				if(o1.getValue().marks > o2.getValue().marks) {
					return +1;
				}
				else return -1;
				
			}
		})
		
	}
	
	 
	
	
	public static void main(String[] args) {
		

		Map<String , Student> map = new TreeMap<>();
		
		map.put("Maharashtra" , new Student(1, "Ram", 8));
		map.put("Krnatakanew" , new Student(2, "Ganesh", 9));
		map.put("TamilNadu" , new Student(3, ",Mahesh", 7) );
		map.put("UP" ,new Student(4, "Raj", 10));
		 
		
		Set<Entry<String, Student>> entries   = map.entrySet(); 
		
		for(Entry<String, Student> entry : entries) {
			System.out.println(entry);
		}
		
	}

	


}
