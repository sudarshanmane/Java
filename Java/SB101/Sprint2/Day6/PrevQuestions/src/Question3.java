
public class Question3 {
	

	
	public static void main(String[] args) {
		
		
		Thread thread =  new Thread(() -> {
			
			
			for(int a = 1;a<=20;a++) {
				
				if(a%2 == 0) {
					System.out.println(a);
				}
				
			}
		});
		
        Thread thread1 =  new Thread(() -> {
			
			
			for(int a = 1;a<=20;a++) {
				
				if(a%2 == 1) {
					System.out.println(a);
				}
			}
		});
        
        
	}

}






