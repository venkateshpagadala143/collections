package com.ojas;

public class Pattern11 {
	public static void main(String[] args) {
		isPattern();
	}

	private static void isPattern() {
		for (int rows = 0; rows <= 5; rows++) {
			for (int coloms = 0; coloms <= rows; coloms++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
