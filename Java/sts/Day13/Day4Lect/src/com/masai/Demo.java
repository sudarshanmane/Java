package com.masai;

import java.util.Scanner;

public class Demo {
	
	
//	public static int add(int...nums ) {
//		
//		int result =0;
//		for(int num : nums) {
//			result += num;
//		}
//		
//		return result;
//		
	
	
//	}
	
	
	public void printCity(City city) {
		
		if(city != null) {
			
			city.message();
			
		}
		else {
			System.out.println("Invlid city");
		}
		
		return ;
		
	}
	
	static void  check(CityNew cityNew) {

		cityNew.checkName(cityNew);
	}
	public static void main(String[] args) {
//    	int[] arr  = {1,3,5};
//    	int res = add(arr);
//    	System.out.println(res);
    	
    	
//    	Month m = Month.APRIL;
//    	Month month = Month.JAN;
//    	System.out.println(m);
//    	
//    	Month[] mr = Month.values();
//    	
//    	for(Month m1 : mr) {
//    		System.out.println(m1);
//    	}
//    	
//    	Item item =  Item.PEN;
//    	
//    	System.out.println(item.getPrice());
//    	City[] items = City.values()/\;
//    	
//    	for(City city:items ) {
    		
//    		city.message();
    		
//    	}
    
//    	Demo demo = new Demo();
//    	
    	Scanner input = new Scanner(System.in);
//    	
//    	System.out.println("Enter the city name");
//    	String name = input.nextLine();
//    	
//          City city = City.valueOf(name.toUpperCase()) ;
//    
//          demo.printCity(city);
    	
//    	
//    	CityNew[] city = CityNew.values();
//    	
//    	for(CityNew name : city) {
//    		
//    		name.checkName(name);    	
//    		
//    	}.
		
		CityNew cityNew  = CityNew.LATUR;
  
		 String cityName = input.next();
		 CityNew cityOne = CityNew.valueOf(cityName.toUpperCase());
		 
		 check(cityOne);
		 
		 
		 
		 
	}


}
