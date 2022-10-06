package Question8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		
		List<Student> list = Arrays.asList(
				new Student(1,"one",500),
				new Student(5,"Two",400),		
				new Student(4,"ffd",700),		
				new Student(3,"aa",900));
		
		List<Employee> employees = list.stream().map(items ->  new Employee(items.getRoll(), items.getName(), items.getMarks())).collect(Collectors.toList());
		
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
		
	}



}
