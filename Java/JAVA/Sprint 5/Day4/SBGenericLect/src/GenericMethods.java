
public class GenericMethods {
	
	
	public static void main(String[] args) {
		
		Integer[] i = {1,2,3,4,5,6};
		printArray(i);
		
		Character[] c = {'a','b','c'};
		printArray(c);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static <E> void printArray(E[] elements) {
		
		for( E ele : elements) {
			System.out.println(ele);
			
		}
	}

}
