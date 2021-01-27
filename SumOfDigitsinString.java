package com.ojas.String;

import java.util.Scanner;

public class SumOfDigitsinString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String ");
		String name = sc.next();
		sumOfDigitsInString(name);
	}

	private static void sumOfDigitsInString(String name) {
		int sum = 0;
		char[] nums = name.toCharArray();
		for (int i = 0; i < nums.length; i++) {
			if (Character.isDigit(nums[i])) {
				int num = Character.getNumericValue(nums[i]);
				if (num < 9 && num > 0) {
					sum += num;
				}
			}

		}

		System.out.println(sum);
	}

}
