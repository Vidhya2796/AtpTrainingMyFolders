package com.vidhyac.beans.bank;

import java.util.ArrayList;
import com.vidhyac.interfaces.BankAccountService;

//class
//services provided by bank
public class BankAccountServiceImpl implements BankAccountService {
	
	BankAccountRepositoryImpl accountRepos=null;
	//BankAccountDAO dao=null;
	ArrayList<BankAccount> acntlist=null;
	double originalBal,fromBal,toBal,transferAmount;
	String fromName,toName;
	//double balAfterWithdrawal;
	//double balAfterDeposit;
	
	public BankAccountServiceImpl() {
		//dao=new BankAccountDAO();
		//acntlist=dao.getAccounts();
		//balAfterWithdrawal=0.0d;
		//balAfterDeposit=0.0d;
		originalBal=0.0d;
		fromBal=0.0d;
		toBal=0.0d;
		transferAmount=0.0d;
		fromName=null;
		toName=null;
	}

	@Override
	public double withdraw(long accountId, double balance) {
		for (BankAccount acntEach : acntlist) {
			if(acntEach.getAccountId()==accountId){
				originalBal=acntEach.getAccountBalance();
				
				if(originalBal > balance){
					originalBal=originalBal-balance;
					acntEach.setAccountBalance(originalBal);
				}else {
					System.out.println("Insufficient Balance");
				}
			}
		}
		return originalBal;
	}

	@Override
	public double deposit(long accountId, double balance) {
		for (BankAccount acntEach : acntlist) {
			if(acntEach.getAccountId()==accountId){
				originalBal=acntEach.getAccountBalance();
				originalBal=originalBal+balance;
				acntEach.setAccountBalance(originalBal);
			}
		}
		return originalBal;
	}

	@Override
	public double getBalance(long accountId) {
		for (BankAccount acntEach : acntlist) {
			if(acntEach.getAccountId()==accountId){
				originalBal=acntEach.getAccountBalance();
				//System.out.println(originalBal);
				//acntEach.setAccountBalance(originalBal);
			}
		}
		return originalBal;
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		
		
		for (BankAccount acntEachFrom : acntlist) {//outer for loop for iterating FROMACCOUNT number
			if(acntEachFrom.getAccountId()==fromAccount){//if any account number matches with FROMACCOUNT
				
					for (BankAccount acntEachTo : acntlist) {//inner for loop for iterating TOACCOUNT number
						if(acntEachTo.getAccountId()==toAccount){//if any account number matches with TOACCOUNT
							fromName=acntEachFrom.getAccountHolderName();
							toName=acntEachTo.getAccountHolderName();
							fromBal=acntEachFrom.getAccountBalance();//then getting the balance from FROMACCOUNT
							toBal=acntEachTo.getAccountBalance();//then getting the balance from TOACCOUNT
									if(fromBal>amount){
										fromBal=fromBal	-amount;
										acntEachFrom.setAccountBalance(fromBal);//updating original balance
										toBal=toBal+amount;
										acntEachTo.setAccountBalance(toBal);
										transferAmount=amount;
										return true;
									}
									
									
						}
					}
			}	
			
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		BankAccountServiceImpl serviceImpl=new BankAccountServiceImpl();

		System.out.println("Original Balance "+serviceImpl.getBalance(101));
		System.out.println("After Withdrawal "+serviceImpl.withdraw(101, 10000));
		System.out.println("After Deposit "+serviceImpl.deposit(101, 10000));
		//System.out.println("Is fund Transfering? betweeen "+serviceImpl.fromName+" and "+serviceImpl.toName+" T/F "+serviceImpl.fundTransfer(101, 102, 2000));
		System.out.println("Is fund Transfering? T/F "+serviceImpl.fundTransfer(101, 102, 2000));
		System.out.println("Transfer amount is "+serviceImpl.transferAmount);//+" Balance of "+serviceImpl.fromBal+" is "+serviceImpl.getBalance(101));
		System.out.println("Balance of 101 is "+serviceImpl.getBalance(101));
		System.out.println("Balance of 102 is "+serviceImpl.getBalance(102));
		
	}

}
