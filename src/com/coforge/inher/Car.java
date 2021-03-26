package com.coforge.inher;

class Car extends Vehicle {

	String acc;
	public Car(String brandName, int modelNo, double price, String acc) {
		super(brandName, modelNo, price);
		this.acc = acc;
}
	void showAcc() {
		System.out.println("Car Acc : "+acc);
	}
	double getDiscountedPrice(double amount) {
		double disP = price*amount;
		return (disP);
}
}