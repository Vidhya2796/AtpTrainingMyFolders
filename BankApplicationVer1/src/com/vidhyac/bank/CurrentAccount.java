package com.vidhyac.bank;

public class CurrentAccount extends BankAccount{
	//private double odLimit;
	public double odLimit;
	//private double extra;
	
	//parameterised constructor
	public CurrentAccount(String accountHolderName,double accountBalance) {
		super(accountHolderName,accountBalance);
		this.odLimit=20000;
	}
	
	public CurrentAccount() {
		this.odLimit=20000;
	}
	
	@Override
	public void withdraw(double amount) {
		double extra;
		if(amount > accountBalance){
			extra=amount-accountBalance;
			//this.odLimit-=this.extra;
				if(extra > this.odLimit){
					System.out.println("Your Withdrawal Amount is "+amount);
					System.out.println("You are exceeding your overdraft limit! Withdraw Terminated");
				}
				else{
					this.odLimit-=extra;
					accountBalance=0.0d;
					System.out.println("Your Withdrawal Amount is "+amount);
					System.out.println();
					System.out.println("After Withdrawal");
					System.out.println("Your Overdraft limit is "+this.odLimit);	
				}
		}
		else{
			System.out.println("Your Withdrawal Amount is "+amount);
			accountBalance-=amount;
			System.out.println("account balance is"+ getAccountBalance());
			System.out.println("After Withdrawal");
			System.out.println("Your Overdraft limit is "+this.odLimit+" NOT CHANGED");
			
		}
			
			
		
	}
}
