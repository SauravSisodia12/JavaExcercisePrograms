package com.coforge.lamdemos;

public class Student {

	String name,city;

	public Student() {
		super();
	}
	
	void printDetails(String name,String city,StudDetails details,int...marks) {
		System.out.println("Name = "+name);
		System.out.println("City = "+city);
		System.out.println("Average = "+details.getAverage(marks));
	}
}
