package com.vidhyac.beans.bank;

public class BankAccountController {
	
	BankAccountServiceImpl accountService=null;
	
	public double withdraw(long accountId, double balance){
		return balance;//wrng
		
	}
	public double deposit(long accountId, double balance){
		return accountService.deposit(accountId, balance);
		
	}
	public double getBalance(long accountId){
		return accountId;//wrng
		
	}
	public boolean fundTransfer(long fromAccount, long toAccount, double amount){
		return false;
		
	}
}
