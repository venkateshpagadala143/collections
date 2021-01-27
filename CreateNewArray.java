package com.ojas;

import java.util.Arrays;
import java.util.Scanner;

public class CreateNewArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start and End Elements");
		int start = sc.nextInt();
		int end = sc.nextInt();
		if (end - start <= 2) {
			System.out.println("Array is invalid");

		} else {
			createNewArray(start, end);

		}

	}

	private static void createNewArray(int start, int end) {
		int tempstart=start;
		int newarr[] = new int[(end - start)];
		for (int index = 0; index < newarr.length; index++) {
			newarr[index] = start;
			start++;

		}
		System.out.println("the array between "+tempstart+ " , "+end);
		System.out.println(Arrays.toString(newarr));
		

	}

}
