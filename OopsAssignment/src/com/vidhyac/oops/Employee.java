package com.vidhyac.oops;

public abstract class Employee {
	//Class variables declaration 
	private static int empAutoId;
	private String empName;
	private int empId;
	protected double empSalary;
	
	//init block
	{
		empId=++empAutoId;
	}
	
	//Default Constructor
	public Employee(){
		//empId=1234;
		empName="Priya";
		empSalary=30000;
	}
	//parameterised constructor
	public Employee(String empName,double empSalary){
		this.empName=empName;
		this.empSalary=empSalary;
	}
	//conceptual method-->Setter method
	public void setEmpName(String empName){
		this.empName=empName;
	}
	//conceptual method-->getter method
	public int getEmpId(){
		return empId;
	}
	
	public String getEmpName(){
		return empName;
	}
	
	public double getEmpSalary(){
		return empSalary;
	}
	
	//service methods
	//public abstract void totalsalary();
	public abstract void totalsalary(double empSalary) ;
		
	
}
