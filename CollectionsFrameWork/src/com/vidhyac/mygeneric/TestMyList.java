package com.vidhyac.mygeneric;

public class TestMyList {
	
	public static void main(String[] args) {
		MyList<MyEmployee> emp=new MyList<MyEmployee>();
		emp.listAdd(new MyEmployee("Vidhya",1423,22));
		emp.listAdd(new MyEmployee("Barathi",2766,18));
		emp.listAdd(new MyEmployee("Leo",4520,25));
		System.out.println(emp.listGet());
		
		MyList<MyBankAccount> bank=new MyList<MyBankAccount>();
		bank.listAdd(new MyBankAccount("Vidhya",35000));
		System.out.println(bank.listGet());
	}
	
}
