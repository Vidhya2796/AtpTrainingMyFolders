package com.vidhyac.test;

import java.util.Hashtable;

import com.vidhyac.collection.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		Hashtable<Employee, Double> table=new Hashtable<Employee, Double>();
		Employee e1=new Employee(101, "Sudha");
		table.put(e1, 30000.0d);
		Employee e2=new Employee(101, "sudha");
		table.put(e2, 20000.0d);
		Employee e3=new Employee(103, "Leo");
		table.put(e3, 33000.0d);
		Employee e4=new Employee(104, "Ganesh");
		table.put(e4, 17000.0d);
		Employee e5=new Employee(104, "Ganesh");
		table.put(e5, 8000.0d);
			//equals method
			System.out.println(e1.equals(e2));//false
			System.out.println(e4.equals(e5));//true
			System.out.println(e3.equals(e4));//false
			//hashCode method
			System.out.println(e1.hashCode());
			System.out.println(e2.hashCode());
			System.out.println(e3.hashCode());
			System.out.println(e4.hashCode());
			System.out.println(e5.hashCode());
			//calling getter method
			System.out.println("Employee Id is "+e3.getEmpId());
			System.out.println("Employee Name is "+e3.getEmpName());
			
			//calling setter method
			e4.setEmpId(117);
			e4.setEmpName("sneha");
			
			System.out.println("Employee Id is "+e4.getEmpId());
			System.out.println("Employee Name is "+e4.getEmpName());
			
	
	}

}
