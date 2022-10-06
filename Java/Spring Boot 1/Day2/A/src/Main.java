import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	public static List<? extends Number> getList(List<? extends Number> l){
		
		return l;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the list");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements");
		
		List<Integer> integers = new ArrayList<>();
		
		for(int a = 0 ; a<n;a++) {
			int el = sc.nextInt();
			integers.add(el);
		}
		
		List<? extends Number> integers2 =  getList(integers);
		
		System.out.println(integers2);
		
		
		
		
		
		
	}
	
}
