package com.ojas.TwoDiamentionalArray;

import java.util.Scanner;

public class MatrixMultiplication {
	private static int[][] insertInputArray1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Arr1 rows size");
		int arr1rows = sc.nextInt();
		System.out.println("Enter Arr1 rows size");
		int arr1colom = sc.nextInt();

		int arr1[][] = new int[arr1rows][arr1colom];

		System.out.println("insert your arr1  elemenrs");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) 
			{
				arr1[i][j] = sc.nextInt();
			}
		}

		return arr1;
	}

	private static int[][] insertInputArray2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Arr2 rows size");
		int arr2rows = sc.nextInt();
		System.out.println("Enter Arr2 rows size");
		int arr2colom = sc.nextInt();
		int arr2[][] = new int[arr2rows][arr2colom];
		System.out.println("insert your arr2  elemenrs");

		for (int i = 0; i < arr2.length; i++)
		{
			for (int j = 0; j < arr2[i].length; j++)
			{
				arr2[i][j] = sc.nextInt();
			}
		}

		return arr2;
	}
	public static void main(String[] args) {
		int [][]arr1=insertInputArray1();
		int [][]arr2=insertInputArray2();
		//int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		//int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int arr3[][] = new int[3][3];
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++)
			{
				arr3[i][j] = 0;
				for (int k = 0; k < 3; k++)
				{
					arr3[i][j] += arr1[i][k] * arr2[k][j];
				}
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}

	
}
