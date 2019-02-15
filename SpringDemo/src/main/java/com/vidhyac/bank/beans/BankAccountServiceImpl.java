package com.vidhyac.bank.beans;

import java.util.List;

import com.vidhyac.bank.interfaces.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService {
	private BankAccountRepositoryImpl bankRepos=null;
	private double modifiedBal;
	
	
	public BankAccountRepositoryImpl getBankRepos() {
		return bankRepos;
	}

	public void setBankRepos(BankAccountRepositoryImpl bankRepos) {
		this.bankRepos = bankRepos;
	}

	
	@Override
	public double withdraw(long accountId, double balance) {
		
		modifiedBal=findBalFromOption( accountId,  balance, "withdraw");
		return bankRepos.updateBalance(accountId, modifiedBal);
	}
	
	

	@Override
	public double deposit(long accountId, double balance) {
		//return bankRepos.updateBalance(accountId, balance, option);
		modifiedBal=findBalFromOption( accountId,  balance, "deposit");
		return bankRepos.updateBalance(accountId, modifiedBal);
	}

	@Override
	public double getBalance(long accountId) {
		
		return bankRepos.getBalance(accountId);
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		//System.out.println(fromAccount+" "+toAccount+" "+amount);
		double wd=withdraw(fromAccount,amount);
		double dep=deposit(toAccount,amount);
		//System.out.println(dep);
		if(wd != 0 && dep !=0){
			System.out.println("Fund Transferred");
			return true;
		}

		return false;
	}
	

	public double findBalFromOption(long accountId, double balance,String option){
		//System.out.println(accountId+" "+balance+" "+option);
		List<BankAccount> listAcnt=bankRepos.getBankAccounts();
		for (BankAccount acnt : listAcnt) {
			if(acnt.getAccountId()==accountId){
				if(option.equalsIgnoreCase("withdraw")){
					if(acnt.getAccountBalance() > balance){
						
						return acnt.getAccountBalance()-balance;
					}
					else{
							System.out.println("Insufficient Balance!");
					}
				}
						
				if(option.equalsIgnoreCase("deposit")){
					
					return acnt.getAccountBalance()+balance;
					}
				
			}
		}
		return 0;
		
	}
}
