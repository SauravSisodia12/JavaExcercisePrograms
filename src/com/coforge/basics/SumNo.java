package com.coforge.basics;

import java.util.Scanner;

public class SumNo {

	public static void main(String[] args) {
		int a, b, c, sum;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st No = ");
		a = input.nextInt();
		System.out.println("Enter 2nd No = ");
		b = input.nextInt();
		System.out.println("Enter 3rd No = ");
		c = input.nextInt();
		sum = a + b + c;
		System.out.println(sum);

		input.close();
	}

}
