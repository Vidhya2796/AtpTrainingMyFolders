package com.vidhyac.lambda;

public class Greeter {
	public void greet(Greeting greeting){
		//System.out.println("Hello World!");
		greeting.perform();
	}
	public static void main(String[] args) {
		Greeter greeter=new Greeter();
		
		//-->creating an instance of Greeting Interface which is a custom class that we have written
		//helloWorldGreeting is an object of the implementation class HelloWorldGreeting which implements the [only method(perform) in the] Greeting Interface
		Greeting helloWorldGreeting=new HelloWorldGreeting();
		//greeter.greet(helloWorldGreeting);
		
		//lambdaFunction also directly implements the [only method(perform) in the] Interface so both(helloWorldGreeting,lambdaFunction) are in the type Greeting 
		//type of a lambda expreesion is an interface that has a method of that type
		//interface implementation class obj creation
		//lambda expression
		Greeting lambdaGreeting = () -> System.out.println("Hello World!");
		//greeter.greet(lambdaGreeting);
		
		//In a way we are implementing an interface by implementing a function not by a class
		//helloWorldGreeting.perform();
		//lambdaGreeting.perform();
		//anonymous class
		Greeting innerClassGreeting=new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Hellooo");
			}
		};
		greeter.greet(innerClassGreeting);
		greeter.greet(lambdaGreeting);
		
	}
}
