package com.ojas.Exception;

public class CheckingAccount {
	int accountNum=123456;
	double balence;

	boolean checkAccount(int accountNo) {
		if (accountNum == accountNo) {
			return true;
		}
		return false;

	}

	void diposit(double amount) {
		balence = amount;

	}

	double withdrew(double amount) throws InsufficientFundsException   {
	
		if (balence < amount) {
			
				
			throw new InsufficientFundsException("insufficeint funds");
			
			
		} else {
			balence = balence - amount;
		}
		return balence;
	
		

	}

}
