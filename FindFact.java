package com.ojas;

import java.util.Scanner;

public class FindFact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		findFactorial(num);

	}

	private static void findFactorial(int num) {

		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact *= i;

		}
		System.out.println("Factorial of " + num + " is " + fact);
	}

}
