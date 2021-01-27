package com.ojas;

public class Pattern8 {
	public static void main(String[] args) {

		isPattern();

	}

	private static void isPattern() {
		int num;
		for (int rows = 1; rows <= 5; rows++) {
			num = rows;
			for (int coloms = 1; coloms <= rows; coloms++) {
				System.out.print(num++ + " ");
			}
			System.out.println();

		}

	}

}
