package com.ojas.String;

import java.util.Scanner;

public class ArrayElementCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		int numarr[] = new int[size];
		System.out.println("Enter Array Elements");
		for (int num = 0; num < numarr.length; num++) {
			numarr[num] = sc.nextInt();

		}
		System.out.println("Enter search Element");
		int searchnum = sc.nextInt();
		int count = getCount(numarr, searchnum);

		System.out.println(count);
	}

	private static int getCount(int[] numarr, int searchnum) {
		if (numarr.length < 1) {
			return -1;
		}
		int count = 0;
		for (int index = 0; index < numarr.length; index++) {

			if (numarr[index] == searchnum) {
				count++;
			}
		}
		if (count == 0) {
			return -1;
		} else {
			return count;

		}
	}
}
