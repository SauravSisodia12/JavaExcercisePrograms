package com.coforge.utild;

import java.util.ArrayList;
import java.util.Iterator;

public class CustDemo {

	public static void main(String[] args) {


		Customer customer1 = new Customer(10,"Saurav","Delhi");
		Customer customer2 = new Customer(11,"Rahul","UP");
		Customer customer3 = new Customer(12,"Sumit","Mumbai");
		Customer customer4 = new Customer(13,"Rishabh","Bangalore");
		Customer customer5 = new Customer(14,"Shobhit","Rjasthan");
		Customer customer6 = new Customer(15,"Rohan","Delhi");

		ArrayList<Customer> list = new ArrayList<>();
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		list.add(customer4);
		list.add(customer5);
		list.add(customer6);
//		System.out.println(list);
		System.out.println("Size of List = "+list.size());
		System.out.println();
		Iterator<Customer> i = list.iterator();
		while(i.hasNext()) {
			Customer c = i.next();
			System.out.println(c);
		}
		System.out.println();
		System.out.println("Delhi Customer Details");
		String city = "Delhi";
		ArrayList<Customer> customerByCity = new ArrayList<>();
		for(Customer customer:list) {
			if(customer.getCity().equalsIgnoreCase(city))
			customerByCity.add(customer);
		}
		
		Iterator<Customer> j = customerByCity.iterator();
		while(j.hasNext()) {
			Customer c = j.next();
			System.out.println(c);
		}
	}

}
