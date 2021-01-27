package com.ojas.arrays;

import java.util.Scanner;

public class EvenElementsInArray {

	private static void insetInputArray()
	{
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		System.out.println("Input Array");
		int[] inputArray = new int[10];
		for (int i = 0; i < inputArray.length; i++) 
		{
			inputArray[i] = s.nextInt();
		}
	}

	public static void main(String[] args)
	{

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// insetInputArray();

		if (a.length == 10) {

			int[] b = evenArraySearch(a);
			for (int j = 0; j < b.length - 1; j++)
			{
				System.out.println(b[j]);
			}
		}

	}

	private static int[] evenArraySearch(int[] a) 
	{
		int count = 1;
		int[] b = new int[count];

		
			for (int i = 0; i < a.length; i++) 
			{
				int j = 0;
				if (a[i] % 2 == 0) 
				{
					b[j] = a[i];
					System.out.println(b[j]);
					j++;
					count++;
				}
			}
		
		return b;
	}
}
