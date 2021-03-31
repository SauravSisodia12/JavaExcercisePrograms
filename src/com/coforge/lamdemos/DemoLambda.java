package com.coforge.lamdemos;

public class DemoLambda {

	public static void main(String[] args) {
		
		Greeter gt = (String message)-> System.out.println("Have a Great Day "+message);
		Greeter gt2 = (String message)-> System.out.println("Welcome to threads "+message);
		Greeter gt3 = (String message)-> System.out.println("Goodbye "+message);
		
		gt.greetMessage("Saurav");
		gt2.greetMessage("Saurav");
		gt3.greetMessage("Saurav");
	}

}
