package com.coforge.sorting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import com.coforge.utild.Customer;

public class DeSerialProduct {

	public static void main(String[] args) {
		
		FileInputStream fin = null;
		ObjectInputStream os = null;
		try {
			fin = new FileInputStream("prod1.ser");
			os = new ObjectInputStream(fin);
			ArrayList<Product> productList = (ArrayList<Product>) os.readObject();
			System.out.println(productList);
			System.out.println();
			
			System.out.println("Sort By Category Using newList");
			
			Collections.sort(productList,(m1,m2)-> { 
				return m1.getCategory().compareTo(m2.getCategory());
				});
				for(Product product : productList) {
					System.out.println(product);
				}	
					System.out.println();
					
					System.out.println("List of Electronics");
					String elec = "Electronics";
					ArrayList<Product> listByElectronics = new ArrayList<>();
					for(Product product2: productList) {
						if(product2.getCategory().equalsIgnoreCase(elec))
						listByElectronics.add(product2);
					}
					Iterator<Product> j = listByElectronics.iterator();
					while(j.hasNext()) {
						Product pr = j.next();
						System.out.println(pr);
					}
					
					System.out.println();
					System.out.println("Sorted By Brand Using Comparator");
					Comparator<Product> comp = new SortByBrand();
					Collections.sort(productList,comp);
					for(Product prod : productList) {
						System.out.println(prod);
					}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if (fin != null || os != null) {
				try {
					fin.close();
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
}
}