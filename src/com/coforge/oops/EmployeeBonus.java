package com.coforge.oops;

public class EmployeeBonus {

	String name;
	String desig;

	public EmployeeBonus(String name, String desig) {
		this.name = name;
		this.desig = desig;
	}

	double calcBonus(double basicAllowance) {
		return basicAllowance;
	}

	double calcBonus(double basicAllowance, double carAllowance) {
		return basicAllowance + carAllowance;
	}

	double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
		return basicAllowance + carAllowance + houseAllowance;
	}

}
