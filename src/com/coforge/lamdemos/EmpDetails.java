package com.coforge.lamdemos;

public class EmpDetails {
	
	String desig,name;
	double amount;

	void showBonus(String name, String desig, BonusCalculator bcal,int amount) {
		System.out.println("Welcome "+name+" ("+desig+") ");
		System.out.println("Bonus for you is "+bcal.calculateBonus(amount));
	}
}
