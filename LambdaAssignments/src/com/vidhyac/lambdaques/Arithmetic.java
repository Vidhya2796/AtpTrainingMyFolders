package com.vidhyac.lambdaques;
//Write an application to perform basic arithmetic operations like add, subtract, multiply & divide. 
//You need to define a functional interface first
public class Arithmetic {
	int number1;
	int number2;
	
	Arithmetic(){
		number1 = 10;
		number2 = 20;
	}
	
	public Arithmetic(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	@Override
	public String toString() {
		return "Arithmetic [number1=" + number1 + ", number2=" + number2 + "]";
	}
	
	Calculate lambdaAdd = (number1,number2) -> number1 - number2;
	
	Calculate lambdaSub = (number1,number2) -> number1 - number2;
	
	Calculate lambdaMul = (number1,number2) -> number1 * number2;
	
	Calculate lambdaDiv = (number1,number2) -> number1 / number2;
	

}
