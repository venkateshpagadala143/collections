package com.ojas.strings;

import java.util.Scanner;

public class CheckIfStringContainsDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String word = sc.nextLine();
		is_FindDig(word);

	}

	private static void is_FindDig(String word) {
		for (int index = 0; index < word.length(); index++) {
			if (Character.isDigit(word.charAt(index))) {
				System.out.print(word.charAt(index));
			}

		}

	}

}
