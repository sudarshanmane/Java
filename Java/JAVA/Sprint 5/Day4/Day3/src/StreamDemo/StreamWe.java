package StreamDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWe {
	
	public static void main(String[] args) {
		

//		List<Student> st =  Arrays.asList(new  Student(101, "a", 92)
//				, new Student( 105, "s", 99), new Student( 102, "v", 95));
//	    st.stream().filter(item -> item.getMarks()>95 ).forEach(item -> System.out.println(item.getName()));
//		List<Student> listNew = st.stream().filter(item -> item.getMarks() > 95).collect(Collectors.toList());		
//	
//		
//		List<Student> list = Arrays.asList(new Student(1, "S", 385),
//		new Student(2, "a", 251), new Student(3, "sf", 999),new Student(4, "asd", 754));
//
//		
//		Set<Student> set = new TreeSet<>(new StudentComparator());				
//		list.stream().forEach(item -> set.add(item));
//		
//		List<Student> students = set.stream().filter(item -> item.getMarks()>500).collect(Collectors.toList());
//		 System.out.println(students);
		
		List<String> list1 = Arrays.asList("Mogambo","Aaga","Superman");
		
		List<String> list2 = list1.stream().map(item -> item.toUpperCase()).collect(Collectors.toList());
//		System.out.println(list2);
		
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum = integers.stream()
		  .collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum);
		
	}


}

class Student{
	
	private int roll;
	private String name;
	private int marks;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
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
	
}

class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getMarks()>o2.getMarks())
		return +1;
		else
			return -1;
	}
	
	
}