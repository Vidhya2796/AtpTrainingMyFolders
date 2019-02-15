package com.vidhyac.test;

import java.util.*;

import com.vidhyac.collection.Person;

public class TestPerson {

	public static void main(String[] args) {
		Set<Person> set=new TreeSet<Person>();
		//Creating Persons
		Person person1=new Person("Vidhya", 54, 5.7f);
		Person person2=new Person("Priya", 55, 5.2f);
		Person person3=new Person("Pechi", 70, 6.0f);
		Person person4=new Person("Dhivya", 54, 5.5f);
		Person person5=new Person("Sudha", 38, 5.0f);
		
		//Adding persons to TreeSet
		set.add(person1);
		set.add(person2);
		set.add(person3);
		set.add(person4);
		set.add(person5);
		
		//Traversing TreeSet
		for(Person person:set){
			System.out.println(person.name+" "+person.weight+" "+person.height);
		}
		
		
		
		
	}

}
