package com.vidhyac.oops;

public class Labour extends Employee{

	//declaring class variable
	private float worktime;
	private int noOfDays;
	private double eachHourWage;
	
	//default constructor
	public Labour(){
		worktime=3;//in hours per day
		noOfDays=22;//how many days extra worktime is???
		eachHourWage=50;
		//setWorktime(5);
	}
	//parameterized constructor
	public Labour(String empName,double empSalary){
		super(empName, empSalary);
		worktime=3;
		noOfDays=22;
		eachHourWage=50;
	}
	
	public Labour(String empName,double empSalary,float worktime){
		super(empName, empSalary);
		this.worktime=worktime;
	}
	
	public Labour(String empName,double empSalary,float worktime,int noOfDays){
		super(empName, empSalary);
		this.worktime=worktime;
		this.noOfDays=noOfDays;
	}
	
	public Labour(String empName,double empSalary,float worktime,int noOfDays,double eachHourWage){
		super(empName, empSalary);
		this.worktime=worktime;
		this.noOfDays=noOfDays;
		this.eachHourWage=eachHourWage;
	}
	
	@Override
	public void totalsalary(double empSalary) {
		float totWorkHrs=worktime * noOfDays;
		setEmpSalary(empSalary+(totWorkHrs * eachHourWage));
	}
	
	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	public float getWorktime() {
		return worktime;
	}

	public void setWorktime(float worktime) {
		this.worktime = worktime;
	}
	
	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
//get and set method is missing for each hour wage
}
