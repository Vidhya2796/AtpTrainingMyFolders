package com.vidhyac.beans;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	//questionId, question, answers.
	private int questionId;
	private String question;
	private List<String> answersList;
	private Set<String> answersSet;
	private Map<Integer,String> answersMap;
	
	
	
	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getAnswersList() {
		return answersList;
	}

	public void setAnswersList(List<String> answersList) {
		this.answersList = answersList;
	}

	public Set<String> getAnswersSet() {
		return answersSet;
	}

	public void setAnswersSet(Set<String> answersSet) {
		this.answersSet = answersSet;
	}

	public Map<Integer, String> getAnswersMap() {
		return answersMap;
	}

	public void setAnswersMap(Map<Integer, String> answersMap) {
		this.answersMap = answersMap;
	}

	public void displayAnsInList() {
		System.out.println("Question no: "+getQuestionId()+"\nQuestion "+getQuestion()+"\nAnswers are in list:");
		//Iterator<String> itrList=answersList.iterator();
		for (String string : answersList) {
			System.out.println(string);
		}
		System.out.println();
	}
		
	public void displayAnsInSet() {
			System.out.println("Question no: "+getQuestionId()+"\nQuestion "+getQuestion()+"\nAnswers are in Set:");
			//Iterator<String> itrSet=answersSet.iterator();
			for (String string : answersSet) {
				System.out.println(string);
			}
		System.out.println();
	}
	
	public void displayAnsInMap() {
		System.out.println("Question no: "+getQuestionId()+"\nQuestion "+getQuestion()+"\nAnswers are in Map:");
		//Iterator<String> itrSet=answersSet.iterator();
		Set<Entry<Integer, String>> set=answersMap.entrySet();
		Iterator<Entry<Integer, String>> itr=set.iterator();
		for (Entry<Integer, String> entry : set) {
			System.out.println(entry);
		}
		
	System.out.println();
}

	
	
	
	
}
