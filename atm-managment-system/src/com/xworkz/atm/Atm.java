package com.xworkz.atm;

public class Atm {
	
	public void check(int amount) {
		System.out.println("Check method started");
		
		if(amount >=50000 || amount%100!=0) {
			System.out.println("Withdraw your amount");
			throw new AtmException();
		}
		else {
			System.out.println("Enter the withdraw amount");
		}
		System.out.println("Check method ended");
	}
}
