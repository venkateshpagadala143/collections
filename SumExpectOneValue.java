package com.ojas.Exersices10;

import java.util.Scanner;

public class SumExpectOneValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sumExculdingTherteen(num1, num2, num3);
	}

	private static void sumExculdingTherteen(int num1, int num2, int num3) {
		int sum = 0;
		int numbers[] = { num1, num2, num3 };
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] == 13) {
				break;

			}
			sum += numbers[index];
		}
		System.out.println(sum);
	}

}
