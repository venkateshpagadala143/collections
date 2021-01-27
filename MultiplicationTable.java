package com.ojas;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The num1 and num2");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		getMultiplicationTable(num1, num2);
	}

	private static void getMultiplicationTable(int num1, int num2) {
		for (int table = num1; table <= num2; table++) {
			System.out.println(table + " Table is ");
			System.out.println("-----------------");
			for (int mul = 1; mul <= 10; mul++)

			{
				System.out.println(table + " * " + mul + " = " + (table * mul));
			}
			System.out.println();

		}

	}

}
