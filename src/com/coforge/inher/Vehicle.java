package com.coforge.inher;

public class Vehicle {
	
	String brandName;
	int modelNo;
	double price;
	
	public Vehicle(String brandName, int modelNo, double price) {
		this.brandName = brandName;
		this.modelNo = modelNo;
		this.price = price;
	}
	
	void getDetails() {
		
		System.out.println("Brand Name ="+brandName);
		System.out.println("Model No ="+modelNo);
		System.out.println("Price ="+price);
		
	}
	
	double getDiscountedPrice(double amount) {
			return (0);
	}

}
