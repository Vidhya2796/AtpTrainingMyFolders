package com.vidhyac.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Append {

	public static void main(String[] args) {
		//Convert every key-value pair of the map into a string and append them all into a single string, 
		//in iteration order. HINT: Use Map.entrySet() method & a StringBuilder to construct the result String.
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Vidhya", 12);
		hm.put("Sneha", 46);
		hm.put("Poojitha", 3);
		hm.put("Sudha", 17);
		hm.put("Dhivya", 50);
		
		
		System.out.println(hm);
		System.out.println();
		Set<Entry<String, Integer>> set=hm.entrySet();
		System.out.println(set);
		System.out.println();
		//creating ArrayList
		ArrayList<String> arr=new ArrayList<String>();
		
		for(Entry<String, Integer> each : set ){
			
			arr.add(each.getKey()+each.getValue());
			
		}
		arr.stream().sorted().forEach(str -> System.out.println(str));
		String append=arr.stream().sorted().reduce("",(conc,str)->conc+str);
		System.out.println(append);

	}

}
