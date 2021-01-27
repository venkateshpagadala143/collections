package com.String;

import java.util.Scanner;

public class QudraticSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any Number");
		int number = sc.nextInt();
		
		System.out.println(getNthTerm(number));
	}

	private static int getNthTerm(int number) {
		int sum = 1;
		for (int i = 2; i <= number; i++)
		{
			System.out.println(i);
			sum += i;
		}

		return sum;
	}

}
