package com.coforge.interf;

public class TV extends Gadgets {

	public TV(String modelName, double price) {
		super(modelName, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showAccessories() {
		System.out.println("Accessories = Set-Top Box");
		
	}

	@Override
	public void getDiscountedPrice(int amount) {
		System.out.println("Discounted Price : "+(price-amount));
		
	}


	
}
