package com.coforge.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialStud {

	public static void main(String[] args) {
		Student st = new Student("Rohan",10,"Sports");
		System.out.println(st);
		FileOutputStream fs = null;
		ObjectOutputStream os = null;

		try {
			fs = new FileOutputStream("stud2.ser");
			os = new ObjectOutputStream(fs);
			os.writeObject(st);
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
