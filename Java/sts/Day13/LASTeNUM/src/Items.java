
public enum Items {
	
	
	SOAP(60),BOTTLE,FACEPACK(153),PEN,BEARDO(250);
	
	int price ;
	
	private Items() {
		this.price = 20;
	}

	private Items(int price ) {
		this.price = price;
	}
	
	
	void message(Items items) {
        System.out.println("Price of the " + items + " is  : " + this.price);
        
	}
	
	
	
}
