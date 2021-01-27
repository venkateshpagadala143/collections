package com.ojas.strings;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class NoOfCharInAstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String name");
		String word = sc.nextLine();
		is_countOfChar(word);

	}

	private static void is_countOfChar(String word) {
		int count = 0;
		for (int index = 0; index < word.length(); index++) {

			if (Character.isAlphabetic(word.charAt(index))) {
				count++;
			}

		}
		System.out.println("character count = "+count);
	}
	
}
