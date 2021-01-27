package com.ojas;

import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting of natural number");
		int first = sc.nextInt();
		System.out.println("Enter the Last of natural number");
		int last = sc.nextInt();
		System.out.println("Natural numbers from : " + first + " To " + last);
		printNaturalNumbers(first, last);

		for (int i = first; i <= last; i++)
			System.out.println(i);

	}

	static void printNaturalNumbers(int first, int last) {
		for (int i = first; i <= last; i++)
			System.out.println(i);

	}

}
