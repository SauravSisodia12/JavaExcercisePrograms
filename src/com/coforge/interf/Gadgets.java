package com.coforge.interf;

public abstract class Gadgets implements Accessories {
	public Gadgets(String modelName, double price) {
		super();
		this.modelName = modelName;
		this.price = price;
	}
	String modelName;
	double price;
	
	public void getDetails() {
		System.out.println(modelName+" = "+price);
	}
	public abstract void getDiscountedPrice(int amount);
}
