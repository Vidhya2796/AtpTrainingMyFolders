package com.vidhyac.test;

import java.util.Scanner;

import com.vidhyac.oops.Candy;
import com.vidhyac.oops.Cookie;
import com.vidhyac.oops.Customer;
import com.vidhyac.oops.IceCream;
import com.vidhyac.oops.Owner;

public class TestDessert {
	public static void testDessert(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Owner");
		System.out.println("2.Customer");
		System.out.println("Enter the number to choose your role");
		int role=sc.nextInt();
		
		if(role==1){
			Owner owner =new Owner();
			owner.shopStorage();
		}
		if(role==2){
			Customer customer =new Customer();
			customer.placeOrder();
			
		}
		Candy candy=new Candy();
		candy.getCost();
		
		Cookie cookie=new Cookie();
		cookie.getCost();
		
		IceCream iceCream=new IceCream();
		iceCream.getCost();
		
		
		
		
	}
	public static void main(String[] args) {
		testDessert();

	}

}
