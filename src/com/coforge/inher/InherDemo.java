package com.coforge.inher;

import java.util.Scanner;

public class InherDemo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Choice (car or bike) = ");
		String choice = input.next();
		Vehicle vc = null;
		switch (choice) {
		case "car":
			vc = new Car("Maruti",5352,500000,"Alloy Wheels");
			vc.getDetails();
			System.out.println("Discounted Price = "+vc.getDiscountedPrice(0.20));
			Car car = (Car)vc;
			car.showAcc();
			System.out.println();
			break;
		case "bike":
			vc = new Bike("Honda",8595,70000,"35 kmpl");
			vc.getDetails();
			System.out.println("Discounted Price = "+vc.getDiscountedPrice(0.10));
			Bike bike = (Bike)vc;
			bike.showMileage();
			System.out.println();
			break;	

		default:System.out.println("Wrong Selection");
			break;
		}
		
		input.close();

	}

}
