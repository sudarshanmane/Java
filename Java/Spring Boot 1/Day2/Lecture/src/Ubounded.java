import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ubounded {
	
//	unbounded wildCards;
	
//	public static void fun1(List<?> l) {
//		System.out.println(l);
	
//	for(Object obj : l) {
//		System.out.println(l);
//	}
//		
//	}
//	
//	public static void main(String[] args) {
//		
//		fun1(Arrays.asList(1,2,3,4,5));
//		
//	}
	
//	upperboundWildCard
	

	public static void fun1(List<? extends Number> l) {
	
	for(Object obj : l) {
		System.out.println(obj);
	}
		
	}
	
	public static void main(String[] args) {
		
		fun1(Arrays.asList(1,2,3,4,5));
		fun1(Arrays.asList(1.04,2,3,4,5));

		
	}
	
	
	
	

	
	
}
