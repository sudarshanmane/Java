import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class IntCheck {
	
	
	
	public static void Chararray(String a) {
		
		StringBuilder sb = new  StringBuilder();
		
		char[] ch = a.toCharArray();
		
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		
		for(char ca : ch) {
			lhs.add(ca);
		}
		
		
		for(char h : lhs) {
			sb.append(h);
		}
		System.out.println(sb);
		
//		return sb.toString();
	}

	public static void main(String[] args) {
		
		Chararray("raaataaannn");
//		
//		ArrayList<Integer> i = new ArrayList<>();
//		i.add(10);
//		i.add(20);
//		i.add(30);
//		i.add(40);
//		i.add(50);
//		i.add(60);
//		i.set(2, 25);
//		System.out.println(i.get(2));
//		System.out.println(i.contains(50));

		
//		LinkedList<Integer> i = new LinkedList<>();
//
//		System.out.println(i.get(2));
//		System.out.println(i.contains(50));

//		
//		ArrayList<Integer> i = new ArrayList<>();
//		
//		i.add(10);
//		i.add(20);
//		i.add(30);
//		i.add(40);
//		i.add(50);
//		i.add(40);
//		
//		System.out.println(i);
//		
//		
//		LinkedHashSet<Integer> k = new LinkedHashSet<>(i);
//		i = new ArrayList<>(k);
//		
//		System.out.println(i);
//		
//			

	}

}
