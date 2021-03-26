package com.coforge.excep;

import java.util.Scanner;

class Bank {
		int balance;
		
		public Bank(int balance) {
			super();
			this.balance = balance;
		}
		void withdraw(int amount) throws OutOfLimitsException, NagaBalException
		{
		if((balance-amount)<=0) {
				throw new NagaBalException("Balance is in negative");
		} else if(amount>5000) {
				throw new OutOfLimitsException("Balance is in out of limit");
		} else {
				balance = balance - amount;
				System.out.println(balance);
		} 
	}
}


public class ATMDemo {

	public static void main(String[] args) {
		System.out.println("Welcome");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		System.out.println("Amount "+amount);
		Bank bank = new Bank(9000);
		try {
			bank.withdraw(amount);
			System.out.println("Amount Withdrawn");
		}catch(OutOfLimitsException e) {
			System.out.println(e.getMessage());
		}catch(NagaBalException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
