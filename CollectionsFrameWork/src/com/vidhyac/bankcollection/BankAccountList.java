package com.vidhyac.bankcollection;

import java.util.TreeSet;

public class BankAccountList {

	public static void main(String[] args) {
		TreeSet<SavingAccount> tree=new TreeSet<SavingAccount>();
		tree.add(new SavingAccount(1,"Vidhya",35000,true));
		tree.add(new SavingAccount(2,"Preethi",50000,true));
		tree.add(new SavingAccount(3,"Vicky",17000,true));
		tree.add(new SavingAccount());
		tree.add(new SavingAccount(1,"NewVidhya",21000,true));
		
		for(SavingAccount tree1:tree){
			System.out.println(tree1);
		}

	}

}
