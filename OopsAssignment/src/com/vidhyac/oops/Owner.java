package com.vidhyac.oops;

import java.util.Scanner;

public class Owner extends DessertItem{

	@Override
	public double getCost() {
		double canRate=3;//rate per candy is 3 dollars
		double cooRate=5;//rate per candy is 3 dollars
		double iceRate=7;//rate per candy is 3 dollars
		
		
		return 0;
	}
	public void shopStorage(){
		int n=0,can=0,coo=0,ice=0;
		//int store[]=new int[3];
		String storeName[]=new String[3];
		
		while(n < 3 ){
			System.out.println("1.Candy");
			System.out.println("2.Cookie");
			System.out.println("3.IceCream");
			System.out.println("4.End");
			
			System.out.println("Choose the item to store in the shop");
			Scanner scan=new Scanner(System.in);
			int item=scan.nextInt();
			if(item==1){
				can++;
				if(can >= 2){
					System.out.println("You have already placed Candy..Choose another");
					//n--;
					continue;
				}
				System.out.println("Candy is stored");
				storeName[n]="Candy";
				//store[n]=item;
			}
			if(item==2){
				coo++;
				if(coo >= 2){
					System.out.println("You have already placed Cookie..Choose another");
					//n--;
					continue;
				}
				
				System.out.println("Cookie is stored");
				storeName[n]="Cookies";
				//store[n]=item;
			}
			if(item==3){
				ice++;
				if(ice >= 2){
					System.out.println("You have already placed IceCream..Choose another");
					//n--;
					continue;
				}
				System.out.println("Icecream is stored");
				storeName[n]="Icecream";
				//store[n]=item;
			}
			if(item==4)
				break;
			
			n++;
		}//while loop over
		System.out.println("Welcome to our Dessert Shop!! The items in our shop are..");
		//System.out.println(n);
		for(int i=0;i<n;i++){
			
			System.out.println(storeName[i]);
		}
		
	}//method over
	
}//class over
