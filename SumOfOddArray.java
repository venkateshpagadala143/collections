package com.ojas.TwoDiamentionalArray;

import java.util.Scanner;

public class SumOfOddArray {
	private static int[] insetInputArray() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Array Length");
		int length = s.nextInt();
		System.out.println("Input Array");
		int[] inputArray = new int[length];
		for (int i = 0; i < inputArray.length; i++)
		{
			inputArray[i] = s.nextInt();
		}
		return inputArray;
	}

	public static void main(String[] args)
	{
		//int arr[] = { 1, 2, 3, -4, -5, 6, 7, 8, 9, 10 };
		int arr[]= insetInputArray();

		int oddSum = getOddSum(arr);
		System.out.println("odd number sum in given array is : " + oddSum);

	}

	private static int getOddSum(int[] arr)
	{
		if (arr.length == 10) 
		{
			int sum = 0;
			for (int i = 0; i < arr.length; i++)
			{

				if (arr[i] % 2 == 1) {
					sum = sum + arr[i];
				}
			}
			return sum;

		} else
			return -1;
	}
}
