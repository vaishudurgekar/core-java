package com.xworkz.atm;

public class AtmException extends RuntimeException{
	
	@Override
	public String toString() {
		return "You have reached maximum amount please select valid amount";
	}


}
