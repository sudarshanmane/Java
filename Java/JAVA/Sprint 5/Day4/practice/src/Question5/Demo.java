package Question5;

public class Demo {

	public static void main(String[] args) {

		MyGeneric<String> str = new MyGeneric<>();
		str.add("one");
		System.out.println(str.get());
	}

}
