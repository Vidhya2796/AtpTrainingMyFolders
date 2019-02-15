package com.vidhyac.lambda;
//implementation class of Greeting Interface
public class HelloWorldGreeting implements Greeting {

	@Override
	public void perform() {
		System.out.println("HelloWorld!");
	}

}
