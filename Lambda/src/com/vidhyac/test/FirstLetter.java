package com.vidhyac.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstLetter {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Suraj","Poojitha","Manish","Vignesh");
		List<Character> list1=list.stream().map(i -> i.charAt(0)).collect(Collectors.toList());
		list1.stream().forEach(i -> System.out.print(i));
	}
}
