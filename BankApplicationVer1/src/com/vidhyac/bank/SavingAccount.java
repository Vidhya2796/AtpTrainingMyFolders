package com.vidhyac.bank;

public class SavingAccount extends BankAccount{
	private boolean isSalaryAccount;
	
	public SavingAccount(String accountHolderName,double accountBalance) {
		super(accountHolderName,accountBalance);
		this.isSalaryAccount=true;
		
	}
	
	public SavingAccount() {
	
	}
	
	public SavingAccount(String accountHolderName,double accountBalance,boolean isSalaryAccount) {
		super(accountHolderName,accountBalance);
		this.isSalaryAccount=isSalaryAccount;
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isSalaryAccount() {
		return isSalaryAccount;
			
	}
	
	
}

