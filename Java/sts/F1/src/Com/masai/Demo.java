package Com.masai;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		
		if(amount>1000){
			return new TajHotel();
		}else if(amount>200 && amount<=1000){
			return new RoadSideHotel();
		}else {
			return null;
		}
		
	};
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount");
		int amount = input.nextInt();
		
		Demo d  = new Demo();
		
		Hotel hotel = d.provideFood(amount);
		if(hotel instanceof TajHotel) {
			
			hotel.chickenBiryani();
			hotel.masalaDosa();
			
		    TajHotel tajHotel = (TajHotel) hotel;
		    tajHotel.welcomeDrink();
					
		}else if(hotel instanceof RoadSideHotel) {
			hotel.chickenBiryani();
			hotel.masalaDosa();
			
		}else{
			System.out.println("Please Enter a valid amount");
		}
		
		
		
		
		

	}

}
