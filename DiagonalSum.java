package com.ojas.String;

import java.util.Scanner;

public class DiagonalSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and coloms");
		int rows = sc.nextInt();
		int colms = sc.nextInt();
		int inputarr[][] = new int[rows][colms];
		for (int i = 0; i < inputarr.length; i++) {
			for (int j = 0; j < inputarr[0].length; j++) {
				inputarr[i][j] = sc.nextInt();
			}
		}
		int sum = getDiagonalSum(inputarr);
		System.out.println(sum);
	}

	private static int getDiagonalSum(int[][] inputarr) {
		if (inputarr.length == 3 && inputarr[0].length == 3) {
			int sum = 0;
			for (int i = 0; i < inputarr.length; i++) {
				sum += inputarr[i][i];
				return sum;
			}
		}
		return -1;
	}
}