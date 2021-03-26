package com.coforge.interf;

public class Mobile extends Gadgets implements Insurance {

	public Mobile(String modelName, double price) {
		super(modelName, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getInsDetails() {
		System.out.println("Insurance = theft or damage");

	}

	@Override
	public void showAccessories() {
		System.out.println("Accessories = Charger, Earphones");
		
	}

	@Override
	public void getDiscountedPrice(int amount) {
		System.out.println("Discounted Price : "+(price-amount-500));
		
	}

}
