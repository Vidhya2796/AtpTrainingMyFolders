package com.vidhyac.oops;

public class Singleton1 {
	
	public String str="Hello..";
	
	public static void testSingleton1(){
		Singleton1 singleton1=new Singleton1();
		System.out.println(singleton1.str);
		System.out.println(singleton1.hashCode());
		
		Singleton1 singleton2=new Singleton1();
		System.out.println(singleton2.str);
		System.out.println(singleton2.hashCode());
		
		Singleton1 singleton3=new Singleton1();
		System.out.println(singleton3.str);
		System.out.println(singleton3.hashCode());
	}
	public static void main(String[] args) {
		testSingleton1();
		
		
	}

}
