package com.vidhyac.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class TestHashSet {

	public static void main(String[] args) {
		//hashset and linkedhashset won't allow duplicate values
		//creating Hashset object
		HashSet<String> set=new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Six");
		set.add("Three");
		
		//creating iterator object by calling iterator() method
		Iterator<String> itr=set.iterator();
		int i=0;
		System.out.println("HashSet doesn't maintain Insertion Order");
		while(itr.hasNext()){
			//output will be in unordered state bcoz HashSet class maintains orders in hashcode but not in insertion order
			
			System.out.println((i++)+" Value is "+itr.next());
		}
		System.out.println();
		
		//creating LinkedHashset object
		//LinkedHashSet<fruits> set1=new LinkedHashSet<fruits>();
		LinkedHashSet<String> set1=new LinkedHashSet<String>();
		//String fruits[]={"Apple","Orange","Mango","JackFruit","Banana","Grapes"};
		//set1.addAll(fruits);
			set1.add("One");
			set1.add("Two");
			set1.add("Three");
			set1.add("Four");
			set1.add("Five");
			set1.add("Six");
			set.add("Three");
				
				//creating iterator object
				Iterator<String> itr1=set1.iterator();
				int j=0;
				System.out.println("LinkedHashSet maintains Insertion Order");
				while(itr1.hasNext()){
					//output will be in ordered state bcoz LinkedHashSet class maintains insertion order
					
					System.out.println((j++)+" Value is "+itr1.next());
				}
		
	}

}
