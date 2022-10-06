package PassingLambda;

public class PassingLam {
	
	public static void main(String[] args) {
		
		Calculate c = (a, b) ->  a+b;
		
Calculate c1 = (a, b) -> a-b;
		System.out.println(c1.calculate(10, 5));
	 
		System.out.println(getOutput(10, 20,(a, b) -> a+b));
		System.out.println(
				getOutP(10, 20, 30, (a, b, f) -> a+b+f)
				
				);
	}
	
	public static int getOutput(int a, int b , Calculate operation) {
		
		return operation.calculate(a, b);
	}
	
	
	public static int getOutP(int a ,int b,int c, Calculator ope) {
		
		return ope.calculate(a, b, c);
		
		}
	

}


    @FunctionalInterface
    
    interface Calculate {
    	
    	public int calculate(int a, int b);
	}
    


    @FunctionalInterface
    
    interface Calculator {
    	
    	public int calculate(int a, int b,int c);
	}

