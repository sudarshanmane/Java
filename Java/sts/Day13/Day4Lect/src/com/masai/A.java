package com.masai;

public class A {
	int i = 10;
	
	private A(){
		System.out.println("inside COnst of A");
	
	}
	
	void funA() {
		System.out.println("inside funA");
	}
	
	public static A getAObj() {
		
		return new A();
	}

}
