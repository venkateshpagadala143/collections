package com.ojas.Exersices10;

import java.util.Scanner;

public class NoTeenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		// without using fixteen method
		sumExculdingTherteen(num1, num2, num3);
		// by using Nested for loop
		sumExcludingThrteen1(num1, num2, num3);
		// with using fixteen method
		sumExcludingThrteen2(num1, num2, num3);

	}

	private static void sumExcludingThrteen2(int num1, int num2, int num3) {
		int sum = 0;
		int numbers[] = { num1, num2, num3 };
		for (int index = 0; index < numbers.length; index++) {

			sum += fixteen(numbers[index]);
		}
		System.out.println(sum);
	}

	private static int fixteen(int i) {

		if (i >= 13 && i <= 19 && i != 15 && i != 16) {
			return 0;
		}
		return i;
	}

	private static void sumExcludingThrteen1(int num1, int num2, int num3) {
		int sum = 0;
		int numbers[] = { num1, num2, num3 };
		int ingnoreNum[] = { 13, 14, 17, 18, 19 };
		for (int index = 0; index < numbers.length; index++) {
			for (int check = 0; check < ingnoreNum.length; check++) {
				if (numbers[index] != ingnoreNum[check]) {
					sum += numbers[index];
				}
			}
			System.out.println(sum);
		}
	}

	private static void sumExculdingTherteen(int num1, int num2, int num3) {
		int sum = 0;
		int numbers[] = { num1, num2, num3 };
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] >= 13 && numbers[index] <= 19 && numbers[index] != 15 && numbers[index] != 16) {
			} else {
				sum += numbers[index];
			}
		}
		System.out.println(sum);
	}
}