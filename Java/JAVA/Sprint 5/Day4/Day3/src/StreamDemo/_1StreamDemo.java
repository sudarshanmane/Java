package StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _1StreamDemo {

	public static void main(String[] args) {

		
		List<Integer> i= Arrays.asList(1,2,3,4,5,6,7,8,9); 
		Stream< Integer> s = i.stream();
		
		
		i.stream().filter(item -> item%2==0).forEach(items -> System.out.println(items));
		
		
	}

}
