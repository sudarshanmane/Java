package Question2;

public class Lion {
	
	String name;
	
	boolean isHungry;
	
	int age;
	
	static int totalDeaths;
	
	 static void printKillings() {
		
		System.out.println("Total killings by lions in jungle = "+ totalDeaths);
		
	}
	
	void thinking() {
		
		if(isHungry == false) {
			System.out.println("LionName is sleeping");
		}
		
		else if(isHungry==true && age>12) { 
			
			 totalDeaths =  totalDeaths + 2;
			 
			System.out.println("lionName has eaten two animal");
			
		}
		else if(isHungry==true && age<=12 && age >=2 ) {
			
			 totalDeaths = totalDeaths + 1;
			  System.out.println("lionName  has eaten one animal");
		}
		else if(isHungry==true && age<=2 ) {
			System.out.println("lionName is calling Mom");
		}
				
	}
	
	public static void main(String[] args) {
		
		Lion lion1 = new Lion();
		lion1.isHungry = false;
		lion1.thinking();
		
		Lion lion2 = new Lion();
		lion2.isHungry = true;
		lion2.age = 13 ;
		lion2.thinking();
		
		Lion lion3 = new Lion();
		lion3.isHungry = true;
		lion3.age = 10 ;
		lion3.thinking();
		
		
		Lion lion4 = new Lion();
		lion4.isHungry = true;
		lion4.age = 13;
		lion4.thinking();
		
		printKillings();
		
		
		
		
		
	}
	
	
}
