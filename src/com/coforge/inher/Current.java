package com.coforge.inher;

public class Current extends Account {
	
	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		
		//super.withdraw(amount);
		System.out.println("Current Withdraw ");
		balance = balance - amount;
	}

	@Override
	void deposit(double amount) {
		
		//super.deposit(amount);
		System.out.println("Current Deposit ");
		balance = balance + amount + 100;
	}

}
