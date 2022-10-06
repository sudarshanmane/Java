package LamdaExpressions;

public class FunctionalnterfaceDemo {
	
	
	public static void main(String[] args) {
		MyInterface interface1 = new MyClass();
		
//		interface1.sayHellow("Ashok");
		
//		MyInterface anonymousWay = new MyClass() {
//			
//			@Override
//			public void sayHellow(String name) {
//				System.out.println("Welcome " + name );
//				
//			}
//			
//		};
//		
//		anonymousWay.sayHellow("Akash");
//		
		
//		MyInterface lamdaWay = (String name) ->
//		{
//			System.out.println("welcome " + name);
//			System.out.println("welcome again ");
//		};
//		
//		lamdaWay.sayHellow("one");
		
		MyInterface lamdaWayWithoutDataType = name ->
		{
			System.out.println("welcome " + name);
			System.out.println("welcome again ");
		};
		
		lamdaWayWithoutDataType.sayHellow("one");
		
		
	
	}
	
}

@FunctionalInterface

interface MyInterface{
	
	abstract  void sayHellow(String name);	
	
	
	
}

class MyClass implements MyInterface{

	@Override
	public void sayHellow(String name) {
		System.out.println("Welcome " + name );
		
	}
	
}

