package com.ojas;

import java.util.Scanner;

public class GetTwinPrimes
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num1 and Num2");
	int number1=sc.nextInt();
	int number2=sc.nextInt();
		for(int i=number1;i<=number2;i++) {
			if(isPrime(i)==true&&isPrime(i+2)) {
				System.out.println("("+i+","+(i+2)+")");
				
				
			}
		}
	}

	private static boolean isPrime(int number) {
		if(number<=1) {
			return false;
		}
		for(int j=2;j<=number/2;j++) {
			
			if(number%j==0) {
				return false;
			}
		}
		return true;
	}

}
