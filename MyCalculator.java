package com.ojas.ArrengeString;

import java.util.Scanner;

interface AdvancedArithmetic {
	public abstract int divisorSum(int number);
}

public class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int number) {
		int sum = number;
		for (int i = 1; i <= number / 2; i++) {

			if (number % i == 0) {

				sum += i;
			}

		}
		return sum;

	}

	public static void main(String[] args) {
		MyCalculator cal = new MyCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		System.out.println(cal.divisorSum(num));

	}

}
