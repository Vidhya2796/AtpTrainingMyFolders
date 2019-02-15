package com.vidhyac.generics;

public class MyBankAccount {
	private static int autoAccountNo;
	private int accountNo;
	private String accountHolderName;
	protected double accountBalance;
	
	{
		accountNo=++autoAccountNo;
	}
	
	public MyBankAccount(String accountHolderName,double accountBalance) {
		
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
		
	}


	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}
