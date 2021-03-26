package com.coforge.basics;

public class Dupl {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 7, 9, 2, 5, 7 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}

	}

}
