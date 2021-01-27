package com.ojas;

import java.util.Scanner;

public class FindWordInSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Sentence here ");
		String sentence = sc.nextLine();
		System.out.println("Enter word is here");
		String word = sc.next();
		findWoordInSenetence(sentence, word);
	}

	private static void findWoordInSenetence(String sentence, String word) {
		String[] words = sentence.split(" ");
		for (int index = 0; index < words.length; index++) {
			if (words[index].equalsIgnoreCase(word)) {
				System.out.println(word + " : founded in given Sentence");
				break;
			}
		}
		System.out.println(word +" :  not founded in given Sentence");

	}

}
