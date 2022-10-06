package Question7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student(1,"one",500),
				new Student(5,"Two",400),		
				new Student(4,"ffd",700),		
				new Student(3,"aa",900));
		
		Set<Student> set = new TreeSet<Student>(new StudentRoll());
		
		for(Student data : list) {
			set.add(data);
		}
		
		List<Student> list2 =  set.stream().filter(items -> items.marks>500).collect(Collectors.toList());	
		
		for(Student student : list2) {
			System.out.println(student);
		}
		
		
		
	
		
	}

}
