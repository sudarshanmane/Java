package Question5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WildCards {
	
//1)	Upper Bound Wilcdard : 
//	1)in upper Bounfd wildcard we need to use extend type keyword
//	2) in this we if a class extending another class the we can use the all of the child classes
//     of that extended class/
	
	
	
	
//	example;

//	public static List<? extends Number> getList(List<? extends Number> l){
//		
//		return l;
//		
//	}
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the number of elements in the list");
//		int n = sc.nextInt();
//		
//		System.out.println("Enter the elements");
//		
//		List<Integer> integers = new ArrayList<>();
//		
//		for(int a = 0 ; a<n;a++) {
//			int el = sc.nextInt();
//			integers.add(el);
//		}
//		
//		List<? extends Number> integers2 =  getList(integers);
//		
//		for(Number i : integers2) {
//			System.out.println(i);
//		}
//		
//		
//		
//		
//		
//		
//	}
//	

//2) Lower bound Wildcard;
//   in lower bound wildcard we need to use super and type;
//	in this we can use the only class whisch is the super and its parent class only
	
	
	
   public static void  getList(List<? super  Integer> l){
		
		System.out.println("Inside getList");
		
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
		
		
		
		
		
		
		
	}
	


}
