package Question11;

public class OLA {
	
	
	Car obj = new Car();
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs){
		obj.setNumberOfKms(numberOfKMs);
		
		if(numberOfPassenger <= 3) {
			return new HatchBack();
		}
		else {
			
			return new Sedan();
		}
		
		
	}
	public int calculateBill(Car car) {
		
		if(car instanceof HatchBack) {
          HatchBack hatchBack = (HatchBack) car ;
			return obj.getNumberOfKms() * hatchBack.farePerKm;
		}
		else {
			Sedan sedan = (Sedan) car;
			
			return obj.getNumberOfKms() * sedan.farePerKm;
		}
		
	}

}
