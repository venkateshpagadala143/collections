package com.String;

import java.util.Scanner;

public class MaxVaLueArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter your Elements here");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findMax(arr));

	}

	private static int findMax(int[] arr) {
		int count = 0;
		int max;
		if (arr.length < 1) {
			return 0;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				count++;
			}
		}
		if (count >= 3) {
			 max=findMAx(arr);
		} else {
			return -1;
		}
		return max;

	}

	private static int findMAx(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;

	}

}
