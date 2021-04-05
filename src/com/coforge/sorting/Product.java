package com.coforge.sorting;

import java.io.Serializable;

public class Product implements Serializable,Comparable<Product> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name,category,brand;
	int price;
	
	public Product(String name, String category, String brand, int price) {
		super();
		this.name = name;
		this.category = category;
		this.brand = brand;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", brand=" + brand + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Product o) {
		return this.getBrand().compareTo(o.getBrand());
	}
	
	
}
