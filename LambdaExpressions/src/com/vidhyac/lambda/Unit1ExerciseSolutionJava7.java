package com.vidhyac.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("Vidhya", "Shree", 22),
				new Person("Ramya", "Krishnan", 30),
				new Person("Srilekha", "Lakshmi", 27),
				new Person("Priyanka", "Maran", 38),
				new Person("Priya", "Shaji", 50)		
		);
		
		//step 1:sort the lastname in ascending order
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
		
		//step 2:print all the elements in list
		printAll(people);
		
		//step 3:print the objects which has the lastname starts with 'S'
		printLastnamestartingWithS(people);
		
	}//psvm() over

	private static void printLastnamestartingWithS(List<Person> people) {
		for (Person person : people) {
			if(person.getLastName().startsWith("K")){
				System.out.println(person);
			}
		}	
	}

	private static void printAll(List<Person> people) {
		for (Person person : people) {
			System.out.println(person);
		}
	}//printAll() over

}//class over
