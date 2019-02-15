package com.vidhyac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidhyac.beans.customerDetails.Customer;

public class CustomerMain
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Customer customer=context.getBean(Customer.class);
        customer.showCustDetails();
    }
}
