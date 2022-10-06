package Question1;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student(1, "Ganesh", 200),
				new Student(5, "Akash", 300),
				new Student(4, "Tarun", 400),
				new Student(6, "Rajesh", 499),
				new Student(2, "Mangesh", 350)
				);
		
		Set<Student> set = new TreeSet<>(new StudentsRoll());
		
		for(Student st : list) {
			set.add(st);
		}
		
		List<Student> list2 = set.stream().filter( sts -> sts.marks>250).collect(Collectors.toList());
		list2.forEach(students -> System.out.println(students));

	}

}
