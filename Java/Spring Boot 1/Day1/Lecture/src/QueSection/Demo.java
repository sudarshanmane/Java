package QueSection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo {
	
	public static void main(String[] args) {
//		
//		Queue<Integer> integers = new  PriorityQueue<>();
//		
//		integers.add(10);
//		integers.add(14);
//		integers.add(12);
//		integers.add(13);
//		
//		Integer i1;
//		
//		while( (i1 = integers.poll()) != null) {
//			System.out.println(i1);
//		}
		
		
//		Queue<Student> integers = new  PriorityQueue<>(new SQue());
//		
//		integers.offer(new Student(1, "a", 10));
//		integers.add(new Student(1, "a", 8));
//		integers.add(new Student(1, "a", 7));
//		integers.add(new Student(1, "a", 9));
//
//		Student i1;
//		
//		while( (i1 = integers.poll()) != null) {
//			System.out.println(i1);
//		}
		
		
       Queue<Student> integers = new  LinkedList<>();
		
		integers.offer(new Student(1, "a", 10));
		integers.add(new Student(1, "a", 8));
		integers.add(new Student(1, "a", 7));
		integers.add(new Student(1, "a", 9));

		Student i1;
//		
//		while( (i1 = integers.poll()) != null) {
//			System.out.println(i1);
//		}
		
		Iterator<Student> iterator = integers.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		
		
	}

}
