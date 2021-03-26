package com.coforge.inher;

public class Savings extends Account{
	
	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		
		//super.withdraw(amount);
		System.out.println("Savings Withdraw ");
		balance = balance - amount - 100;
	}

	@Override
	void deposit(double amount) {
		
		//super.deposit(amount);
		System.out.println("Savings Deposit ");
		balance = balance + amount;
	}
	
}
