package com.Strings;

import java.util.Scanner;

public class CheckIfStringContainsAlphabetsOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any word");
		String word = sc.next();
		checkString(word);

	}

	private static void checkString(String word) {
		int count = 0;
		for (int index = 0; index < word.length(); index++) {
			if (Character.isAlphabetic(index)) {
				count++;
			}

		}
		if(word.length()==count) {
			System.out.println("given word is contain all alphabets");
		}else
		{
			System.out.println("given word does not contain all alphabets");
		}
	}

}
