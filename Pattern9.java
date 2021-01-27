package com.ojas;

public class Pattern9 {
	public static void main(String[] args) {
		isPattern();

	}

	private static void isPattern() {
		char num = 'A';
		for (int rows = 1; rows <= 5; rows++) {
			for (int coloms = 1; coloms <= rows; coloms++) {
				System.out.print(num++ + " ");

			}
			System.out.println();

		}

	}

}
