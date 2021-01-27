package com.ojas.arrays;

public class ArrayMultiplication {
	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		

		int arraySum = getMultipliesArray(inputArray);
		System.out.println(arraySum);
	}

	private static int getMultipliesArray(int[] inputArray) 
	{
		
		if (inputArray.length < 1)
		{
			return -1;
		}
		int mul = 1;
		for (int i = 0; i < inputArray.length; i++)
		{
			if (inputArray[i] <=0) 
			{
				return 0;

			}
			mul = mul * inputArray[i];
		}
		return mul;
	}

}
