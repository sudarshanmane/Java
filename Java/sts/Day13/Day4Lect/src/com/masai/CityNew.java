package com.masai;


public enum CityNew {
	
	PUNE("PU"){
		
		@Override
		public void checkName(CityNew name) {
			
			System.out.println("Pune " + " short form is smfnvjdsfnvjds : " + shortN);
			
		}
		
		
	},MUMBAI("MUM"),OMERGA("OME"),LATUR("LTR"),OSMANABAD("OSMA");
	
	String shortN ;
	
	private CityNew(String shortName) {
		
		this.shortN = shortName;

	}


	public void checkName(CityNew name) {
		
		System.out.println(name + " Short form is : " + this.shortN);
	}
	
	


}
