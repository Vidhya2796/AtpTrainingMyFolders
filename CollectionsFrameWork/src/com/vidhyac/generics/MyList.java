package com.vidhyac.generics;
import java.util.*;
public class MyList {

	public static void main(String[] args) {
		//creating arraylist for myemployee class
		
		List<MyEmployee> listemp=new ArrayList<MyEmployee>();
		MyEmployee emp1=new MyEmployee("Priya", 1234, 22);
		listemp.add(emp1);
		MyEmployee emp2=new MyEmployee("Ram", 5678, 20);
		listemp.add(emp2);
		MyEmployee emp3=new MyEmployee("Divya", 91011, 21);
		listemp.add(emp3);
		listemp.remove(emp3);
		//listemp.removeAll(listemp);
		//System.out.println(listemp.get(0));
		//for each loop
		for(MyEmployee employee:listemp){
			
			System.out.println("Employee Name is "+employee.getEmpName());
			System.out.println(" Employee Id is "+employee.getEmpId());
			System.out.println(" Employee Age is "+employee.getEmpAge());
			
		}
		//creating arraylist for mybankaccount class
		List<MyBankAccount> listbank=new ArrayList<MyBankAccount>();
		MyBankAccount bank1 =new MyBankAccount("Ganesh",35000);
		listbank.add(bank1);
		MyBankAccount bank2 =new MyBankAccount("Sudha",23500);
		listbank.add(bank2);
		MyBankAccount bank3 =new MyBankAccount("Harini",46000);
		listbank.add(bank3);
		
		//for each loop
				for(MyBankAccount bankaccount:listbank){
					System.out.println("AccountHolder Name is "+bankaccount.getAccountHolderName());
					System.out.println("Account Balance is "+bankaccount.getAccountBalance());
					System.out.println("Account Number is "+bankaccount.getAccountNo());
					
				}
		
		
	}

}
