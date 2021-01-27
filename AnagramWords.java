package com.ojas.string;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word1 and Word2");
		String word1 = sc.next();
		String word2 = sc.next();
		// without using Arrays.sort method
		findAnagrams(word1, word2);
		// using Arrays.sort method
		if(againfindAnagrams(word1, word2)) {
			System.out.println("Anagrams");
		}else {
			System.out.println("Not Anagrams");
		}
	}

	private static boolean againfindAnagrams(String word1, String word2) {
		if (word1.length() == word2.length()) {
			char[] ch1 = word1.toCharArray();
			char[] ch2 = word2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			int count = 0;
			for (int index = 0; index < word1.length(); index++) {
				if (ch1[index] != ch2[index]) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;

	}

	private static void findAnagrams(String word1, String word2) {
		if (word1.length() == word2.length()) {
			String modword = word2;

			for (int index = 0; index < word1.length(); index++) {
				for (int j = 0; j < word2.length(); j++) {
					if (word1.charAt(index) == word2.charAt(j)) {
						modword = modword.replace(modword.charAt(j), 'x');
					}
				}
			}

			int count = 0;
			for (int i = 0; i < modword.length(); i++) {
				if (modword.charAt(i) == 'x') {
					count++;
				}
			}
			if (count == word2.length()) {
				System.out.println("Anagrams");
			}
		} else
			System.out.println("Not Anagrams");
		{

		}

	}

}
