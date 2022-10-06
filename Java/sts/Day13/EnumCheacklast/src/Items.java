
public enum Items {
	
	SUGAR,PEN(20),SOAP(100),FACEPACK(153),MILK;
	
	
	int price ;
	
	
	private Items(){
	  this.price = 50;
		
	}
	
	private Items(int price) {
		this.price = price;
	}
	
	
	void message(Items item) {
		
		System.out.println("Price of " + item + " is " + this.price);
	}

}
