import java.util.ArrayList;
import java.util.Iterator;

public class TransverseArrayList {
	
    public static void main(String[] args)
    {
        ArrayList<String> strings = new ArrayList<>();
        
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("three");
        strings.add("four");
        strings.add("five");
        strings.add("six");
        
//        using iterator
        Iterator<String> it = strings.iterator();
        
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
//        using for loop
        for(int a = 0;a<strings.size();a++) {        
        	System.out.println(strings.get(a));
        }
        

//      using enhanced for loop
        
      for(String str : strings) {        
      	System.out.println(str);
      }
        
 
    }
}
   
