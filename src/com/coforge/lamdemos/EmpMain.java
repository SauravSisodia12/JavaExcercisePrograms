package com.coforge.lamdemos;

public class EmpMain {

	public static void main(String[] args) {

		EmpDetails empDetails = new EmpDetails();
		
		empDetails.showBonus("Ram", "Manager", (amount)-> {System.out.println("Manager Bonus"); return amount *5;}, 2000);
		System.out.println();
		empDetails.showBonus("Manoj", "Developer", (amount)-> {System.out.println("Developer Bonus"); return amount *3;}, 2000);
		System.out.println();
		empDetails.showBonus("Sumit", "Admin", (amount)-> {System.out.println("Admin Bonus"); return amount *2;}, 2000);

	}

}
