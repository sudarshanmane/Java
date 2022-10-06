package Question1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		List<Product> prs = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int a = 0;a<3;a++) {
			System.out.println("id");
			int id = sc.nextInt();
			
			System.out.println("name");
			String name = sc.next();
			
			System.out.println("productPrice");
			double price = sc.nextDouble();
			
			Product pr = new Product(id, name, price);
			prs.add(pr);
			
		}
		
		System.out.println("Enter 1 or 2 or 3");
		int num = sc.nextInt();
		
		if(num==1) {
			Set<Product> price =  new TreeSet<>(new ProductPrice());
			
			for(Product pr : prs) {
				price.add(pr);
			}
			
			System.out.println(price);
			
		}else  if(num==2) {
			
			Set<Product> name =  new TreeSet<>(new productName());
			
			for(Product pr : prs) {
				name.add(pr);
			}
			System.out.println(name);
		}else {
			
			Set<Product> id =  new TreeSet<>(new ProductD());
			
			for(Product pr : prs) {
				id.add(pr);
			}
			
			System.out.println(id);
		}
	}

}
