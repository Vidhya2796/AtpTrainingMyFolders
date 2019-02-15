package com.vidhyac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidhyac.beans.Customer;

public class CustomerTest 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("cust.xml");
        Customer customer=context.getBean(Customer.class);
        customer.display();
    }
}
