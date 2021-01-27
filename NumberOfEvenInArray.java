package com.ojas;

import java.util.Scanner;

public class NumberOfEvenInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = sc.nextInt();
		int inputarr[] = new int[size];
		System.out.println("Enter Array Elements");
		for (int index = 0; index < inputarr.length; index++) {
			inputarr[index] = sc.nextInt();

		}
		countOfEvenNumbersinArray(inputarr);
	}

	private static void countOfEvenNumbersinArray(int[] inputarr) {
		int count = 0;
		for (int check = 0; check < inputarr.length; check++) {
			if (check % 2 == 0) {
				count++;
			}

		}
		System.out.println(count);
	}

}
