package com.coforge.interf3;

class Customer implements Benefits,Coverage{

	@Override
	public void customBenefits() {
		System.out.println("Custom Benefits");
		
	}

	@Override
	public void medicalinsurance() {
		System.out.println("Insurance for ladies");
		Benefits.super.medicalinsurance();
		Coverage.super.medicalinsurance();
	}

	@Override
	public void custombenefits() {
		// TODO Auto-generated method stub
		
	}	
}
public class DefDemo {
	public static void main(String[] args) {
		Benefits bm = new Customer();
		bm.customBenefits();
		bm.medicalinsurance();
	}
}
