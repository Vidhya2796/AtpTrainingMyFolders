package com.vidhyac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidhyac.beans.Question;

public class QuestionMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ques.xml");
		Question question=(Question) context.getBean("quesans");
		question.displayAnsInList();
		question.displayAnsInSet();
		question.displayAnsInMap();

	}

}
