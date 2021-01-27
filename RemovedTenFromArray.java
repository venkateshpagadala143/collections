package com.ojas;

import java.util.Arrays;
import java.util.Scanner;

public class RemovedTenFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		System.out.println("Enter your array elements");
		int inputarr[] = new int[size];
		for (int index = 0; index < inputarr.length; index++) {
			inputarr[index] = sc.nextInt();
		}
		getRemovedTensFromArray(inputarr);
		System.out.println(Arrays.toString(inputarr));

	}

	private static void getRemovedTensFromArray(int[] inputarr) {

		int count1 = 0;

		for (int i = 0; i < inputarr.length; i++) {
			if (inputarr[i] == 10) {
				inputarr[i] = 0;
				count1++;
			}
		}
		System.out.println(count1);
		for (int j = 0; j <= count1; j++) {

			int tencount = 0;
			int count = 0;
			int temp = 0;

			for (int index = 0; index < inputarr.length; index++) {
				if (inputarr[index] == 0) {
					tencount = index;
					break;
				}

			}
			for (int chek = tencount; chek < inputarr.length; chek++) {
				if (inputarr[chek] != 0) {
					count = chek;
					break;
				}

			}
			temp = inputarr[tencount];
			inputarr[tencount] = inputarr[count];
			inputarr[count] = temp;

		}
	}

}
