package com.coforge.interf3;

public interface Benefits {
	void customBenefits();
	default void medicalinsurance() {
		System.out.println("Medical insurance for all");
	}
}

interface Coverage{
	void custombenefits();
	default void medicalinsurance() {
		System.out.println("Medical insurance for oll");
	}
}
