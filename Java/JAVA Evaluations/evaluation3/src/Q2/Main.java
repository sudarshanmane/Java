package Q2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		

		Scanner sc = new  Scanner(System.in);
		
		System.out.println("num");
		int num = sc.nextInt();
		
		int[] nums = new int[num];

		
		if(num <2) {
			System.out.println("error");
		}else {
			System.out.println("Enter");
			
			
			for(int i = 0;i<num;i++) {
				nums[i] = sc.nextInt();
			}
			
			
			
		}
		
		
		
		Eployee e = new Eployee();
		
		System.out.println(e.calculateAverage(nums));
		
		
	

	}

}
