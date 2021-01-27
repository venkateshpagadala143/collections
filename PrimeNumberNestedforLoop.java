package com.ojas;

import java.util.Scanner;

public class PrimeNumberNestedforLoop {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your prime number range");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		getPrimeNumbers(num1, num2);

	}

	private static void getPrimeNumbers(int num1, int num2) {
		int count;
		for (int prime = num1; prime <= num2; prime++) {
			count = 1;
			for (int num = 2; num <= prime / 2; num++) {
				if (prime % num == 0) {
					count++;
				}
			}
			if (count == 1 && prime > 1) {
				System.out.println(prime + " : is prime number");
			}
		}

	}

}
