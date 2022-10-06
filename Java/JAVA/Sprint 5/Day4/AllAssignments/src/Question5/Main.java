package Question5;

public class Main {
	
	public static void main(String[] args) {
		
		MyGeneric<String> name = new MyGeneric<>();
		name.add("one");
		System.out.println(name.get());
		
		
	}

}
