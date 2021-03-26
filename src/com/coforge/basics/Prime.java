package com.coforge.basics;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter no : ");
		int num = input.nextInt();
		input.close();

		if (num == 0 || num == 1) {
			System.out.println(num + " is not prime number");
		} else if (num % 2 == 0) {
			System.out.println(num + " is Prime No");
		} else {
			System.out.println(num + " is not prime No");
		}

	}

}
