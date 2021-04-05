package com.coforge.sorting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class SerailProduct {

	public static void main(String[] args) {
		
		Product pd1 = new Product("S21","Mobile","Samsung",45000);
		Product pd2 = new Product("TV","Electronics","Apple",45000);
		Product pd3 = new Product("PS5","Electronics","Sony",45000);
		Product pd4 = new Product("Iphone12","Mobile","Apple",45000);
		Product pd5 = new Product("SofaSet","Furniture","Godrej",45000);
		
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(pd1);
		productList.add(pd2);
		productList.add(pd3);
		productList.add(pd4);
		productList.add(pd5);
		
		Iterator<Product> i = productList.iterator();
		while(i.hasNext()) {
			Product p = i.next();
			System.out.println(p);
		}
		System.out.println();
		
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		
		try {
			fs = new FileOutputStream("prod1.ser");
			os = new ObjectOutputStream(fs);
			os.writeObject(productList);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			if(fs!= null || os!= null) {
				try {
					fs.close();
					os.close();
				} catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
