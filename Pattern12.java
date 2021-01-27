package com.ojas;

public class Pattern12 {
	public static void main(String[] args) {
		isPattern();
	}

	private static void isPattern() {
		for(int rows=1;rows<=5;rows++) {
			for(int coloms=1;coloms<=5;coloms++) {
				if(rows==1||rows==5||coloms==1||coloms==5)
				{
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
