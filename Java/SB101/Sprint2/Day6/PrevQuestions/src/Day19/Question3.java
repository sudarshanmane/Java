//package Day19;
//
//import java.util.Map;
//import java.util.Set;
//import java.util.TreeMap;
//
//public class Question3 {
//	
//	public static void main(String[] args) {
//		
//		Map<Student, String> map = new TreeMap<>( );
//		
//		map.put(new Student(101, "one", 99), "a");
//		map.put(new Student(102, "five", 100), "b");
//		map.put(new Student(103, "fout", 94), "c");
//		map.put(new Student(104, "three", 95), "d");
//		
//		Set<Map.Entry<Student, String>> entries = map.entrySet();
//		
//		for(Map.Entry<Student, String>  entry : entries) {
//			System.out.println(entry.getKey() + " ---- " + entry.getValue());			
//		}
//		
//		
//		
//		
//		
//		
//		
//	}
//	
//	
//	
//}
//
//class Student implements Comparable<Student>{
//	
//	private int roll;
//	private String name;
//	private int marks;
//	public int getRoll() {
//		return roll;
//	}
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getMarks() {
//		return marks;
//	}
//	public void setMarks(int marks) {
//		this.marks = marks;
//	}
//	
//	
//	@Override
//	public String toString() {
//		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
//	}
//	
//	
//	public Student(int roll, String name, int marks) {
//		super();
//		this.roll = roll;
//		this.name = name;
//		this.marks = marks;
//	}
//	@Override
//	public int compareTo(Student o) {
//		if(this.getMarks() > o.getMarks())
//		return +1;
//		else 
//			return -1;
//	}
//	
//	
//	
//	
//}
