package com.vidhyac.collection;
import java.util.*;
public class TestListIterator {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Vidhya");
		list.add("Pechi");
		list.add("Sudha");
		list.add("Priya");
		list.add(0,"Target");		
		list.add("Leo");
		
		ListIterator<String> itr=list.listIterator();
		System.out.println("Values Sorted in Forward Direction");
		while(itr.hasNext()){
			System.out.println("Index is "+itr.nextIndex()+" Value is "+itr.next());
		}
		System.out.println();
		System.out.println("Values Sorted in Reverse Direction");
		while(itr.hasPrevious()){
			System.out.println("Index is "+itr.previousIndex()+" Value is "+itr.previous());
		}
		
	}

}
