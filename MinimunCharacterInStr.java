package com.Strings;

import java.util.Scanner;

public class MinimunCharacterInStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any Word");
		String word = sc.next();
		findMinimumChar(word);
	}

	private static void findMinimumChar(String word) {
		char ch[] = word.toCharArray();
		char minch = ch[0];
		for (int check = 1; check < ch.length; check++) {
			if (minch > ch[check]) {

				minch = ch[check];
			}

		}
		System.out.println(minch);
	}

}
