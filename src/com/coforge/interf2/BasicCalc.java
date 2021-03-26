package com.coforge.interf2;

public class BasicCalc implements Calculator {

	@Override
	public void add(int x, int y) {
		System.out.println("Addition = "+(x+y));
		
	}

	@Override
	public void sub(int x, int y) {
		System.out.println("Subtraction = "+(x-y));
		
	}

	@Override
	public void prod(int x, int y) {
		System.out.println("Product = "+(x*y));
		
	}

	@Override
	public void div(int x, int y) {
		System.out.println("Division = "+(x/y));
		
	}



}
