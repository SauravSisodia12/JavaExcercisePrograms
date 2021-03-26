package com.coforge.basics;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter no : ");
		int num = input.nextInt();
		input.close();

		if (num == Math.pow(Math.sqrt(num), 2)) {
			System.out.println(num + " is perfect square");
		} else {
			System.out.println(num + " is not a perfect square");
		}

	}

}
