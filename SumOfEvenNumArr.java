package com.String;

import java.util.Scanner;

public class SumOfEvenNumArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array Size");
		int size = sc.nextInt();
		System.out.println("Enter your Array Elements");
		int[] inputArr = new int[size];
		for (int i = 0; i < size; i++) {
			inputArr[i] = sc.nextInt();

		}
		System.out.println(getSumOfEvenNumbers(inputArr));

	}

	private static int getSumOfEvenNumbers(int[] inputArr) {
		int evenSum = 0;
		if (inputArr.length == 0) {
			return -1;
		}
		for (int i = 0; i < inputArr.length; i++) 
		{
			if (inputArr[i] < 0)
			{
				return -1;
			} else if (inputArr[i] == 0)
			{
				return -2;
			} else if (inputArr[i] % 2 == 0)
			{
				evenSum += inputArr[i];

			}
		}
		return evenSum;

	}

}
