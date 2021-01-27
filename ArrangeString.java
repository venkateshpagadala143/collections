package com.ojas.ArrengeString;

import java.lang.Character.Subset;
import java.util.Scanner;

public class ArrangeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you word1 and word2");
		String word1 = sc.next();
		String word2 = sc.next();
		getArrengeString(word1, word2);

	}

	private static void getArrengeString(String word1, String word2) {
		String res = "";
		int word1len = word1.length();
		int word2len = word2.length();
		int ch1 = word1.charAt(0);
		int ch2 = word2.charAt(0);

		if (ch1 < ch2) {
			res += word1len + word2len;
			res += "\nNo";
			char caps = Character.toUpperCase(word1.charAt(0));
			word1 = caps + word1.substring(0);

			char caps1 = Character.toUpperCase(word2.charAt(0));
			word2 = caps1 + word2.substring(0);
			res += "\n" + word1 + " " + word2;

		} else {
			res += word1len + word2len;
			res += "\nYes";
			char caps = Character.toUpperCase(word1.charAt(0));
			word1 = caps + word1.substring(0);
			char caps1 = Character.toUpperCase(word2.charAt(0));
			word2 = caps1 + word2.substring(0);
			res += "\n" + word2 + " " + word1;

		}
		System.out.println(res);

	}

}
