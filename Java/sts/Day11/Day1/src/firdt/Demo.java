package firdt;

public class Demo {

	
	public  X funDemo(){
		System.out.println("inside funDemo of Demo");
		
		return new Ximpl();
	}
	
	public static void main(String[] args) {
		
		Demo demo = new Demo();		
		
		X x1  = demo.funDemo();
		Ximpl ximpl = (Ximpl) x1;
		
		ximpl.fun1();
		ximpl.fun2();

	}
}
