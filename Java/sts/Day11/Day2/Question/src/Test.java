
public class Test  implements Intr{

	@Override
	public int[] display(int p) {
		int r = 0;
		
		int[] arr = new int[p]; 
		
		for(int a =1;a<=p;a++) {
			
			int count = 0;
			for(int k =1;k<=a;k++) {
				if(a%k == 0) {
					count++;
				}
			}
			if(count==2) {
				arr[r] = a;
				r++;
				
			}
		}
		
		return arr;
	}
	

}
