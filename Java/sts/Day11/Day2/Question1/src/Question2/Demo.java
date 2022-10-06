package Question2;

import java.util.Scanner;


public class Demo {
	
	public Hotel provideFood(int amount) {
		
		Hotel hotel = null;
		
		if(amount>1000) {
			hotel = new TajHotel();
		}else if(amount>200 && amount<1000){
		
			hotel = new RoadSideHotel();
		 }
		
		
		return hotel;
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount");
		int amonutProvided = input.nextInt();
		
		if(amonutProvided>200) {
			
         Demo demo = new Demo();
        Hotel hotel =  demo.provideFood(amonutProvided);
        if(hotel instanceof TajHotel) {
        	
        	hotel.chickenBiryani();
        	hotel.masalaDosa();
        	
        	TajHotel tajHotel = (TajHotel) hotel;
        	tajHotel.welcomeDrink();
     
        	
        }else if(hotel instanceof RoadSideHotel){
        	hotel.chickenBiryani();
        	hotel.masalaDosa();
        }
       
       
			
		}
		else {
			System.out.println("Please Enter a valid amount");
		}
		
		
		
	}

}
