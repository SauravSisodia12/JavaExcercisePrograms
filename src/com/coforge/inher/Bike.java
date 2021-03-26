package com.coforge.inher;

class Bike extends Vehicle {
	String mileage;
	public Bike(String brandName, int modelNo, double price, String mileage) {	
		super(brandName, modelNo, price);
		this.mileage = mileage;
	}
	void showMileage() {
		System.out.println("Mileage : "+mileage);
	}
	
	double getDiscountedPrice(double amount) {
		double disP = price*amount;
		return (disP);
	}
	
}