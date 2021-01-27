package com.Strings;

import java.util.Scanner;

public class CheckStringAlphaNumric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter Any String here");
		String word = sc.nextLine();

		System.out.println(checkStrAlphaNumaric(word));
	}

	private static boolean checkStrAlphaNumaric(String word) {
		int count = 0;
		int numcount=0;
		for (int index = 0; index < word.length(); index++) {
			if (Character.isAlphabetic(word.charAt(index))) {
				count++;

			} else if (Character.isDigit(word.charAt(index))) {
				numcount++;
			}
		}
		if (word.length() == (count+numcount)&&count!=0&&numcount!=0) {
			return true;
		} else {
			return false;
		}

	}

}
