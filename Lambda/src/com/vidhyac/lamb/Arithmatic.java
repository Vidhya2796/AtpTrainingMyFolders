package com.vidhyac.lamb;

public class Arithmatic {
	int number1;
	int number2;
	
	public Arithmatic(int number1, int number2) {
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
		return "Arithmatic [number1=" + number1 + ", number2=" + number2
				+ ", lambdaAdd=" + lambdaAdd + ", lambdaSub=" + lambdaSub
				+ ", lambdaMul=" + lambdaMul + ", lambdaDiv=" + lambdaDiv + "]";
	}


	//lambda expressions
	//lambdaAdd is like the object of interface
	Calculate lambdaAdd = (number1,number2) -> number1 + number2;
	Calculate lambdaSub = (number1,number2) -> number1 - number2;
	Calculate lambdaMul = (number1,number2) -> number1 * number2;
	Calculate lambdaDiv = (number1,number2) -> number1 / number2;
	
	
			
	public void printResult() {
		System.out.println("The numbers are "+number1 + " and " +number2);
		System.out.println("Addition is "+lambdaAdd.result(number1, number2));
		System.out.println("Subtraction is "+lambdaSub.result(number1, number2));
		System.out.println("Multiplication is "+lambdaMul.result(number1, number2));
		System.out.println("Division is "+lambdaDiv.result(number1, number2));
	}
	
	
}
