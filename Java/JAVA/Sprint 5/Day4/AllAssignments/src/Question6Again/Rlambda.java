package Question6Again;

public class Rlambda {

	public static void main(String[] args) {
		
		System.out.println(getSum(10, 20, 30, (a, b, c) -> a+b+c));
		getSum1().sum1(0, 0, 53);
		

		
	}
	
	public static int getSum(int a ,int b,int c, Calculator calculator) {
		return calculator.sum(a, b, c);
	}
	
	public static Calculator1 getSum1() {
		
		return (a, b, c) -> System.out.println(a+b+c);

	}
}

interface Calculator{
	int sum(int a, int b,int c);
}


interface Calculator1{
	void  sum1(int a, int b,int c);
}


