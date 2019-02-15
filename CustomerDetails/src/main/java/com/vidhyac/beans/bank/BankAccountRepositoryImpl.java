package com.vidhyac.beans.bank;

import java.util.ArrayList;
import com.vidhyac.interfaces.BankAccountRepository;
//Repository class is in need of DAO class's object(dependency)
public class BankAccountRepositoryImpl implements BankAccountRepository {

	//BankAccountDAO dao=null;
	ArrayList<BankAccount> acntList=null;
	double bal;
	static String name;
	
	
	public BankAccountRepositoryImpl() {
		//dao=new BankAccountDAO();//creating object for dao class
		//acntList=dao.getAccounts();
		bal=0.0d;
		name=null;
	}
	@Override
	public double getBalance(long accountId) {
		
		for (BankAccount bankAccount : acntList) {
			if(bankAccount.getAccountId()==accountId){
				 bal =bankAccount.getAccountBalance();
				 name=bankAccount.getAccountHolderName();
				 bankAccount.setAccountBalance(bal);
			}
		}
		return bal;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		
		for (BankAccount bankAccount : acntList) {
			if(bankAccount.getAccountId()==accountId){
				 bal =bankAccount.getAccountBalance();
				 bal=newBalance;
				 bankAccount.setAccountBalance(bal);
			}
		}
	
		return bal;
	}
	
	public static void main(String[] args) {
		BankAccountRepositoryImpl repo=new BankAccountRepositoryImpl();
		System.out.println(" Account balance is "+repo.getBalance(101)+" Account Holder name is "+name);
		System.out.println(repo.updateBalance(101, 500));
		System.out.println(repo.getBalance(101));
	}

}


