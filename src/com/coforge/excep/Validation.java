package com.coforge.excep;

public class Validation {
	String[] names = {"saurav","rahul","vivek"};
	
	 public boolean checkName(String name) throws NameExistException {
		for (String val : names ) {
				if(val.equals(name))
				throw new NameExistException("Already Exists");		
				}
		 return true;	
  }
	  void checkPassword(String password) throws PassTooLongException, PassTooSmallException {
			if(password.length()<5) {
					throw new PassTooSmallException("Password is too small");
			} else if(password.length()>8) {
					throw new PassTooLongException("Password is too long");
			} else {
					System.out.println("Registered");
			} 
	 }
}
