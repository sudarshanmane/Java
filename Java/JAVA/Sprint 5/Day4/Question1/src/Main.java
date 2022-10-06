import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {		
		
		
		ArrayList<Product> pr = new ArrayList<>();
			
		Scanner sc  = new Scanner(System.in);
		
		for(int a = 0;a<4;a++) {
			
			System.out.println("Enter productId (int) ");
			int  productId = sc.nextInt();
			
			System.out.println("Enter productName (String)");
			String  productName = sc.next();
			
			System.out.println("Enter productPrice (double)");
			double productPrice = sc.nextDouble();
			
			pr.add(new  Product( productName,  productPrice, productId));
			 
		}
		
		

		System.out.println("Enter 1 for sorting the product according to the productPrice  ");
		System.out.println("Enter 2 for sorting the product according to the productName  ");
		System.out.println(" Enter 3 for sorting the product according to the productId  ");

		int num = sc.nextInt();
		if(num == 1) {

			TreeSet<Product> pr1 = new TreeSet<>(new ProductPrice());	
			
			for(Product prs : pr) {
				pr1.add(prs);
			}
			
			System.out.println(pr1);
			System.out.println("Sorted according to price");
			
		}else if(num == 2) {

			TreeSet<Product> pr1 = new TreeSet<>(new productName());	
			
			for(Product prs : pr) {
				pr1.add(prs);
			}
			
			System.out.println(pr1);
			System.out.println("Sorted according to Name");
			
		}else {

			TreeSet<Product> pr1 = new TreeSet<>(new productId());	
			
			for(Product prs : pr) {
				pr1.add(prs);
			}
			
			System.out.println(pr1);
			System.out.println("Sorted according to Product ID");
			
		}
		
	
		
		
	}
	

}
