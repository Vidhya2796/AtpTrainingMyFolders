package com.vidhyac.oops;//logical collection of classes

public class Singleton {//logical data and methods clubbed together into a single unit
	//class variable/instance variables/member variables
	//declaring class variables
	private static Singleton originalInstance=null;
	public String s;
	
	//default constructor
	//access modifier of this default constructor is private..bcoz i don't want this Singleton class to be inherited by other classes
	private Singleton() {
		s="Vidhya";
	}
	
	public static Singleton getInstance(){
		
		if(originalInstance==null){
			originalInstance=new Singleton();
		}
		
		return originalInstance;
	}
	
	public static void main(String[] args) {
		
		Singleton object1=Singleton.getInstance();
		System.out.println(object1.s);
		System.out.println(object1.hashCode());
		
		Singleton object2=Singleton.getInstance();
		System.out.println(object2.s);
		System.out.println(object2.hashCode());
		
		Singleton object3=Singleton.getInstance();
		System.out.println(object3.s);
		System.out.println(object3.hashCode());
		
	}

}
