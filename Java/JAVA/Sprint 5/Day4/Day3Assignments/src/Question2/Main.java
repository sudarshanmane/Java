package Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		
				List<Student> list = Arrays.asList(
						new Student(1, "Ganesh", 600),
						new Student(5, "Akash", 876),
						new Student(4, "Tarun", 802),
						new Student(6, "Rajesh", 900),
						new Student(2, "Mangesh", 999)
						);
				
				
				List<Student> list2 = list.stream().filter(students -> students.getMarks()>800).collect(Collectors.toList());		
			
				list2.forEach(students -> System.out.println(students));

	}

}
