package com.coforge.basics;

public class ArrayReversal {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6 };
		int l = ar.length - 1;
		int[] rev = new int[100];

		for (int i = 0; i <= l; i++) {
			rev[i] = ar[l - i];

		}

		for (int i = 0; i <= l; i++) {
			System.out.println(rev[i]);

		}

	}

}
