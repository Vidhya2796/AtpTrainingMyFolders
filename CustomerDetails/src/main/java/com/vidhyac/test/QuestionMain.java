package com.vidhyac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidhyac.beans.question.Question;

public class QuestionMain {

	public static void main(String[] args) {
		 ApplicationContext context1=new ClassPathXmlApplicationContext("question.xml");
		 Question question=context1.getBean(Question.class);
		 question.showQuesDetails();
	}

}
