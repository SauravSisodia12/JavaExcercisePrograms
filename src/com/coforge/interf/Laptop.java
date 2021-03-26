package com.coforge.interf;

public class Laptop extends Gadgets implements Insurance {

	public Laptop(String modelName, double price) {
		super(modelName, price);
	}

	@Override
	public void showAccessories() {
		System.out.println("Accessories = Charger, Mic, USB, Mouse");
		
	}

	@Override
	public void getInsDetails() {
		System.out.println("Insurance = theft or demage");
		
	}

	@Override
	public void getDiscountedPrice(int amount) {
		System.out.println("Discounted Price : "+(price-amount-200));
		
	}

	
}
