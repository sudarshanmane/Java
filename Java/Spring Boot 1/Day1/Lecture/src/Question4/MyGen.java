package Question4;


public class MyGen<T extends Student> {
	
	T data;
	public  MyGen(T data) {
		super();
		this.data = data;
	}
	
	
	
	public T getData() {
		return data;
	}

}
