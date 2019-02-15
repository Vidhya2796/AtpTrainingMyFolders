package com.vidhyac.test;
import java.util.Arrays;
import java.util.List;


public class UpperCase {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("Vidhya","Priya","Lekha","Abi");
		words.stream().map(str -> str.toUpperCase()).forEach(str -> System.out.println(str));
	}

}
