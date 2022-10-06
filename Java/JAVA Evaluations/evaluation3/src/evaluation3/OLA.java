package evaluation3;

public class OLA {
	
	Car car1 = new Car();
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		car1.numberOfPassenger = numberOfPassenger;
		car1.numberOfKms = numberOfKMs;

		
		
		if(numberOfPassenger <= 3) {
			
			return new  HatchBack();
			
		}else {

			return new  Sedan();
			
		}
		
	}
	
	
	public int calculateBill(Car car) {
		
		
		
		if(car instanceof HatchBack) {
			
			HatchBack back =  new HatchBack();
			int TotalFare = car1.numberOfKms*back.farePerKm;			
			return TotalFare;
		}
		
		else{
			
			Sedan sedan =  new Sedan();
			int TotalFare = car1.numberOfKms*sedan.farePerKm;
			return TotalFare;
		}



		
	}


}
