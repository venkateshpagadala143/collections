package com.sorting;

import java.util.Scanner;

public class RecursiveInsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size = sc.nextInt();
		int inputArr[] = new int[size];
		System.out.println("Enter the Array Elements");
		for (int index = 0; index < inputArr.length; index++) {
			inputArr[index] = sc.nextInt();
		}

		recursiveInsertionSort(inputArr, inputArr.length);
		// printing Sorted Array
		for (int index = 0; index < inputArr.length; index++) {
			System.out.println(inputArr[index]);

		}
	}

	private static void recursiveInsertionSort(int[] inputArr, int arrlength) {
		if (arrlength <= 1) {
			return;
		}
		// calling insertion sort recursively
		recursiveInsertionSort(inputArr, arrlength - 1);

		int last = inputArr[arrlength - 1];
		int first = arrlength - 2;
		// To arrange the Array elements in order
		while (first >= 0 && inputArr[first] > last) {
			inputArr[first + 1] = inputArr[first];
			first--;
		}
		inputArr[first + 1] = last;

	}

}
