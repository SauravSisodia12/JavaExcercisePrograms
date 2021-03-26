package com.coforge.basics;

public class Pattern2 {

	public static void main(String[] args) {

		int i, j, k;
		k = 1;
		for (i = 1; i < 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}

	}

}
