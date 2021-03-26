package com.coforge.interf2;

public class CalcMain {

	public static void main(String[] args) {
		
		Calculator cal = new BasicCalc();
		cal.add(10,5);
		cal.sub(10, 5);
		cal.prod(10, 5);
		cal.div(10, 5);
		Scientific sc = new Scifi();
		sc.sq(5);
		sc.cube(5);

	}

}
