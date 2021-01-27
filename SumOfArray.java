package com.ojas.arrays;

public class SumOfArray {
	public static void main(String[] args) 
	{
		int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arraySum = getSum(inputArray);
		System.out.println(arraySum);
	}

	private static int getSum(int[] inputArray)
	{
		if (inputArray.length < 1) 
		{
			return -1;
		}
		int sum = 0;
		for (int i = 0; i < inputArray.length; i++)
		{
			if (inputArray[i] == 0) 
			{
				return -1;

			}
			sum = sum + inputArray[i];
		}
		return sum;

	}

}
