package com.ojas.Exersices10;

import java.util.Scanner;

public class SumofDigitsinString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name with sum values");
		String name = sc.next();
		sumOfDigitsinString(name);
	}
	private static void sumOfDigitsinString(String name) {
		int sum = 0;
		char checkDigit[] = name.toCharArray();
		for (int index = 0; index < checkDigit.length; index++) {
			if (Character.isDigit(checkDigit[index])) {
				sum += Character.getNumericValue(checkDigit[index]);
			}

		}
		System.out.println(sum);
		

	}

}
