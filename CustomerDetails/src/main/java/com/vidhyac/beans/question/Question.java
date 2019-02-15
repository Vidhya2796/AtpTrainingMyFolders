package com.vidhyac.beans.question;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	//questionId, question, answers.
	private int questionId;
	private String question;
	private List<String> answersList;//=Arrays.asList("ans1","ans2","ans3");
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
	
	
	public void showQuesDetails() {
		System.out.println("Question Id is "+questionId);
		System.out.println("Question is "+question);
		int i=0;
		/*for (String string : answersList) {
			System.out.println((++i)+") "+getAnswersList());
		}*/
		
		Iterator<String> itrList=answersList.iterator();//what is the meaning of this??
		System.out.println("Answers in List");
		while (itrList.hasNext()) {
			String string = (String) itrList.next();
			System.out.println((++i)+") "+string);
		}
		
		System.out.println("Answers in Set");
		System.out.println();
		System.out.println();
		int j=0;
		Iterator<String> itrSet=answersSet.iterator();//what is the meaning of this??
		while (itrSet.hasNext()) {
			String string = (String) itrSet.next();
			System.out.println((++j)+") "+string);
		}
		
		System.out.println("Answers in Map");
		System.out.println();
		System.out.println();
		
		//int z=0;
		Set<Entry<Integer, String>> set=answersMap.entrySet();
		Iterator<Entry<Integer,String>> itrMap=set.iterator();//what is the meaning of this??
		
		while (itrMap.hasNext()) {
			//String string = (String) itrMap.next();
			System.out.println(itrMap.next());
		}
	}
	
	
	
	
	
}
