package Question5;

public class MyGeneric<T> {
    T obj;
	 void add(T obj){
		this.obj = obj;
	}
	T get() {
		return this.obj;
	}
	
}
