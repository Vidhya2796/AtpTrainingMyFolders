package com.vidhyac.oops;

public class Manager extends Employee{
	//declaring class variables
	private double incentive;
	private double bonus;
	
	//default constructor
	public Manager(){
		this.setIncentive(1000.0d);
		bonus=0.0d;
	}
	
	//Parameterized constructor
	public  Manager(String empName,double empSalary){
		super(empName,empSalary);
	}
	
	@Override
	public void totalsalary(double empSalary) {
		// TODO Auto-generated method stub
		if(empSalary <= 25000){
			bonus=0.10;
			setIncentive(empSalary * bonus);
		}
		
		else if(empSalary <= 50000){
			bonus=0.20;
			setIncentive(empSalary * bonus);
		}
		
		else if(empSalary <= 75000){
			bonus=0.30;
			setIncentive(empSalary * bonus);
		}
		
		else if(empSalary <= 100000){
			bonus=0.40;
			setIncentive(empSalary * bonus);
		}
		else if(empSalary >= 100000){
			bonus=0.50;
			setIncentive(empSalary * bonus);
		}
		
	}//method over
	//getter method
	public double getIncentive() {
		return incentive;
	}
	//setter method
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	
	
}//class over
