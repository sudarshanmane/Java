package Question4;

public class Main {

	
	public static void main(String[] args) {
		
		MyGen<Student> gen = new  MyGen<Student>(new Student(0, "one", 0));
		System.out.println(gen.getData());
		
		
//	MyGen<String> gen2 = new  MyGen<String>("one");
//	System.out.println(gen2.getData());
	}
}
