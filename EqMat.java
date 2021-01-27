package com.ojas.TwoDiamentionalArray;

import java.util.Scanner;

public class EqMat 
{
	static int arr[][];
	static int m;
	static int n;

	EqMat(int mm, int nn) 
	{
		m = mm;
		n = nn;
		arr = new int[m][n];
	}

	private static void insertInputArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("insert your arr  elemenrs");
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++) 
			{
				arr[i][j] = sc.nextInt();
			}
		}

	}

	public static void main(String[] args) 
	{
		// int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
		// int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your rows and coloums");
		int r = sc.nextInt();
		int c = sc.nextInt();
		EqMat arr1 = new EqMat(r, c);
		EqMat arr2 = new EqMat(r, c);
		EqMat.insertInputArray();
		EqMat.insertInputArray();
		System.out.println("Print first Array");
		arr1.readArray();
		System.out.println("Print second Array");
		arr2.readArray();
		if (check(arr1, arr2)) 
		{
			System.out.println("Both Arrays are Equal");

		} else
			System.out.println("Both Arrays are notEqual");

	}

	private static boolean check(EqMat arr1, EqMat arr2)
	{
		boolean flag = true;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (EqMat.arr[i][j] != EqMat.arr[i][j])
				{
					return false;

				}

			}
		}
		return flag;
	}

	private void readArray() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
