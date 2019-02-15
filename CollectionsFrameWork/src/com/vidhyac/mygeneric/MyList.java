package com.vidhyac.mygeneric;

import java.util.ArrayList;
//My Generic Class-->MyList
//instead of <ClassType> you can also give any name like <T> and also for obj we can give t
public class MyList<ClassType> {
	private ClassType obj;
	//like setter method...here we rename the set method as add
	/*public void add(ClassType obj){
		this.obj=obj;
	}*/
	
	ArrayList<ClassType> arr= new ArrayList<ClassType>();
	public void listAdd(ClassType obj){
		arr.add(obj);
	}
	
	//get method
	/*public ClassType get(){
		return obj;
	}
	*/
	@SuppressWarnings("unchecked")
	public ClassType listGet(){
		return (ClassType) arr;
	}

}
