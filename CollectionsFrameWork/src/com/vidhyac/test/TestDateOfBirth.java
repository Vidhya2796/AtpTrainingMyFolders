package com.vidhyac.test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.vidhyac.collection.DateOfBirth;

public class TestDateOfBirth {

	public static void main(String[] args) {
		HashMap<DateOfBirth, String> map = new HashMap<DateOfBirth, String>();
		System.out.println("Initial List of elements: " + map);
		map.put(new DateOfBirth(27, 04, 1990), "Vidhya");
		map.put(new DateOfBirth(24, 11, 1992), "Pechi");
		map.put(new DateOfBirth(04, 01, 1994), "Nivetha");
		map.put(new DateOfBirth(24, 11, 1996), "Kavin");
		map.put(new DateOfBirth(12, 8, 1998), "Barath");

		Set<Entry<DateOfBirth, String>> s1 = map.entrySet();
		for (Entry<DateOfBirth, String> entry : s1) {
			System.out.println(entry.getKey() + "    " + entry.getValue());
		}
		System.out.println();

		Set<Entry<DateOfBirth, String>> s = map.entrySet();

		label1: // outer for loop
		for (Entry<DateOfBirth, String> outerEntry : s) {

			label2: // inner for loop
			for (Entry<DateOfBirth, String> innerEntry : s) {

				if ((outerEntry.getKey().getDd() == innerEntry.getKey().getDd())
						&& (outerEntry.getKey().getMm() == innerEntry.getKey()
								.getMm())
						&& (outerEntry.getKey().getYyyy() == innerEntry
								.getKey().getYyyy())) {
					continue label2;
				}

				if ((outerEntry.getKey().getDd() == innerEntry.getKey().getDd())
						&& (outerEntry.getKey().getMm() == innerEntry.getKey()
								.getMm())) {
					System.out.println("DateOfBirth of "
							+ outerEntry.getValue() + " is "
							+ outerEntry.getKey().getDd() + "/"
							+ outerEntry.getKey().getMm() + "/"
							+ outerEntry.getKey().getYyyy()
							+ " has same day and month with "
							+ innerEntry.getValue() + " is "
							+ innerEntry.getKey().getDd() + "/"
							+ innerEntry.getKey().getMm() + "/"
							+ innerEntry.getKey().getYyyy());
					System.out.println("FAILED!");
					break label1;
				}

			}
			System.out.println("DateOfBirth: " + outerEntry.getKey().getDd()
					+ "/" + outerEntry.getKey().getMm() + "/"
					+ outerEntry.getKey().getYyyy() + "   Name: "
					+ outerEntry.getValue());
			// System.out.println(entry.getKey()+"    "+entry.getValue());
		}
	}
}