import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student(101, "one", 101),
				new Student(101, "one",220),
				new Student(101, "one", 251),
				new Student(101, "one", 320));
		
//		List<Student> list2 = list.stream().filter(item -> item.marks>250).
//				collect(Collectors.toList());
		
		List<Employee> lis = list.stream().map(item ->
		new Employee(item.RollNo, item.Name ,item.marks)).collect(Collectors.toList());
		
		System.out.println(lis);
		

	}

}
