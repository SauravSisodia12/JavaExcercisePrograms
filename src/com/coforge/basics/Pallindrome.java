package com.coforge.basics;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {

		int num, number, temp;
		int rev = 0;
		System.out.println("Enter Number = ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();
		number = num;

		while (number > 0) {
			temp = number % 10;
			rev = rev + temp;
			rev = rev * 10;
			number = number / 10;
		}

		if (num == rev / 10)
			System.out.println(num + " is Pallindrome");

	}

}
