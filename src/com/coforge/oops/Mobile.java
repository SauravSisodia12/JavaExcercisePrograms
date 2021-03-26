package com.coforge.oops;

public class Mobile {
	String brandName;
	int modelNo;
	double price;
	
	public Mobile(String brandName,int modelNo, double price) {
		this.brandName = brandName;
		this.modelNo = modelNo;
		this.price = price;
	}
	
	public void getDetails() {
		System.out.println("Mobile : " + brandName);
		System.out.println("Model No : " + modelNo);
		System.out.println("price : " + price);
	}

	public double discountedPrice(double price) {
		price = price-price*0.2;
		return price;
	}

	public static void main(String[] args) {
		Mobile mobile = new Mobile("Apple",4232,50000);
		mobile.getDetails();
		System.out.println("Discounted Price : "+mobile.discountedPrice(mobile.price));

		System.out.println("");

		Mobile mobile1 = new Mobile("Samsung",6322,45000);
		mobile1.getDetails();
		System.out.println("Discounted Price : "+mobile1.discountedPrice(mobile1.price));

	}

}
