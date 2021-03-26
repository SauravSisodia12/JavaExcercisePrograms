package com.coforge.oops;

import java.util.Scanner;

public class OverloadBonus {

	public static void main(String[] args) {
		String name;
		String desig;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter name : ");
		name = input.nextLine();
		System.out.println("Enter Designation : ");
		desig = input.nextLine();

		EmployeeBonus employee = new EmployeeBonus(name, desig);

		if (employee.desig.equals("Manager")) {
			System.out.println("Basic Allowance + Car Allowance : " + employee.calcBonus(5000, 3000));
		} else if (employee.desig.equals("Programmer")) {
			System.out.println("Basic Allowance : " + employee.calcBonus(5000));
		} else if (employee.desig.equals("Director")) {
			System.out.println(
					"Basic Allowance + Car Allowance + House Allowance : " + employee.calcBonus(5000, 3000, 12000));
		} else {
			System.out.println("Invalid Designation ");
		}

		input.close();
	}

}
