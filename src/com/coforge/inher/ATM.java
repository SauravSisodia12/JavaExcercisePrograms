package com.coforge.inher;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		System.out.println("\tABC BANK");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Account type (s or c) = ");
		String accType = input.next();
		Account acc = null;
		if (accType.equals("s")) {
			acc = new Savings(15000);
			System.out.print("Enter (d or w) to depost or withdraw = ");
			String action = input.next();
			switch (action) {
			case "d":
				System.out.print("Enter amount you want to deposit = ");
				int dep = input.nextInt();
				acc.deposit(dep);
				System.out.println("Balance after Deposit :" + acc.getBalance());
				break;
			case "w":
				System.out.print("Enter amount you want to withdraw = ");
				int wid = input.nextInt();
				acc.withdraw(wid);
				System.out.println("Balance after Withdrawl :" + acc.getBalance());
				break;

			default:
				System.out.println("Wrong Action Selected");
				break;
			}
		} else if (accType.equals("c")) {
			acc = new Current(20000);
			System.out.print("Enter (d or w) to depost or withdraw = ");
			String action = input.next();
			switch (action) {
			case "d":
				System.out.print("Enter amount you want to deposit = ");
				int dep = input.nextInt();
				acc.deposit(dep);
				System.out.println("Balance after Deposit :" + acc.getBalance());
				break;
			case "w":
				System.out.print("Enter amount you want to withdraw = ");
				int wid = input.nextInt();
				acc.withdraw(wid);
				System.out.println("Balance after Withdrawl :" + acc.getBalance());
				break;

			default:
				System.out.println("Wrong Action Selected");
				break;
			}
		} else {
			System.out.println("Wrong input");
		}
		input.close();
	}

}
