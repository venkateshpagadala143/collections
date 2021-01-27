package com.String;

import java.util.Scanner;

public class SecondSmallinArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array Size");
		int size = sc.nextInt();
		System.out.println("Enter your Array Elements");
		int[] inputArr = new int[size];
		for (int i = 0; i < size; i++) 
		{
			inputArr[i] = sc.nextInt();
		}
		System.out.println("print Array");
		for (int i = 0; i < inputArr.length; i++) 
		{
			System.out.println(inputArr[i]);
		}
		int min = getSmallest(inputArr);
		System.out.println("The Smalles Element is : " + min);

		getSecondSmallest(inputArr, min);
	}

	private static void getSecondSmallest(int[] inputArr, int min)
	{
		int secondmin = inputArr[0];
		if (inputArr[0] == min)
		{
			secondmin = inputArr[1];

		}
		for (int i = 1; i < inputArr.length; i++)
		{
			if (secondmin > inputArr[i] && inputArr[i] != min) 
			{
				secondmin = inputArr[i];
			}

		}
		System.out.println("second Smallest Element is : " + secondmin);

	}

	private static int getSmallest(int[] inputArr)
	{
		int min = inputArr[0];
		for (int i = 1; i < inputArr.length; i++)
		{
			if (min > inputArr[i])
			{
				min = inputArr[i];
			}
		}
		return min;

	}

}
