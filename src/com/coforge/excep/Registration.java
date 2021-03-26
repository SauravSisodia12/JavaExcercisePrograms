package com.coforge.excep;

import java.util.Scanner;

public class Registration {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter User Name = ");
		try { 
		String name = input.next();
		Validation check = new Validation();
		boolean status = check.checkName(name);
		if(status) {
			System.out.print("Enter Password = ");
			String password = input.next();
			check.checkPassword(password);
			System.out.println("You are registered ");
			}
		}
		catch (NameExistException | PassTooLongException | PassTooSmallException e) {
			System.out.println(e.getMessage());
		}
		input.close();
	}
}
