package com.coforge.lamdemos;

public class Sample {
	public static void main(String[] args) {

		BonusCalculator mbonus = (amount)-> {
			return amount*5;
		};
		BonusCalculator dbonus = (amount)-> {
			return amount*3;
		};
		BonusCalculator abonus = (amount)-> {
			return amount*2;
		};
		
		System.out.println(mbonus.calculateBonus(2000));
		System.out.println(dbonus.calculateBonus(2000));
		System.out.println(abonus.calculateBonus(2000));
		
		
	}
}
