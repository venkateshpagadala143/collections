package com.ojas;

import java.util.Scanner;

public class EvenNumGr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting of natural number");
		int first = sc.nextInt();
		System.out.println("Enter the Last of natural number");
		int last = sc.nextInt();
		System.out.println("Even numbers from : " + first + " To " + last);
		evenNmmbersinGivenRange(first, last);

	}

	private static void evenNmmbersinGivenRange(int first, int last) {
		for (int i = first; i <= last; i++)
			if (i % 2 == 0)
				System.out.println(i);

	}

}
