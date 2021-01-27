package com.ojas.Exception;

public class InsufficientFundsException extends Exception{
	double amount;
	public InsufficientFundsException(String mess) {
		
		System.out.println(mess);
		
	}
	double getAmount() {
		return amount;
		
	}																						

}
