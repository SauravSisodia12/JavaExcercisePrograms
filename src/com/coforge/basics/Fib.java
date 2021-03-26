package com.coforge.basics;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		int prev = 0, next = 1, sum;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no : ");
		int num = input.nextInt();
		input.close();

		for (int i = 1; i <= num; i++) {
			System.out.print(prev + ", ");
			sum = prev + next;
			prev = next;
			next = sum;
		}

	}

}
