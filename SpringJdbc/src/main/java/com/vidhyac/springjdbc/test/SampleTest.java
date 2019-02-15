package com.vidhyac.springjdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidhyac.springjdbc.beans.Sample;

public class SampleTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springjdbc.xml");
		Sample sam=(Sample) context.getBean("sample");
		sam.createTable();
	}

}
