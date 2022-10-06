package Question4;

public class Demo {
	
	public static <T> void fun(T[] arr) {
		System.out.println(arr[0]);
	}

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5,6};
		
		String[] arr1 = {"One","tWO"};
		fun(arr);
		fun(arr1);
		
	}
}
