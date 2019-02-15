package com.vidhyac.generics;

public class MyEmployee {
	String empName;
	int empId,empAge;
	
	
	MyEmployee(String empName,int empId,int empAge){
		this.empName=empName;
		this.empId=empId;
		this.empAge=empAge;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	
}
