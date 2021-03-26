package com.coforge.interf2;

public class Scifi extends BasicCalc implements Scientific {

	@Override
	public void sq(int x) {
		System.out.println("Square = "+(x*x));
	}

	@Override
	public void cube(int x) {
		System.out.println("Cube = "+(x*x*x));

	}

}
