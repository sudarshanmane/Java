package _2LamdaInterface;

public class LamdaLastOne {
	
	public static void main(String[] args) {
		
		LastOne lastOne = ()-> System.out.println("Hello There");
		lastOne.hello();
		
	}
	

}

@FunctionalInterface
interface LastOne{
	
	abstract void hello();
}