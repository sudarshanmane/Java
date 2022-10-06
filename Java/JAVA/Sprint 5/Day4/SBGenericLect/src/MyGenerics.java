
public class MyGenerics {
	
	public static void main(String[] args) {
		
		MyOwnGenerics<String> t = new MyOwnGenerics<>();
		t.add("one");
		t.add("two");
		System.out.println(t);
		
		
		MyOwnGenerics<Number> t1 = new MyOwnGenerics<>();
		t1.add(100);
		t1.add(1000);
		System.out.println(t1);
		
	}
	
	
	

}


class MyOwnGenerics<T> {
	
	T obj;
	void add(T object) {
		this.obj= object;
	}

	T get() { 
		return this.obj;
	}
	
	
	
	
}