package com.ojas.Exception;

import java.util.Scanner;

public class BankDemo {
	public static void main(String[] args) throws InsufficientFundsException {
		Scanner sc=new Scanner(System.in);
		CheckingAccount chkacc=new CheckingAccount(); 
		System.out.println("your Account number is  :"+chkacc.accountNum);
		
		System.out.println("please Enter an Account Number");
		if(chkacc.checkAccount(sc.nextInt()))
		{
			System.out.println("please Enter Diposit Amount");
			chkacc.diposit(sc.nextDouble());

			System.out.println("please Enter Withdrew Amount");
			System.out.println(chkacc.withdrew(sc.nextDouble()));
		}else {
			System.out.println("please enter Valid Account number");
		}
		
		
		
	}

}
