package com.ojas.string;

import java.util.Scanner;

public class PrintVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any name");
		String name = sc.next();
		printVowels(name);
	}

	private static void printVowels(String name) {

		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
					ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U') {
				System.out.println(name.charAt(index));
			} else {

			}
		}

	}

}
