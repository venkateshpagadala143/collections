package com.ojas.strings;

import java.util.Scanner;

public class CheckfirstLetCapital {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String word = sc.next();
		checkCaps(word);
	}

	private static void checkCaps(String word) {
		char wordchars[] = word.toCharArray();
		if (Character.isUpperCase(wordchars[0])) {
			System.out.println("The first letter is captial");
		} else {
			System.out.println("The first letter is not captial");
		}

	}

}
