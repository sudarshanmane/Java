package Q2;

public class Eployee {
	
	public int calculateAverage(int[] age){
		
		int avg = 0;
		
		for(int a = 0;a<age.length;a++) {
			avg = avg + age[a];
		}
		
		return avg/age.length;
	}

}
