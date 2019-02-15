package com.vidhyac.test;

import java.util.ArrayList;

public class WordsTest {

	public static void main(String[] args) {
		
		ArrayList<String> words= new ArrayList<String>();
		words.add("Vidhya");
		words.add("KAla");
		words.add("Ram");
		words.add("Ravi");
		words.add("Shalini");
		words.add("Priya");
		
		System.out.println("Before Removing odd word length");
		System.out.println(words);
		
		words.removeIf(str->str.length()%2!=0);
		System.out.println("After Removing odd word length");
		System.out.println(words);
		
	}

}
