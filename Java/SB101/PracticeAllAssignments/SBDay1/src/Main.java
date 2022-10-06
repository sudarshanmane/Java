import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		PrintList list = (city -> System.out.println(city));
		
		List<String> one = new ArrayList<>();
		one.add("Pune");
		one.add("Mumbai");
		one.add("Hydrabad");
		one.add("Kolkatta");
			
		list.display(one);

	}

}
