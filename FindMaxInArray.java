package com.ojas.TwoDiamentionalArray;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class FindMaxInArray {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input Array");
		int[] inputArray = new int[10];
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = s.nextInt();
		}
		if(inputArray.length!=10) {
			
			int max=findMax(inputArray);
			System.out.println("Smallest number in given Array is :" + max);
		}else {
			System.out.println("-1");
		}
	}

	private static int findMax(int[] inputArray) {

		int min = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (min < inputArray[i]) {
				min = inputArray[i];
			}
		}
		return min;

	}

}
