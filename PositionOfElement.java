package com.String;

import java.util.Scanner;

public class PositionOfElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int size = sc.nextInt();
		int inputArr[] = new int[size];
		System.out.println("Enter you Array Elements");
		for (int i = 0; i < inputArr.length; i++) {
			inputArr[i] = sc.nextInt();
		}
		System.out.println("Enter your serch number");
		int serchNum = sc.nextInt();
		int indexvalue = gerPositionOfElement(inputArr, serchNum);
		System.out.println(indexvalue);

	}

	private static int gerPositionOfElement(int[] inputArr, int serchNum) {

		if (inputArr.length < 1) {
			return -2;
		} else if (serchNum <= 0) {
			return -3;
		}
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] <= 0) {
				return -4;
			} else if (inputArr[i] == serchNum) {
				return i;
			}
		}
		return -1;

	}

}
