public class MyGenericClass<T> {
	
	T obj ;

	void add(T obj) {
		this.obj = obj;
	}

	
	T get() {
		return this.obj;
	}
	
	@Override
	public String toString() {
		return "MyGenericClass [obj=" + obj + "]";
	}
	
	
}
