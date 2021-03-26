package com.coforge.basics;

public class BigSmall {

	public static void main(String[] args) {
		int [] arr = {4,6,1,8,3,0,5};
		int val = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=val)
			{
				val=arr[i];
			}
		}
		int val2 = val;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=val2)
			{
				val2=arr[i];
			}
		}
		
		System.out.println("Greatest in array : "+val);
		System.out.println("Smallest in array : "+val2);

	}

}
