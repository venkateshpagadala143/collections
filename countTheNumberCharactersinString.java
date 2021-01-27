package com.Strings;

import java.util.Scanner;

public class countTheNumberCharactersinString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any word here");
		String word = sc.nextLine();
		System.out.println("Enter which Character count you want");
		String cha = sc.next();
		findCountOfChar(word, cha);

	}

	private static void findCountOfChar(String word, String cha) {
		int count = 0;
		if (cha.length() == 1) {
			for (int index = 0; index < word.length(); index++) {
				if (word.charAt(index) == cha.charAt(0)) {
					count++;
				}

			}
			if (count == 0) {
				System.out.println("the Given character is not in String");
			} else {
				System.out.println("The count of character '" + cha.charAt(0) + "' is : " + count);
			}
		} else {
			System.out.println("Please Enter a valid Character");
		}

	}
}