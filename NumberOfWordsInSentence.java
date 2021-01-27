package com.ojas;

import java.util.Scanner;

public class NumberOfWordsInSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any sentece");
		String sentence = sc.nextLine();
		getCountTheNumberOfWords(sentence);
	}

	private static void getCountTheNumberOfWords(String sentence) {
		String modsentence = sentence;

		for (int i = 0; i < sentence.length() - 1; i++) {
			if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) == ' ') {
				modsentence = modsentence.replace("  ", " ");

			} else if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) == '.') {
				modsentence = modsentence.replace(" .", ".");
			} else if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) == ',') {
				modsentence = modsentence.replace(" ,", ",");
			} else if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) == '!') {
				modsentence = modsentence.replace(" !", "!");
			} else if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) == '?') {
				modsentence = modsentence.replace(" ?", "?");
			}

		}
		String[] newmodsentence = modsentence.split(" ");
		System.out.println(newmodsentence.length);
	}
}