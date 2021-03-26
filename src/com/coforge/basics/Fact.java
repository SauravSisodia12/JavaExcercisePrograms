package com.coforge.basics;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter no : ");
		int num = input.nextInt();
		input.close();

		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}

		System.out.println("Factorial of " + num + " is: " + fact);

	}

}
