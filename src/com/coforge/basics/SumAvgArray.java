package com.coforge.basics;

public class SumAvgArray {

	public static void main(String[] args) {
		int total = 0;
		int[] ar = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < ar.length; i++) {
			total = total + ar[i];
		}
		int avg = total / ar.length - 1;

		System.out.println("Sum of array is " + total);
		System.out.println("Average of array is " + avg);
	}

}
