package com.masai;

public enum Item {
	
	SUGAR,SALT,PEN(10),PENCIL(5); 
	
	int price;
	

	private Item() {
		
		this.price = 20;
	}
	
	private Item(int price) {
		
		this.price = price;
	}
	 
   public int getPrice() {
	   
	   return this.price;
   }
	

}
