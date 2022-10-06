package productId;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	
	public static void main(String[] args) {
		

		PriorityQueue<Product> priorityQueue = new PriorityQueue<>();
		
//		PriorityQueue<Product>  priorityQueue = new PriorityQueue<>();
		
		priorityQueue.add(new Product(1, "One", 100));
		priorityQueue.add(new Product(2, "Four", 99));
		priorityQueue.add(new Product(3, "Three", 10));
		priorityQueue.add(new Product(4, "Two", 88));
		
		System.out.println(priorityQueue);
		
		List<Product> list = new  LinkedList<>();
		
		Product product ;
		
		while((product = priorityQueue.poll()) != null) {
			
			list.add(product);
			
		}
		
		Iterator<Product> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		

		
	}
		

}
