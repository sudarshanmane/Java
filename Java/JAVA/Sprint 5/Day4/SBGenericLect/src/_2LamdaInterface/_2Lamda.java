package _2LamdaInterface;

public class _2Lamda {
	
	public static void main(String[] args) {
	
		MyInterface interface1 = (a, b) ->{ 
			return a+b ;
		};
		
		System.out.println(interface1.add(2, 25));
		
		
	}

}

@FunctionalInterface

interface MyInterface {
	
	abstract int add(int a,int b);
	
};


