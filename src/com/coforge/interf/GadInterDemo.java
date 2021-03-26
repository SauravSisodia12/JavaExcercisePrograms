package com.coforge.interf;

public class GadInterDemo {

	public static void main(String[] args) {
		Gadgets tv = new TV("Samsung", 90000);
		tv.getDetails();
		tv.showAccessories();
		tv.getDiscountedPrice(9000);
		System.out.println();
		
		Gadgets mb = new Mobile("Apple", 90000);
		mb.getDetails();
		mb.showAccessories();
		Insurance ins = (Insurance) mb;
		ins.getInsDetails();
		mb.getDiscountedPrice(5000);
		System.out.println();
		
		Gadgets lp = new Laptop("Dell", 80000);
		lp.getDetails();
		lp.showAccessories();
		Insurance ins2 = (Insurance) lp;
		ins2.getInsDetails();
		lp.getDiscountedPrice(8000);
	}
}
