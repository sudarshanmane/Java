
public class Demo {
	
	public int getPension(int age, int salary)throws ArithmeticException {
		int pension = 0 ;
	if(age>40 &&age<100) {
		pension = (age*salary)/100;
	}else {
//		ArithmeticException ae =  new ArithmeticException("Invalid Age");
//		throw ae;
		
		InvalidAgeException iae = new  InvalidAgeException("Invalid Age");
	
	}
	return pension;
	}

	public static void main(String[] args) {
		
		
		Demo demo = new Demo();
		
		try { 
			
			int pension = demo.getPension(10, 80);
			System.out.println(pension);
			

		}catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		
		

	}

}
