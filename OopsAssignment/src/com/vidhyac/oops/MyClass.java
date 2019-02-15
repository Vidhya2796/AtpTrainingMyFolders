package com.vidhyac.oops;

public class MyClass extends MyAbstractClass {

	@Override
	public void myMethod() {
		System.out.println("This is my class");
		
	}
	public static void main(String[] args) {
		MyClass hello=new MyClass();
		hello.helloMethod();
		hello.myMethod();
	}

}
