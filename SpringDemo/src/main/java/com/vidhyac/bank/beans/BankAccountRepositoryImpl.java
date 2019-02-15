package com.vidhyac.bank.beans;

import java.util.List;

import com.vidhyac.bank.interfaces.BankAccountRepository;

public class BankAccountRepositoryImpl implements BankAccountRepository {
	
	private List<BankAccount> bankAccounts=null;
	

	public List<BankAccount> getBankAccounts() {
		return bankAccounts;
	}


	public void setBankAccounts(List<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}


	@Override
	public double getBalance(long accountId) {
		
		for (BankAccount acnt : bankAccounts) {
			if(acnt.getAccountId()==accountId){
				return acnt.getAccountBalance();
			}	
		}
		return 0;
	}
		
	
	@Override
	public double updateBalance(long accountId, double newBalance) {
		
		for (BankAccount acnt : bankAccounts) {
			if(acnt.getAccountId()==accountId){
				acnt.setAccountBalance(newBalance);//updating your new balance
				return acnt.getAccountBalance();
			}
		}
		
		return 0;
	}
		
		
		

}

