package com.ojas.coding;

import java.util.Scanner;

public class ArrayElementseachSideEqualOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size = sc.nextInt();
		int numbers[] = new int[size];
		System.out.println("Enter a array Elements");
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = sc.nextInt();

		}
		System.out.println(findEqualOrNot(numbers));

	}

	private static Boolean findEqualOrNot(int[] numbers) {
		int leftSideSum = 0;
		int rightSideSum = 0;
		int middle = numbers.length / 2;
		if (numbers.length == 2) {
			if (numbers[0] == numbers[1]) {
				return true;
			}

		} else {

			for (int check = 0; check <= middle; check++) {
				leftSideSum += numbers[check];

			}
			for (int check = middle + 1; check < numbers.length; check++) {
				rightSideSum += numbers[check];

			}
			System.out.println(leftSideSum);
			System.out.println(rightSideSum);
			if (leftSideSum == rightSideSum) {

				return true;
			}
		}
		return false;

	}

}
