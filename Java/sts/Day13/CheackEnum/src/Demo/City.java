package Demo;

public enum City {
	
	PUNE,MUMBAI("MB"),KOLKATTA("Kol"),CHENNAI("CHE"),BANGLORE("BangL");
	
	String sh;
	
	private City() {
		
		this.sh = "pu";
	}
	
	private City(String sh) {
		this.sh = sh;
	}
	
	
	void message(City city) {
		System.out.println(city + " Short Form is " + this.sh);
	}

}
