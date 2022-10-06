import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		
		ArrayList<Product> arrayList = new ArrayList<>();
		arrayList.add(new Product(1, "A", 5));
		arrayList.add(new Product(1, "C", 1));
		arrayList.add(new Product(1, "B", 3));
		arrayList.add(new Product(1, "D", 4));
		
		TreeSet<Product>  products = new  TreeSet<>(new ProductName());
		for(Product product: arrayList) {
			products.add(product);
		}
		
		System.out.println(products);
		
		
		
		

		
		
		
		
	}

}
