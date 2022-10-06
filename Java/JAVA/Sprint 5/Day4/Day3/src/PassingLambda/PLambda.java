package PassingLambda;

public class PLambda {

	public static void main(String[] args) {

		System.out.println(passLambda(10, 10, (a, b) -> a+b ));
		
		System.out.println(getOut("Suyash ", name -> name));
		
	}
	
	public static String getOut(String name , OneMore lambda ) {
		
		return lambda.getString(name);
		
	}
	
	public static int passLambda(int a,int b, PassingLambda lambda) {
		
		return lambda.getSum(a, b);

	}

}

@FunctionalInterface
interface OneMore {
	
	abstract String getString(String name);
}

@FunctionalInterface

interface PassingLambda {
	
	abstract int getSum(int a ,int b);
}
