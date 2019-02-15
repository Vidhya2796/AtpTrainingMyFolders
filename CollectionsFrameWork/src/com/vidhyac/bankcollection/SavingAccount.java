package com.vidhyac.bankcollection;

public class SavingAccount implements Comparable<SavingAccount>{
	//private static int autoAcc_ID;
	private int acc_ID;
	private String accountHolderName;
	protected double acc_balance;
	private boolean isSalaryAccount;
	
	/*{
		acc_ID=++autoAcc_ID;
	}*/
	
	
	public SavingAccount(){ 
		accountHolderName="Unknown";
		acc_balance=0;	
	}
	
	public SavingAccount(int acc_ID,String accountHolderName,double acc_balance,boolean isSalaryAccount) {
		//super(accountHolderName,accountBalance);
		this.acc_ID=acc_ID;
		this.accountHolderName=accountHolderName;
		this.acc_balance=acc_balance;
		this.isSalaryAccount=isSalaryAccount;
		
	}
	
	public void withdraw(double amount) {
		this.acc_balance=acc_balance-amount;
		System.out.println("accnt bal is "+ getAcc_balance());
	}
	
	public void deposit(double amount){
		this.acc_balance+=amount;
		System.out.println("accnt bal is "+ getAcc_balance());
	}
	
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	public int getAcc_ID() {
		return acc_ID;
	}

	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}

	@Override
	public int compareTo(SavingAccount obj) {
		if(acc_ID<obj.acc_ID){
			return 1;
		}
		else if(acc_ID>obj.acc_ID){
			return -1;
		}
			else
				return 0;
		}

	@Override
	public String toString() {
		return "SavingAccount [acc_ID=" + acc_ID + ", accountHolderName="
				+ accountHolderName + ", acc_balance=" + acc_balance
				+ ", isSalaryAccount=" + isSalaryAccount + "]";
	}


		
	}
	
	

