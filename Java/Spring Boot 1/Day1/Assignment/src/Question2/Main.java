package Question2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Queue<Product> products = new PriorityQueue<Product>(new ProductPrice());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Products to add");
		
		int n = sc.nextInt();
		
		for(int a = 0;a<n;a++) {
			
			System.out.println("Enter Id");
			int id = sc.nextInt();
			
			System.out.println("Enter Name");
			String name = sc.next();
			
			System.out.println("Enter Price");
			int price = sc.nextInt();
			
			products.add(new Product(id, name, price));


		}
		
		
		List<Product> list = new ArrayList<>();
		
		Product product;
		
		while((product = products.poll()) !=null) {
			
			list.add(product);
		}
		
		
		Iterator<Product> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		


		
		
		
	}

}
