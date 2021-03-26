package com.coforge.basics;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		int num, number, temp, total = 0;
		int digit = 0;
		System.out.println("Enter Number = ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();
		number = num;

		while (number > 0) {
			number = number / 10;
			digit++;
		}

		number = num;

		while (number > 0) {
			temp = number % 10;
			total = (int) (total + Math.pow(temp, digit));
			number = number / 10;
		}

		if (total == num)
			System.out.println(num + " is an Armstrong number");
		else
			System.out.println(num + " is not an Armstrong number");

	}

}
