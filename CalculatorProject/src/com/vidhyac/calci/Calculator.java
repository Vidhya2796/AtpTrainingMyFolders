package com.vidhyac.calci;

public class Calculator {
	
	public int add(int num1,int num2){
		return num1 + num2;
	}
	public int sub(int num1,int num2){
		return num1 - num2;
	}
	public int mul(int num1,int num2){
		return num1 * num2;
	}
	public int div(int num1,int num2){
		return num1 / num2;
	}
	/*public void calci(){
	
		while(true){
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.End");
			System.out.println("Enter your choice ");
			Scanner scanner=new Scanner(System.in);
			int choice = scanner.nextInt();
			if(choice==5){
				break;
			}
			System.out.println("Enter number 1 ");
	 		int number1 = scanner.nextInt();
			System.out.println("Enter number 2 ");
			int number2 = scanner.nextInt();
			
	 		
			if(choice==1){
				System.out.println("Addition is "+add(number1, number2));
			}else if(choice==2){
				System.out.println("Subtraction is "+sub(number1, number2));
			}else if(choice==3){
				System.out.println("Multiplication is "+mul(number1, number2));
			}else if(choice==4){
				System.out.println("Division is "+div(number1, number2));
			}
			System.out.println();
		}
	
	}	*/
}
	
	
