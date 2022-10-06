package Question3;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Question2.Student;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student(1, "Ganesh", 600),
				new Student(5, "Akash", 876),
				new Student(4, "Tarun", 802),
				new Student(6, "Rajesh", 900),
				new Student(2, "Mangesh", 999)
				);
//		 List<Employee> employees = list.stream().map(students -> new Employee(students.getRollNo(), students.getName(), students.getMarks())).collect(Collectors.toList());
		
		
		List<Employee> employees = list.stream().map(students -> new Employee(students.getRollNo(),students.getName(),students.getMarks())).collect(Collectors.toList());
		  for(Employee emp : employees) {
			  System.out.println(emp);
		  }
		
		

	

	}

}
