package Question6;

public class RunLambda {

	
	public static void main(String[] args) {
		getOutPut().calculate(10, 30, 50);
		getSub().substraction(10, 10, 20);		
	}
	
	public  static Sub getSub() {
		return (a, b, c) ->  System.out.println(a*b+a-b+ c * a );
	}
	
	
	public static Calc getOutPut() {
		return (a, b, c) -> System.out.println(a+b+c);
	}
}


interface Calculaters{
	void sumAgain(int a,int b, int c);
}


interface Sub{
	void substraction(int a,int b,int c);
}


interface Calc{	
	void calculate(int a,int b,int c);
}
