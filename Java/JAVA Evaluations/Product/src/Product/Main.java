package Product;

import java.util.ArrayList;
import java.util.TreeSet;


public class Main {
	
	public static void main(String[] args) {
		
//		ArrayList<Product> arrayList = new ArrayList<>();
		
	    TreeSet<Product> arrayList = new TreeSet<>(new price());	 
	    arrayList.add(new Product(1, "Pawan", 22));
	    arrayList.add(new Product(2, "rawan", 10));
	    arrayList.add(new Product(3, "aawan", 7));
	    arrayList.add(new Product(4, "bawan", 8));
	    
	    System.out.println(arrayList);
	    
	   

	    
		
		

		

		
	}

}
