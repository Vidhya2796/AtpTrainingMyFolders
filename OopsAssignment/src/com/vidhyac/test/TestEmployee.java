package com.vidhyac.test;

import com.vidhyac.oops.Labour;
import com.vidhyac.oops.Manager;

public class TestEmployee {
	public static void testLabour(){
		Labour labour=new Labour("Leo",35000,5,25,60);
		//System.out.println("Employee Id is "+labour.getEmpId());
		System.out.println("Employee Name is "+labour.getEmpName());
		System.out.println("WorkTime is "+labour.getWorktime());
		System.out.println("No of Days Worked for extra hOURS is "+labour.getNoOfDays());
		System.out.println("Employee Salary is "+labour.getEmpSalary());
		System.out.println("******************************************");
		
	}
	
	public static void testManager(){
		Manager manager=new Manager();
		System.out.println("Employee Name is "+manager.getEmpName());
		System.out.println("WorkTime is "+manager.getIncentive());
		System.out.println("Employee Salary is "+manager.getEmpSalary());
		System.out.println("******************************************");
		}
	
	public static void main(String[] args) {
		testLabour();
		testManager();

	}

}
