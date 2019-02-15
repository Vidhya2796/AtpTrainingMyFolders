package com.vidhyac.bank.bank_application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        BankAccount acc=context.getBean(BankAccount.class);
        acc.deposit();
    }
}
