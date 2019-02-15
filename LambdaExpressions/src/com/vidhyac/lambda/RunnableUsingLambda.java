package com.vidhyac.lambda;

public class RunnableUsingLambda {

	public static void main(String[] args) {
		runnableUsingAnonymousClass();
		runnableUsingLambdaExpression();
	}

	private static void runnableUsingLambdaExpression() {
		Runnable runnable = () -> System.out.println("Task executing inside lambda"); 
		runnable.run();
	}

	private static void runnableUsingAnonymousClass() {
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Task is executing...");
				
			}
		});
		thread.run();
	}

}
