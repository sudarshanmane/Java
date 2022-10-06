package com.masai;

public enum City {
	DELHI("600 Towers"){
		
		@Override
		public void message() {
			
			System.out.println("Welcome user to delhi...." + "Towers in your area are : " + this.numberOfTowers);
					
		}
	},MUMBAI("500 Towers"),CHENNAI("600 Towers"),KOLKATTA("400 Towers"); 
	
	String numberOfTowers;
	
	City(){
		 
		this.numberOfTowers = "100 Towers";
	}
	
	

	private City(String  numberOfTowers){
		 
		this.numberOfTowers = numberOfTowers;
	}
	
	
	public void message() {
		System.out.println("Welcome user....");
		System.out.println("Towers in your area are : " + this.numberOfTowers);
	}
	
	

}
