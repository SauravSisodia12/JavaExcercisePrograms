package com.coforge.sorting;

import java.util.Comparator;

public class SortByBrand implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getBrand().compareTo(o2.getBrand());
	}

}
