package com.ojas;

public class Pattern4 {
	public static void main(String[] args) {
		isPattern();
	}

	private static void isPattern() {
		for(int rows=1;rows<=5;rows++) {
			for(int coloms=1;coloms<=rows;coloms++) {
				System.out.print(coloms+" ");
			}
			System.out.println();
		}
		
	}

}

