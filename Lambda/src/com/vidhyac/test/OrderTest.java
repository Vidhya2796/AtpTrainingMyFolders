package com.vidhyac.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.vidhyac.lamb.Order;

public class OrderTest {

	public static void main(String[] args) {
		List<Order> list =Arrays.asList(
				new Order(4500,"Completed"),
				new Order(3650,"Completed"),
				new Order(12000,"Accepted"),
				new Order(45000,"Completed"),
				new Order(35000,"Accepted")
				);
		List<Order> result=list.stream().filter(index -> index.getPrice() > 10000).collect(Collectors.toList());
		System.out.println(result);		
	}

}
