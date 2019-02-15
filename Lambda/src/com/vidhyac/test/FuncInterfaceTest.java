package com.vidhyac.test;

import java.util.Arrays;
import java.util.List;

public class FuncInterfaceTest {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(21,3,7,12,10);
		//Supplier, Consumer, Predicate & Function		
		//Consumer ---> void accept(T t)--->it takes input but it returns nothing--->represents forEach() in stream
		//Predicate ---> boolean test(T t)--->it takes input but it returns boolean value based on condition specified--->represents filter() in stream
		//Function ---> T apply(T t)--->it takes input but it returns value of same input type--->represents map() in stream
		//Supplier ---> T get()--->it  doesn't take input but it returns the result--->represents count() in stream
		int j=0;
		list.stream().map(i -> i*i).filter(i -> i>30).forEach(i -> System.out.println("square of element  = " +i));
		long count=list.stream().map(i -> i*i).filter(i -> i>30).count();
		
		System.out.println("No of Elements in list "+count);
		
	}
}
