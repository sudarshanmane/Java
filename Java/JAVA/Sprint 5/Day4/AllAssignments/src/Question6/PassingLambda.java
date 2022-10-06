package Question6;

public class PassingLambda {

	public static void main(String[] args) {
//		
//		System.out.println(getOutput(10,10,10,(a, b, c) -> a+b+c));
//	
//		System.out.println(getOutCome(10, 2, 2, (a, b, c) -> a-b-c));
		
		System.out.println(sum11(10, 30, 20, (a, b, c) -> a+b+c));
		
		
		System.out.println(pass12().sum1(10, 20, 20));
		

	}
	
     public static int getOutput(int a, int b,int c,Calculator operation) {
    	 
    	 return operation.getOutput(a, b, c);
    	 
	}
     
     public static int getOutCome(int a,int b,int c,Calculator substraction) {
    	 
    	 return substraction.getOutput(a, b, c);
     }

     public static int sum11(int a ,int b,int c ,Pass1 pass1) {
    	 return pass1.sum1(a, b, c);
     } 
     public static Pass1 pass12() {
    	 return (a, b, c) -> a+b+c;
     }
}


interface Pass1{	
	int sum1(int a ,int b,int c);
}

interface Calculator{
	 int getOutput(int a, int b,int c);
}