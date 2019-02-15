package com.vidhyac.test;
//package com.vidhyac.bank;

import com.vidhyac.bank.BankAccount;
import com.vidhyac.bank.CurrentAccount;
import com.vidhyac.bank.CurrentAccountVer2;
import com.vidhyac.bank.SavingAccount;
import com.vidhyac.bank.SavingAccountVer2;

public class TestBankAccount {
	
	public static void testBankAccountMethod(){
		//BankAccount acc=new BankAccount();
		//acc.setAccountHolderName("Vidhya");
	}
	
	public static void testSavingAccount(){
		SavingAccount savingAcc=new SavingAccount("Vidhya",5000,false);
		System.out.println("Account Holder Name is "+savingAcc.getAccountHolderName());
		System.out.println("Account No is "+savingAcc.getAccountNo());
		System.out.println("Account Balance is "+savingAcc.getAccountBalance());
		savingAcc.deposit(5000);
		System.out.println("Account Balance is "+savingAcc.getAccountBalance());
		System.out.println("********************************");
		savingAcc.withdraw(3000);
		System.out.println("Account Balance is "+savingAcc.getAccountBalance());
		
		//SavingAccount savingAcc1=new SavingAccount();
	}
	
	public static void testCurrentAccount(){
		CurrentAccount curentAcc=new CurrentAccount("Priya",40000);
		System.out.println("Account Holder Name is "+curentAcc.getAccountHolderName());
		System.out.println("Account No is "+curentAcc.getAccountNo());
		System.out.println("Account Balance is "+curentAcc.getAccountBalance());
		System.out.println("OverDraft Limit is "+curentAcc.odLimit);
		//curentAcc.deposit(5000);
		//System.out.println("Account Balance is "+curentAcc.getAccountBalance());
		//System.out.println("********************************");
		curentAcc.withdraw(20000);
		System.out.println("Account Balance is "+curentAcc.getAccountBalance());
	}
	//I'm making the return type of this method as BANKACCOUNT which is generic..whether it is saving or cuurent account..i'm returning bank account only
	//polymorphism---many behaviors of objects
	//only one reference variable is here..by using this i change the entire behavior into savingacc and currentacc
	public static BankAccount getBankAccount(String accountType){
		BankAccount acc=null;
		if(accountType.equals("Saving")){
			acc=new SavingAccount("Onkar",4000);
		}
		else if(accountType.equals("Current")){
			acc=new CurrentAccount("Rahul",7000);
		}
		else{
			acc=null;
		}
		return acc;
		
	}
	public static void main(String[] args) {
		/*BankAccount acc=getBankAccount("Current");
		System.out.println("Account Holder Name is "+acc.getAccountHolderName());
		System.out.println("Account No is "+acc.getAccountNo());
		System.out.println("Account Balance is "+acc.getAccountBalance());
		acc.deposit(3000);
		acc.withdraw(5000);*/
		/*//testBankAccountMethod();
		testSavingAccount();
		testCurrentAccount();*/
		/*SavingAccountVer2 acc=new SavingAccountVer2();
		acc.withdraw(400);
		acc.deposit(4000);
		acc.isSalaryAccount();
		System.out.println(acc.getInsuranceName());*/
		
		CurrentAccountVer2 acc=new CurrentAccountVer2();
		acc.withdraw(400);
		acc.deposit(4000);
		//acc.isSalaryAccount();
		System.out.println(acc.getInsuranceName());
	}
	
	
	
	
	
	
	 
}
