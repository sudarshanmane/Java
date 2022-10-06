package ExceptionHandling;

public class Demo {

	public static void main(String[] args) {

		System.out.println("Start of main");
		
		try {
		
			int x = 100;
			String y = "11";
			
			int z = x/Integer.parseInt(y);
		
			System.out.println("x/y is : "+ z);
			
			A a = null;
			
			if(z==10) {
				a = new A(); 
				a.message();
				
			}else {
				a.message();
				
			}
			
		}catch(Exception e) {
			System.out.println("inside Exception ");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
		
		
		
		
		System.out.println("End of main.....");

	}

}
