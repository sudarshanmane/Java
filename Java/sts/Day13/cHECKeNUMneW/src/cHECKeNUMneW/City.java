package cHECKeNUMneW;

public enum City {
	
	PUNE{
		
		@Override
		void message(City city) {
			System.out.println("I am from pune Override");
		
		}
		
	},MUMBAI("M"),KOLKATTA("K"),CHENNAI("C"),OSMANABAD("O"),LATUR("L");
	
	String shName ;
	
     private City() {
    	 this.shName = "PU";
     }
     
     private City(String name ) {
    	 this.shName = name;
     }
     
     
     void message(City city) {
    	 
    	 System.out.println( city + " First Char is : " +this.shName );
    	 
    	 
     }
    
     
     
	
     
     
	

}
