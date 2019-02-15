package com.vidhyac.bank.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidhyac.bank.beans.BankAccountController;

public class BankTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bank.xml");
		BankAccountController controller=context.getBean(BankAccountController.class);
		//System.out.println(controller.withdraw(101, 500));
		Scanner scan = new Scanner(System.in);
		/*System.out.println("\n\nWelcome!");*/
		System.out.println("\n Enter your account No: ");
		long accNo=scan.nextLong();
		while(true){
			
			
			System.out.println(" 1.Withdraw\n 2.Deposit\n 3.Check Balance\n 4.Fund Transfer\n 5.Exit\n Choose your option: ");
			 
			 int option=scan.nextInt();
			 
			 if(option==1){
				 System.out.println("1.WITHDRAWAL\n Enter Amount to Withdraw: ");
			 		double amount=scan.nextDouble();
			 		System.out.println("\nYour Balance Before Withdrawal is "+controller.getBalance(accNo));
			 		System.out.println("\nYour Balance After Withdrawal is "+controller.withdraw(accNo, amount));
			 }
		
			 if(option==2){
				 System.out.println("2.DEPOSIT\n Enter Amount to Deposit: ");
			 		double amount=scan.nextDouble();
			 		System.out.println("\nYour Balance Before Deposit is "+controller.getBalance(accNo));
			 		System.out.println("\nYour Balance After Deposit is "+controller.deposit(accNo, amount));
			 }
			 if(option==3){
				 System.out.println("3.CHECK BALANCE");
			 		System.out.println("\nYour Current Balance is "+controller.getBalance(accNo));
			 }
			 
			 if(option==4){
				 System.out.println("4.FUND TRANSFER\n Enter To Account Number: ");
				 long toAccNo=scan.nextLong();
				 System.out.println("\nEnter Amount to Transfer: ");
				 double amount=scan.nextDouble();
				 System.out.println("\nYour Account Balance Before fund transfer is "+controller.getBalance(accNo));
				 System.out.println("\nYour To Account Balance Before fund transfer is "+controller.getBalance(toAccNo));
			 		System.out.println("T/F? "+controller.fundTransfer(accNo, toAccNo, amount));
			 		System.out.println("\nYour Account Balance after fund transfer is "+controller.getBalance(accNo));
			 		System.out.println("\nYour To Account Balance after fund transfer is "+controller.getBalance(toAccNo));
			 }
			 if(option==5)
				 break;	 
	}

	}
}
