package PassingLambda;

public class ReturnLambda {

	public static void main(String[] args) {
		

		
		returningLambda().sayHellow("one");
		returnMy1().sayBye("Mani");
		returnMulti().multi(10, 10);


	}
	
	public static MyInterface1 returnMy1() {
		
		return name -> System.out.println("Bye " + name);
		
	}
	
	
	public static MyInterface returningLambda() {
		
		MyInterface lambda = name -> System.out.println("Hello " + name);
		
		return lambda;
	}
	
	public static LastTry returnMulti() {
		
		return (a, b) -> System.out.println(a*b);
		
	}

}

interface MyInterface {
	
	abstract void sayHellow(String name);
	
}

interface MyInterface1{
	
	abstract void sayBye(String name);

}

interface LastTry{
	
	abstract void multi(int a,int b);
}
