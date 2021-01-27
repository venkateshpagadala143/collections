package com.ojas;

public class Pattern13 {
	public static void main(String[] args) {
		findPattern();
	}

	private static void findPattern() {
		int start = -1;
		for (int rows = 1; rows <= 4; rows++) {
			start += 2;
			for (int space = 1; space < 5 - rows; space++) {
				System.out.print(" ");
			}
			for (int cols = 1; cols <= start; cols++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
