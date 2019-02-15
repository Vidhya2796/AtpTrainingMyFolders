package com.vidhyac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidhyac.beans.bank.BankAccountController;
//main class
/*Create a Test class with main() method, get BankAccountController bean object
from ApplicationContext and perform all the operations.*/
public class BankAccountMain {

	public static void main(String[] args) {
		 
		ApplicationContext context=new ClassPathXmlApplicationContext("bank.xml");
		 BankAccountController controller=context.getBean(BankAccountController.class);
		 controller.deposit(101, 200);

	}

}
