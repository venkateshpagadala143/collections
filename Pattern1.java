package com.ojas;

public class Pattern1 {
	public static void main(String[] args) {
		isPatern();
	}

	private static void isPatern() {
		for (int rows = 1; rows <= 5; rows++) {
			for (int coloms = 1; coloms <= 5; coloms++) {
				System.out.print(coloms + " ");

			}
			System.out.println();
		}
	}
		
	}


