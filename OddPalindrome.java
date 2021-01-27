package com.String;

import java.util.Scanner;

public class OddPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 and number2");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();

		getOddPalindromes(number1, number2);
	}

	private static void getOddPalindromes(int number1, int number2) {
		for (int i = number1; i <= number2; i++) 
		{
			if(i%2!=0) 
			{
			palindromeCheck(i);
		}   }

	}

	private static void palindromeCheck(int number) {
		int revnumber = getReverse(number);
		if (number == revnumber) {
			System.out.println(number + "  is palindrome ");
		}

	}

	private static int getReverse(int number) {
		int revnumber = 0;
		while (number != 0) {
			int rem = number % 10;
			revnumber = revnumber * 10 + rem;
			number = number / 10;
		}
		return revnumber;

	}

}
