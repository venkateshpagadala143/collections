package com.ojas;

import java.util.Scanner;

public class SumofNatNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting of natural number");
		int first = sc.nextInt();
		System.out.println("Enter the Last of natural number");
		int last = sc.nextInt();
		System.out.println("Natural numbers numbers from : " + first + " To " + last);
		getSumofNaturalNumbers(first, last);

	}

	private static void getSumofNaturalNumbers(int first, int last) {
		int sum = 0;
		for (int i = first; i <= last; i++) {
			sum += i;

		}
		System.out.println("sum of natural numbers is :" + sum);

	}

}
