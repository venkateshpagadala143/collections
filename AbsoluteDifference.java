package com.ojas;

import java.util.Scanner;

public class AbsoluteDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = sc.nextInt();
		findAbsoulteDiffer(number);
	}
	private static int findAbsoulteDiffer(int number) {
		if (number < 21) {
			number = (21 - number);
			return number;
		} else {
			number = (number - 21) * 2;
			return number;
		}

	}
}
